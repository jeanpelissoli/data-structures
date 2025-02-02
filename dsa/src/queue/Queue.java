package queue;

//FIFO - FIRST IN FIRST OUT

public class Queue<T> {
	private Node first;
	private Node last;
	private int length;

	class Node {
		T val;
		Node next;

		Node(T val) {
			this.val = val;
		}
	}

	public Queue(T val) {
		Node node = new Node(val);
		this.first = node;
		this.last = node;
		this.length = 1;
	}

	public void enqueue(T val) {
		
	}

	public void print() {
		Node temp = this.first;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

}
