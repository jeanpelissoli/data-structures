package hashtable;

import java.util.ArrayList;

public class HashTable {
	private int size = 7;
	private Node[] dataMap;

	class Node {
		String key;
		int val;
		Node next;

		Node(String key, int val) {
			this.key = key;
			this.val = val;
		}
	}

	public HashTable() {
		this.dataMap = new Node[this.size];
	}

	private int hash(String key) {
		int hash = 0;
		char[] keyChars = key.toCharArray();
		for(int i = 0; i < keyChars.length; i++) {
			int asciiVal = keyChars[i];
			hash = (hash + asciiVal * 23) % this.dataMap.length;
		}
		return hash;
	}

	public void set(String key, int val) {
		int index = this.hash(key);
		Node node = new Node(key, val);
		if(this.dataMap[index] == null) {
			this.dataMap[index] = node;
		} else {
			Node temp = this.dataMap[index];
			if(temp.key == key) {
				temp.val += val;
				return;
			}
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public int get(String key) {
		int index = this.hash(key);
		Node temp = this.dataMap[index];
		while(temp.key != key) {
			temp = temp.next;
		}
		return temp.val;
	}

	public ArrayList<String> keys() {
		ArrayList<String> allKeys = new ArrayList<>();
		for(int i = 0; i < this.dataMap.length; i++) {
			Node temp = this.dataMap[i];
			while(temp != null) {
				allKeys.add(temp.key);
				temp = temp.next;
			}
		}
		return allKeys;
	}

	public void print() {
		for(int i = 0; i < dataMap.length; i++) {
			System.out.println(i + ":");
			Node temp = dataMap[i];
			while(temp != null) {
				System.out.println("   {" + temp.key + "= " + temp.val + "}");
				temp = temp.next;
			}
		}
	}

}
