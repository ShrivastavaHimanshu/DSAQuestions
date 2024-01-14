package com.himanshu.bitmanipulation;

public class SubarraysWithBitWiseZero {

	public static void main(String[] args) {
		int[] a = { 1, 0, 0 };
		int n = 3;
		long ans = solve(a, n);
		System.out.println("ans is :" + ans);

	}

	public static long solve(int[] arr, int n) {
		long zeroCount = 0, temp = 0;
		long totalSubArray = (long) n * (n + 1) / 2;
		for (int i = 0; i < n; i++) {

			if (arr[i] == 0) {
				temp++;
				zeroCount = zeroCount + temp;
			} else {
				temp = 0;
			}
		}

		System.out.println("total is :" + totalSubArray + " zero Count :" + zeroCount);
		long ans = totalSubArray - zeroCount;
		return ans;
	}

}
