package heap;

import static java.util.Collections.swap;

import java.util.ArrayList;
import java.util.List;

/*
like binary search tree but
each node has a value that is grater than its descendent, so the max value will always be on the top (max heap). Itc could be a min heap
can have duplicates
it has to be complete
implemented using linked list(ll is a graph)

using index 0
leftChild = 2 * parentIndex + 1
rightChild = 2 * parentIndex + 2;
parentIndex = (index - 1) / 2

O(log n)

perfect structure for priority queue, cause its always balanced (complete)

heap in ds != heap of SO (where objects are allocated in memory)
 */
public class Heap {
	private List<Integer> heap;

	public Heap() {
		this.heap = new ArrayList<>();
	}

	private int leftChild(int index) {
		return 2 * index + 1;
	}

	private int rightChild(int index) {
		return 2 * index + 2;
	}

	private int parent(int index) {
		return (index - 1) / 2;
	}

	public void insert(int val) {
		heap.add(val);
		int current = heap.size() - 1;

		while(current > 0 && heap.get(current) > heap.get(parent(current))) {
			swap(heap, current, parent(current));
			current = parent(current);
		}
	}

	//remove only top node, make tree complete again
	public Integer remove() {
		if(heap.size() == 0) {
			return null;
		}
		if(heap.size() == 1) {
			return heap.remove(0);
		}
		int maxValue = heap.get(0);
		//last val is now first val, also remove last val
		heap.set(0, heap.remove(heap.size() - 1));
		sinkDown(0);

		return maxValue;
	}

	private void sinkDown(int index) {
		int maxIndex = index;
		while(true) {
			int leftIndex = leftChild(index);
			int rightIndex = rightChild(index);
			if(heap.get(leftIndex) > heap.get(maxIndex)) {
				maxIndex = leftIndex;
			}
			if(heap.get(rightIndex) > heap.get(maxIndex)) {
				maxIndex = rightIndex;
			}
			if(maxIndex != index) {
				swap(heap, index, maxIndex);
				index = maxIndex;
			} else {
				return;
			}
		}
	}

	public List<Integer> getHeap() {
		//return copy
		return new ArrayList<>(this.heap);
	}

}
