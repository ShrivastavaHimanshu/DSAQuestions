package com.himanshu.basic.TwoDArray;

public class RotateClockWise {

	public static void main(String[] args) {
		int[][] A = { { 1, 2 }, { 3, 4 } };
		solve(A);

	}

	public static void solve(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		// find Transpose of the given matrix
		transposeMatrix(a);

		// row wise swap the digits
		for (int i = 0; i < rows; i++) {
			int si = 0;
			int ei = rows - 1;
			while (si < ei) {
				int temp = a[i][si];
				a[i][si] = a[i][ei];
				a[i][ei] = temp;
				si++;
				ei--;
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}

	}

	public static void transposeMatrix(int[][] A) {
		int rows = A.length;
		int cols = A[0].length;
		// Now iterating the transpose matrix and swap the rows into columns
		for (int i = 0; i < rows; i++) {
			for (int j = i + 1; j < rows; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}

	}

}
