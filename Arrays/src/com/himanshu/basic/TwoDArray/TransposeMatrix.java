package com.himanshu.basic.TwoDArray;

public class TransposeMatrix {

	public static void main(String[] args) {
		int [][] A = {{1, 2, 3},           
				  	  {4, 5, 6},                 
				  	  {7, 8, 9}};
		int [][] ans = solve(A);
		int rows = ans.length;
		int cols = ans[0].length;
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j < cols ; j++) {
				System.out.print(ans[i][j] + " ");
			}
		System.out.println();

	}}

	public static int[][] solve(int[][] A) {
		  int rows = A.length;
	      int cols = A[0].length;
	       // Now iterating the transpose matrix and swap the rows into columns
	     for(int i = 0 ; i < rows ; i++){
	         for (int j = i+1 ; j < cols; j++){
	        	 int temp = A[i][j];
	             A[i][j] = A[j][i];
	             A[j][i] = temp; 
	         }
	     }
	      return A;
	}

}
