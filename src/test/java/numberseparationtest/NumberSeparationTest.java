package numberseparationtest;

import static org.junit.Assert.*;

import org.junit.Test;

import numberseparation.PossibleSubset;

public class NumberSeparationTest {

	@Test
	public void test() {
		int arr[] = { 1, 3, 5, 5, 2, 1, 1, 6 ,2,1};
		assertEquals(PossibleSubset.isPartitionPossible(arr, arr.length, 3), true);
		
	}
	
	
	@Test
	public void test2() {
		int arr[] = { 1, 3, 5, 5, 2, 1, 1, 6 ,2,1,2};
		assertEquals(PossibleSubset.isPartitionPossible(arr, arr.length, 3), false);
		
	}
	
	
	@Test
	public void test3() {
		int arr[] = { 4,5,5,5,5};
		assertEquals(PossibleSubset.isPartitionPossible(arr, arr.length, 3), false);
		
	}
	
	@Test
	public void nullTest() {
		int arr[] = { };
		assertEquals(PossibleSubset.isPartitionPossible(arr, arr.length, 3), false);
		
	}

}
