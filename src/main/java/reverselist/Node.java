package reverselist;

public class Node {
	Node next;
	int value;
	
	public Node(int value){
		this.value = value;
		this.next = null;
	}
	
	public Node(int value, Node next){
		this.value = value;
		this.next = next;
	}
}
