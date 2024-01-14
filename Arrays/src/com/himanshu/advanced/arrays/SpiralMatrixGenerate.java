package com.himanshu.advanced.arrays;

public class SpiralMatrixGenerate {

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

	private static int[][] generateMatrix(int input) {
		int[][] ans = new int[input][input];
		int i = 0, j = 0;
		int n = input;
		int m = 1;
		while (n > 1) {
			for (int k = 0; k < n - 1; k++) {
				ans[i][j] = m;
				m++;
				j++;
			}

			for (int k = 0; k < n - 1; k++) {
				ans[i][j] = m;
				m++;
				i++;
			}

			for (int k = 0; k < n - 1; k++) {
				ans[i][j] = m;
				m++;
				j--;
			}
			for (int k = 0; k < n - 1; k++) {
				ans[i][j] = m;
				m++;
				i--;
			}
			i++;
			j++;
			n=n-2;
		}
		
		if (n==1) {
			ans[i][j]=m;
		}
		return ans;
	}

}
