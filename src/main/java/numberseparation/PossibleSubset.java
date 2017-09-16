package numberseparation;

/**
 * 
 * Time Complexity O(nlgn) Space Complexity O(n)
 * 
 * @author hardik thakkar
 *
 */
public class PossibleSubset {

	public static void main(String args[]) {
		int arr[] = { 1, 3, 5, 5, 2, 1, 1, 6, 2, 1 };
		if (isPartitionPossible(arr, arr.length, 3)) {
			System.out.println("True");
		} else {
			System.out.println("False");

		}

	}

	public static boolean isPartitionPossible(int arr[], int N, int K) {
		// If K is 1, then complete array is answer
		if (K == 1)
			return true;

		// If total number of subsetitions are more than N, then no division
		// possible

		if (N < K)
			return false;

		// if array sum is not divisible by K then we can't divide
		int sum = 0;
		for (int i = 0; i < N; i++)
			sum += arr[i];
		if (sum % K != 0)
			return false;

		// the sum of each subset should be subset (= sum / K)
		int subset = sum / K;
		int subsetSum[] = new int[K];
		boolean taken[] = new boolean[N];

		// Initialize sum of each subset from 0
		for (int i = 0; i < K; i++)
			subsetSum[i] = 0;

		// mark all elements as not taken
		for (int i = 0; i < N; i++)
			taken[i] = false;

		// initialize first subsubset sum as last element of array and mark that
		// as taken
		subsetSum[0] = arr[N - 1];
		taken[N - 1] = true;
		if (subset < subsetSum[0])
			return false;

		// call recursive method to check K-subsetition condition
		return isPossiblePartitionRecursion(arr, subsetSum, taken, subset, K, N, 0, N - 1);
	}

	static boolean isPossiblePartitionRecursion(int arr[], int subsetSum[], boolean taken[], int subset, int K, int N,
			int curIdx, int limitIdx) {
		if (subsetSum[curIdx] == subset) {
			/*
			 * current index (K - 2) represents (K - 1) subsets of equal sum
			 * last subsetition will already remain with sum 'subset'
			 */
			if (curIdx == K - 2)
				return true;

			// recursive call for next subsetition
			return isPossiblePartitionRecursion(arr, subsetSum, taken, subset, K, N, curIdx + 1, N - 1);
		}

		// start from limitIdx and include elements into current subsetition
		for (int i = limitIdx; i >= 0; i--) {
			if (taken[i])
				continue;
			int tmp = subsetSum[curIdx] + arr[i];

			// if temp is less than subset then only include the element
			// and call recursively
			if (tmp <= subset) {
				taken[i] = true;
				subsetSum[curIdx] += arr[i];
				boolean nxt = isPossiblePartitionRecursion(arr, subsetSum, taken, subset, K, N, curIdx, i - 1);

				taken[i] = false;
				subsetSum[curIdx] -= arr[i];
				if (nxt)
					return true;
			}
		}
		return false;
	}
}
