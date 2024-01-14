package com.himanshu.basic.TwoDArray;

public class SpiralOrderMatrix {

	public static void main(String[] args) {
		int input = 3;
		int[][] ans = generateMatrix(input);
		int rows = ans.length;
		int cols = ans[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] generateMatrix(int input) {
		int ans[][] = new int[input][input];
		// Generating the matrix with 0
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				ans[i][j] = 0;
			}
		}

		int i = 0;
		int j = 0;
		int k = 1;
		int dir = 0;
		while (k <= input * input) {
			ans[i][j] = k;
			k = k + 1;
			if (dir == 0) {
				j = j + 1;
				if (j == input || ans[i][j] != 0) {
					dir = 1;
					j = j - 1;
					i = i + 1;
				}
			} else if (dir == 1) {
				i = i + 1;
				if (i == input || ans[i][j] != 0) {
					dir = 2;
					i = i - 1;
					j = j - 1;
				}
			} else if (dir == 2) {
				j = j - 1;
				if (j < 0 || ans[i][j] != 0) {
					dir = 3;
					i = i - 1;
					j = j + 1;
				}

			} else if (dir == 3) {
				i = i - 1;
				if (i < 0 || ans[i][j] != 0) {
					dir = 0;
					i = i + 1;
					j = j + 1;
				}
			}

		}
		return ans;
	}

}
