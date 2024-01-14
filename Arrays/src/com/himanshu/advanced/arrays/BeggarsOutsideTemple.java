package com.himanshu.advanced.arrays;

public class BeggarsOutsideTemple {

	public static void main(String[] args) {
		int A = 10;
		int[][] B = { { 0, 3 } };
		int[] ans = solve(A, B);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] solve(int A, int[][] B) {
		int[] coins = new int[A];
		int leftIndex = 0, rightIndex = 0, donationByDevotee = 0;
		if (B.length == 0) {
			return coins;
		}
		int rows = B.length;
		int cols = B[0].length;
		System.out.println("rows is :" + rows + " cols is :" + cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				leftIndex = B[i][j];
				rightIndex = B[i][j];
				donationByDevotee = B[i][j];
			}

		}
		coins = generateArray(leftIndex, rightIndex, donationByDevotee, coins);
		return coins;
	}

	public static int[] generateArray(int l, int r, int p, int[] res) {
		int start = 0;
		if (l == 0) {
			start = 0;
		} else {
			start = l - 1;
		}
		for (int i = start; i < r; i++) {
			res[i] = res[i] + p;
		}
		return res;
	}

	public static int[] OptimizedApproachWithN(int A, int[][] B) {
		int[] coins = new int[A];
		for (int i = 0; i < A; i++)
			coins[i] = 0;
		for (int i = 0; i < B.length; i++) {
			int leftIndex = B[i][0] - 1;
			int rightIndex = B[i][1] - 1;
			int donationByDevotee = B[i][2];
			coins[leftIndex] += donationByDevotee;
			if ((rightIndex + 1) < A)
				coins[rightIndex + 1] -= donationByDevotee;
		}
		for (int i = 1; i < A; i++)
			coins[i] = coins[i] + coins[i - 1];
		return coins;

	}
}
