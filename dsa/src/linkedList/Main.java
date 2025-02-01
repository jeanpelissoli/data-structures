package linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(10);
		linkedList.append(15);
		linkedList.append(20);
		/*linkedList.print();
		linkedList.getHead();
		linkedList.getTail();
		linkedList.getLength();
		linkedList.removeLast();
		linkedList.print();
		linkedList.getLength();
		linkedList.removeFirst();
		linkedList.print();
		LinkedList.Node node = linkedList.get(2);
		System.out.println(node.val);*/

		linkedList.insert(3, 13);
		linkedList.print();
	}
}