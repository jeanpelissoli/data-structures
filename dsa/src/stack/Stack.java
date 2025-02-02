package stack;

public class Stack<T> {
	private Node top;
	private int height;

	class Node<T> {
		T val;
		Node next;

		Node(T val) {
			this.val = val;
		}
	}

	public Stack(T val) {
		Node node = new Node(val);
		this.top = node;
		this.height = 1;
	}

	public void push(T val) {
		Node node = new Node(val);
		if(height == 0) {
			top = node;
		} else {
			node.next = this.top;
			this.top = node;
		}
		this.height++;
	}

	public Node pop() {
		if(height == 0) return null;
		Node temp = this.top;
		this.top = this.top.next;
		this.height--;
		return temp;
	}

	public void print() {
		Node temp = this.top;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
