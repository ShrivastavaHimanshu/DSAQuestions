package com.himanshu.advanced.arrays;

public class MinimumSwapToBringKtogether {
	public static void main(String[] args) {
		int a[] = { 0 };
		int B = -1000000000;
		int ans = solve(a, B);
		System.out.println("ans is :" + ans);
	}

	public static int solve(int[] A, int B) {
		// frst count the numbers which is less than or equals to B

		int totalCountOfB = 0;
		int n = A.length;
		for (int i = 0; i < n; i++) {
			if (A[i] <= B) {
				totalCountOfB++;
			}
		}

		// If the total Numbers of B is less than or equal to B , no need of swap ..
		// Simply
		if (totalCountOfB <= 1) {
			return 0;
		}

		// Simply form a prefix Array To get the count

		int[] prefiXCount = prefiXCount(A, B);
		int start = 0;
		int end = totalCountOfB - 1;
		int counofBWithinWondow = 0;
		int minSwap = Integer.MAX_VALUE;

		// Forming a widnow and using sliding window technique
		while (start <= (n - totalCountOfB) && end < n) {
			if (start == 0) {
				counofBWithinWondow = prefiXCount[end];
			} else {
				counofBWithinWondow = prefiXCount[end] - prefiXCount[start - 1];
			}
			int swap = totalCountOfB - counofBWithinWondow;

			minSwap = Math.min(minSwap, swap);
			start++;
			end++;
		}
		return minSwap;
	}

	public static int[] prefiXCount(int[] arr, int B) {
		int[] prefiXCount = new int[arr.length];
		if (arr[0] <= B) {
			prefiXCount[0] = 1;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= B) {
				prefiXCount[i] = prefiXCount[i - 1] + 1;
			} else {
				prefiXCount[i] = prefiXCount[i - 1];
			}
		}
		return prefiXCount;

	}
}
