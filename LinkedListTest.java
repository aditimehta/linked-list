import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

	@Test
	public void testReverseAnEmptyLinkedList() {
		LinkedList linkedList = new LinkedList();
		Node reversedLinkedListNode = linkedList.revserseList(linkedList.getRootNode());
		LinkedList reveresedLinkedList = new LinkedList(reversedLinkedListNode);
		LinkedList expectedLinkedList = new LinkedList();
		assertNull(reversedLinkedListNode);
		assertEquals(expectedLinkedList, reveresedLinkedList);
	}
	
	@Test
	public void testReverseLinkedListWithOneElement() {
		LinkedList linkedList = new LinkedList();
		linkedList.add(1);
		Node reversedLinkedListNode = linkedList.revserseList(linkedList.getRootNode());
		LinkedList reveresedLinkedList = new LinkedList(reversedLinkedListNode);
		
		LinkedList expectedLinkedList = new LinkedList();
		expectedLinkedList.add(1);
		
		assertEquals(expectedLinkedList, reveresedLinkedList);
	}
	
	@Test
	public void testReverseLinkedListWithMultipleElements() {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		Node reversedLinkedListNode = linkedList.revserseList(linkedList.getRootNode());
		LinkedList reveresedLinkedList = new LinkedList(reversedLinkedListNode);
		
		LinkedList expectedLinkedList = new LinkedList();
		expectedLinkedList.add(4);
		expectedLinkedList.add(3);
		expectedLinkedList.add(2);
		expectedLinkedList.add(1);
		
		assertEquals(expectedLinkedList, reveresedLinkedList);
		
	}
	
}
