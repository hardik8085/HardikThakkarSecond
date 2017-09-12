package reverselistTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import reverselist.Node;
import reverselist.ReverseLinkedList;

public class ReverseListTest {

	ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

	/**
	 * If linkedlist is null
	 */
	@Test
	public void nullList() {
		Assert.assertNull(reverseLinkedList.reverseList(null));
	}

	/**
	 * if linked list is not null
	 */
	@Test
	public void notNullList() {
		Node root = reverseLinkedList.createLinkedList();
		Assert.assertNotNull(reverseLinkedList.reverseList(root));
	}

	/**
	 * if linkedlist has one element
	 */
	@Test
	public void oneNodeList() {
		Node root = new Node(2);
		Assert.assertEquals(reverseLinkedList.reverseList(root),root);
	}

	
}
