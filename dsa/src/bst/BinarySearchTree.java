package bst;

/*
big O:
2^n - 1 -> n being the trees height, remove 1: 2^n -> I(log(n)) -> divide and conqueer
if tree never forks, it would be essentially a linked list: O(n): real big O: O(n)
 */

public class BinarySearchTree {
	private Node root;

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}

	public void insert(int val) {
		this.root = insertRec(this.root, val);
	}

	private Node insertRec(Node rootFixed, int val) {
		if(rootFixed == null) {
			return new Node(val);
		}
		if(val < rootFixed.val) {
			rootFixed.left = insertRec(rootFixed.left, val);
		} else if(val > rootFixed.val) {
			rootFixed.right = insertRec(rootFixed.right, val);
		}
		return rootFixed;
	}

	public void inOrderTraversal() {
		this.inOrderRec(this.root);
		System.out.println();
	}

	private void inOrderRec(Node root) {
		if (root != null) {
			inOrderRec(root.left);
			System.out.print(root.val + " ");
			inOrderRec(root.right);
		}
	}
}
