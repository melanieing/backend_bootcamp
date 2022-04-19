package myLinkedList;

public class MyLinkedList implements MyList {

	private int size = 0;
	private static final int ERROR = -1;

	private static class Node {
		private Object value;
		private Node nextLink;
		
		Node(Object value, Node next) {
			this.value = value;
			this.nextLink = next;
		}	
	}
	
	private Node head;
	
	public MyLinkedList() { }
	
	public boolean indexCheck(int index) {
		return (0 <= index && index < size) ? true : false;
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public boolean add(Object obj) {
		if (head == null) {
			head = new Node(obj, null);
			size++;
			return true;
		}
		Node tmp = head;
		while (tmp.nextLink != null) {
			tmp = tmp.nextLink;
		}
		tmp.nextLink = new Node(obj, null);
		size++;
		return true;
	}
	
	@Override
	public boolean add(int index, Object obj) {
		if (!indexCheck(index)) {
			return false;
		}
		Node tmp1 = head;
		
		if (index == 0) {
			Node tmp2 = tmp1;
			head = new Node(obj, null);
			head.nextLink = tmp2;
			size++;
			return true;
		}
		tmp1 = nodeOf(index);
		nextNodeInsert(tmp1, obj);
		size++;
		return true;
	}
	
	public Object getValue(int index) {
		if (index < 0 || index >= size) {
			return ERROR;
		}
		Node result = null;
		Node tmp = head;
		tmp = nodeOf(index);
		result = tmp;
		return result.value;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("MyLinkedList [");
		Node tmp = head;
		while (tmp != null) {
//			if (tmp == tail) {
//				result.append(tmp.value);
//				break;
//			}
			result.append(tmp.value + ", ");
			tmp = tmp.nextLink;
		}
		result.append("]");
		return result.toString();
	}
	
	private Node nodeOf(int index) {
		Node tmp = head;
		for (int i = 0; i < index - 1; i++) {
			tmp = tmp.nextLink;
		}
		return tmp;
	}
	
	private void nextNodeInsert(Node currNode, Object nextValue) {
		Node tempNode = currNode.nextLink;
		currNode.nextLink = new Node(nextValue, null);
		currNode.nextLink.nextLink = tempNode;
	}
	
}
