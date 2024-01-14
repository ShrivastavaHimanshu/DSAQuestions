package com.himanshu.advanced.arrays;

import java.util.HashSet;

public class CountOfDivisors {

	public static void main(String[] args) {
		int a[] = { 8, 5, 1 };
		int ans[] = CountDivisors(a);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] CountDivisors(int[] a) {
		// Find the maximum element in array ,for making the spf array of that

		int maximumElement = Integer.MIN_VALUE;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			maximumElement = Math.max(maximumElement, a[i]);
		}

		int[] spf = createSmallestPrimeFactorArray(maximumElement);

		int length = a.length;
		int[] ans = new int[length];
		for (int i = 0; i < length; i++) {
			int N = a[i];
			int total = 1;

			while (N > 1) {
				int count = 0;
				int x = spf[N];
				while (N % x == 0) {
					count++;
					//System.out.print("N is" + N + " ");
					N = N / x;
					
				}
				total = total * (count + 1);
			}
			ans[i] = total;
		}
		return ans;

	}

	private static int[] createSmallestPrimeFactorArray(int maximumElement) {
		int length = maximumElement+1;
		int[] spf = new int[maximumElement + 1];
		for (int i = 0; i < spf.length; i++) {
			spf[i] = i;
		}

		for (int i = 2; i*i < length; i++) {
			if (spf[i] == i) {
				// i is prime
				for (int j = i * i; j <= maximumElement; j = j + i) {
					spf[j] = Math.min(spf[j], i);
				}
			}
		}
		return spf;
	}

}

//