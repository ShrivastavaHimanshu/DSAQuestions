package com.himanshu.basic.array.subArrays;

import java.math.BigDecimal;

public class LeastAverageOfSubArray {

	public static void main(String[] args) {
		int[] a = { 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 };
		int b = 9;
		int ans = solve(a, b);
		System.out.println("ans is :" + ans);

	}

	public static int solve(int[] a, int b) {
		int n = a.length, index = 0;
		Double ans = Double.MAX_VALUE;
		System.out.println("big : " + 78 / 9);
		int j = b - 1;
		int[] prefixSum = prefixSum(a);
		for (int i = 0; i <= n - b; i++) {
			Double tempAns = 0.00;
			if (i == 0) {
				tempAns = ((double) prefixSum[j] / b);
			} else {
				tempAns = ((double) (prefixSum[j] - prefixSum[i - 1]) / b);
			}
			System.out.println(" avg for index" + i + " with value" + tempAns);
			j++;

			if (tempAns < ans) {
				System.out.println("count++ssss");
				ans = tempAns;
				index = i;
			}

		}
		return index;
	}

	public static int[] prefixSum(int[] a) {
		int n = a.length;
		int[] prefixSum = new int[n];
		prefixSum[0] = a[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + a[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(prefixSum[i] + " ");
		}
		System.out.println();
		return prefixSum;
	}

}
