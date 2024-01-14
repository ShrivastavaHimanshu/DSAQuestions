package com.himanshu.basic.TwoDArray;

public class MatrixMultiplication {
	public static void main(String[] args) {
	int [][] A = {
			  {62, -37, -49, 18, -53, 14, 51},
			  {62, -52, -11, -21, -62, -44, -95},
			  {20, 78, -29, -49, -17, 21, 83},
			  {-99, -69, -39, -47, 19, -50, -90},
			  {91, -96, 63, -23, 5, 94, 49},
			  {17, 1, 16, 63, -78, -13, -100},
			  {-7, 72, 16, 86, -53, 94, 85},
			  {-82, 78, 96, -45, -42, 38, 34},
			  {-88, 37, 12, 31, -91, 51, 23}
			}; 
	int [][] B = {
			  {90, 68, 2, 54, -59},
			  {78, -86, 8, -30, 24},
			  {-92, 84, -62, 13, 2},
			  {12, -73, -53, -91, -4},
			  {74, 85, -51, -4, 37},
			  {-30, -27, 10, -78, 29},
			  {-96, 39, -42, 93, 78}
			};

	int [][] ans = solve(A,B);
	int rows = ans.length;
	int cols = ans[0].length;
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < cols ; j++) {
			System.out.print(ans[i][j] + " ");
		}
	System.out.println();	
	}}

public static int[][] solve(int[][] A, int[][] B) {
	int rows = A.length;
	int cols = B[0].length;
	int[][] ans = new int[rows][cols];
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			int sum = 0;
			for (int k = 0; k < A[0].length; k++) {
				sum += A[i][k] * B[k][j];
			}
			ans[i][j] = sum;
		}
	}
	return ans;
}

}
