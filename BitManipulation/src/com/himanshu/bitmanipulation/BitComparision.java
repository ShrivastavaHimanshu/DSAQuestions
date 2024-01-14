package com.himanshu.bitmanipulation;

public class BitComparision {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5 };
		int ans = compressBits(a);
		System.out.println("ans is :" + ans);

	}

	public static int compressBits(int[] A) {
		int ans = 0;
		int n = A.length;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				A[i] = A[i] & A[j];
				A[j] = A[i] | A[j];

			}
		}

		// print the array
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}

		for (int i = 0; i < n - 1; i++) {
			ans += A[i] ^ A[i + 1];
		}
		return ans;
	}

}
