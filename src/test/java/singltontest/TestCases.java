package singltontest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import SingltonDesignPattern.Transaction;

public class TestCases {

	
	@Test
	public void singleton(){
		
		Transaction transaction = Transaction.creteTransaction();
		Assert.assertNotNull(transaction);
		Transaction transaction2 = Transaction.creteTransaction();
		assertEquals(transaction, transaction2);
		
	}
}
