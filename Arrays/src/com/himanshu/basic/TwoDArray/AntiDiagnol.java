package com.himanshu.basic.TwoDArray;

public class AntiDiagnol {

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] ans = solve(A);
		int rows = ans.length;
		int cols = ans[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] solve(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		int[][] ans = new int[2 * n - 1][n];
		for (int k = 0; k < ans.length; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (i + j == k && j < m )
						ans[k][i] = a[i][j];
//					else if (i + j == k && k >=n)
//						ans[k][] = a[i][j];
					
				
				}
			}
		}
		return ans;
	}

}
