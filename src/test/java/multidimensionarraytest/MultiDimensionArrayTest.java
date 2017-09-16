package multidimensionarraytest;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Test;

import multidimensionarraysum.MultiDimensionArray;

public class MultiDimensionArrayTest {

	MultiDimensionArray multiDimensionArray = new MultiDimensionArray();

	@Test
	public void test() {
		int[] sizes = new int[1];
		Object multiDimArray = Array.newInstance(Integer.class, sizes);
		multiDimensionArray.getValue(multiDimArray, sizes);
		multiDimensionArray.sum(multiDimArray,sizes );
		assertNotEquals((MultiDimensionArray.totalSum.longValue()), null);
	}
	
	@Test
	public void test2() {
		int[] sizes = new int[100];
		Object multiDimArray = Array.newInstance(Integer.class, sizes);
		multiDimensionArray.getValue(multiDimArray, sizes);
		multiDimensionArray.sum(multiDimArray,sizes );
		assertNotEquals((MultiDimensionArray.totalSum.longValue()), null);
	}

}
