package multidimensionarraysum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Time complexity : O(m*n) Space complexity :O(m*n)
 * 
 * @author hardik thakkar
 *
 */
public class MultiDimensionArray {

	public static Long totalSum = (long) 0;

	/**
	 * Traverse through all index
	 * @param arr dimension of array
	 * @return
	 */
	public static int[] tail(int[] arr) {
		return Arrays.copyOfRange(arr, 1, arr.length);
	}

	/**
	 * set value to multidimensional array
	 * @param array multidimensional array
	 * @param sizes dimension of array
	 */
	public static void getValue(Object array, int... sizes) {
		for (int i = 0; i < sizes[0]; i++)
			if (sizes.length == 1)
				((Integer[]) array)[i] = i;
			else
				getValue(Array.get(array, i), tail(sizes));
	}

	/**
	 * Do addition of all elements and return sum
	 * @param array multidimensional array
	 * @param sizes array dimension
	 */
	public static void sum(Object array, int... sizes) {
		for (int i = 0; i < sizes[0]; i++)
			if (sizes.length == 1)
				totalSum += ((Integer[]) array)[i];
			else
				sum(Array.get(array, i), tail(sizes));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of dimension:");
		int dims = scanner.nextInt();
		scanner.close();
		Random r = new Random();

		// Randomly choose array lengths (1, 2 or 3) at runtime.
		int[] sizes = new int[dims];
		for (int i = 0; i < sizes.length; i++)
			sizes[i] = 1 + r.nextInt(4);

		// Create array
		System.out.println("Creating array with dimensions / sizes: " + Arrays.toString(sizes).replaceAll(", ", "]["));
		Object multiDimArray = Array.newInstance(Integer.class, sizes);

		// Fill with some
		getValue(multiDimArray, sizes);
		// Print multidimensional array
		System.out.println(Arrays.deepToString((Object[]) multiDimArray));
		// sum all the value from multidimensional array
		sum(multiDimArray, sizes);

		System.out.println("Sum of all elements is:-" + totalSum);
	}

}
