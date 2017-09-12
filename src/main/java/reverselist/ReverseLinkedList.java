package reverselist;

public class ReverseLinkedList {

	/**
	 * Time complexity : O(n) Space complexity : O(1) because we just need space
	 * of three node to reverse linkedlist
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		Node root = reverseLinkedList.createLinkedList();
		System.out.println("Linked list before reverse");
		reverseLinkedList.display(root);
		root = reverseLinkedList.reverseList(root);
		System.out.println("");
		System.out.println("Linked list after reverse");
		reverseLinkedList.display(root);
	}

	/**
	 * Create linkedlist and return root node
	 * @return
	 */
	public Node createLinkedList() {
		
		Node node5 = new Node(5);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);
		return node1;
	}

	/**
	 * Reverse linked list
	 * 
	 * @param head
	 *            root node of list
	 * @return root node after reverse list
	 */
	public Node reverseList(Node head) {
		
		if(null == head){
			return null;
		}
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;

		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
		return head;
	}

	/**
	 * Print linked list
	 * 
	 * @param head
	 *            root of linked list
	 */
	public void display(Node head) {
		Node currNode = head;
		while (currNode != null) {
			System.out.print("->" + currNode.value);
			currNode = currNode.next;
		}
	}
}
