package linkedList;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;

	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public LinkedList(int val) {
		Node node = new Node(val);
		this.head = node;
		this.tail = node;
		this.length = 1;
	}

	public void append(int val) {

	}

	public void prepend(int val) {

	}

	public boolean insert(int index, int val) {
		return false;
	}

}