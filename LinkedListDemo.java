
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		
		System.out.print("Normal Linked List: ");
		System.out.println(linkedList.toString());
		
		Node rootNodeOfReveresedList = linkedList.revserseList(linkedList.getRootNode());
		LinkedList reversedLinkedList = new LinkedList(rootNodeOfReveresedList);

		System.out.print("Reversed Linked List:");
		System.out.println(reversedLinkedList.toString());
	}

}
