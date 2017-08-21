
/**
 * Single LinkedList implementation using {@link Node}
 */
public class LinkedList {
	
	/** Root Node of LinkedList **/
	private Node rootNode;
	
	/** Constant for display arrow string **/
	private static final String ARROW_DISPLAY_STRING = " -> ";
	
	public LinkedList() {
		super();
	}
	
	public LinkedList(Node rootNode) {
		super();
		this.rootNode = rootNode;
	}

	/**
	 * This method is used to find out if linkedList is empty or not.
	 * @return true if linkedList is empty.
	 * 		   false if linkedList is not empty.
	 */
    public boolean isEmpty() {
        return rootNode == null;
    }
    
    /**
     * This method is used to get Length of Linked List
     * @return length of linked list
     */
    public int length() {
    	if(isEmpty()) {
    		return 0;
    	}
    	
    	Node head = rootNode;
    	int count = 1;
    	
    	while(head.getNext() != null) {
    		head = head.getNext();
    		count++;
    	}
    	return count;
    }
    
    /**
     * This method is used to insert element at first position in the linkedList.
     * @param value Value at that node.
     */
    public void insertAtStart(int value) {
    	Node node = new Node(value, rootNode);
    	rootNode = node;
    }
    
    /**
     * This method is used to add element at the end of linked list.
     * @param value Value at that node.
     */
    public void add(int value) {
    	Node node = new Node(value, null);
    	if(isEmpty()) {
        	rootNode = node;
    	}
    	else {
        	Node start = rootNode;
    		while(start.getNext() != null) {
    			start = start.getNext();
    		}
    		start.setNext(node); 
    	}
    }

    /**
     * This method is used to reverse the list
     * @param head Start node of list
     * @return Root node of reversed list
     */
    public Node revserseList(Node head) {
    	Node reversedPart = null;
    	Node current = head;
    	while (current != null) {
    	    Node next = current.getNext();
    	    current.setNext(reversedPart);
    	    reversedPart = current;
    	    current = next;
    	}
    	head = reversedPart;
    	return head;
    }
    
    public Node getRootNode() {
    	return rootNode;
    }
    
    @Override
    public String toString() {
    	StringBuilder builder = new StringBuilder();
    	if(isEmpty()) {
    		builder.append(rootNode);
    	}
    	else {
    		Node headNode = rootNode;
    		builder.append(headNode.getValue());
    		builder.append(ARROW_DISPLAY_STRING);
    		while(headNode.getNext() != null) {
    			headNode = headNode.getNext();
    			builder.append(headNode.getValue());
    			builder.append(ARROW_DISPLAY_STRING);
    		}
    		builder.append(headNode.getNext());
    	}
    	return builder.toString();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rootNode == null) ? 0 : rootNode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedList other = (LinkedList) obj;
		if (rootNode == null) {
			if (other.rootNode != null)
				return false;
		}
		if(isEmpty() && other.isEmpty()) {
			return true;
		}
		else if(length() == 1 && other.length() == 1) {
			return rootNode.getValue() == other.rootNode.getValue();
		}
		else {
			if(rootNode != null && other.rootNode != null) {
				if(length() == other.length()) {
					Node firstListRootNode = rootNode;
					Node secondListRootNode = other.rootNode;
					boolean allElementsAreEqual = false;
					while(firstListRootNode.getNext() != null) {
						if(firstListRootNode.getValue() == secondListRootNode.getValue()) {
							firstListRootNode = firstListRootNode.getNext();
							secondListRootNode = secondListRootNode.getNext();
							allElementsAreEqual = true;
							continue;
						}
						allElementsAreEqual = false;
						break;
					}
					return allElementsAreEqual;
				}
			}
		}
		return false;
	}

    

	
    
}
