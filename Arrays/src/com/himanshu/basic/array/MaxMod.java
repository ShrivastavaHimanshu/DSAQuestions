package com.himanshu.basic.array;

public class MaxMod {

	public static void main(String[] args) {
		int [] a = {5, 5, 5, 5, 5};
		int ans = solve(a);
		System.out.println("ans is :" + ans);

	}

	public static int solve(int[] arr) {
		int n = arr.length, maxMod = 0, j = 0, max = Integer.MIN_VALUE;
		int secondMax = 0;
		for (int i = 0; i < n; i++) {

			max = Integer.max(max, arr[i]);

		}System.out.println("max is :" + max);
		for (int i = 0; i < n; i++) {
			if (arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}

		}System.out.println("second max :" + secondMax);
		return secondMax % max;
	}

}
