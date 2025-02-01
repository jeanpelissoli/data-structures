package linkedList;

/*
Big O:
append: O(1);
removeLast: O(n);
prepend: O(1);
removeFirst: O(1);
insert: O(n);
remove: O(n);
lookUps: O(n);
 */


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
		Node node = new Node(val);
		if(length == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.length++;
	}

	public void prepend(int val) {
		Node node = new Node(val);
		if(this.length == 0) {
			this.head = node;
			this.tail = node;
		} else {
			node.next = this.head;
			this.head = node;
		}
		this.length++;

	}

	public boolean insert(int index, int val) {
		if(index < 0 || index > this.length) return false;
		if(index == 0) {
			this.prepend(val);
			return true;
		}
		if(index == this.length) {
			this.append(val);
			return true;
		}
		Node node = new Node(val);
		Node temp = head;
		for(int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		this.length++;
		return true;
	}

	public Node remove(int index) {
		if(index < 0 || index >= length) return null;
		else if(index == 0) {
			this.removeFirst();
		} else if(index == this.length - 1) {
			this.removeLast();
		}
		Node pre = this.get(index - 1);
		Node temp = pre.next;
		pre.next = temp.next;
		temp.next = null;
		this.length--;
		return temp;
	}

	public Node get(int index) {
		if(index < 0 || index >= length) return null;
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public boolean set(int index, int val) {
		Node temp = this.get(index);
		if(temp != null) {
			temp.val = val;
			return true;
		}
		return false;
	}

	public Node removeLast() {
		if(this.length == 0) return null;
		Node temp = head;
		Node pre = temp;
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		this.tail = pre;
		this.tail.next = null;
		this.length--;
		if(this.length == 0) {
			this.head = null;
			this.tail = null;
		}
		return temp;
	}

	public Node removeFirst() {
		if(this.length == 0) return null;
		Node temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.length--;
		if(this.length == 0) {
			this.head = null;
			this.tail = null;
		}
		return temp;
	}

	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public void getTail() {
		System.out.println("Tail: " + this.tail.val);
	}

	public void getHead() {
		System.out.println("Head: " + this.head.val);
	}

	public void getLength() {
		System.out.println("Length: " + this.length);
	}
}