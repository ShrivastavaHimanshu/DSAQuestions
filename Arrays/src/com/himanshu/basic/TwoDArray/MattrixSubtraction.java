package com.himanshu.basic.TwoDArray;
//Note A* B of same size
public class MattrixSubtraction {

	public static void main(String[] args) {
		int [][] A = {{1, 2, 3},           
					  {4, 5, 6},                 
					  {7, 8, 9}}; 
		int [][] B = {{9, 8, 7},
					  {6, 5, 4}, 
					  {3, 2, 1}};
		
		int [][] ans = solve(A,B);
		 int rows = ans.length;
		 int cols = ans[0].length;
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j < cols ; j++) {
				System.out.print(ans[i][j] + " ");
			}
		System.out.println();	
		}
}

	
	  public static int[][] solve(int[][] A, int[][] B) {
		  int rows = A.length;
		  int cols = A[0].length;
		  int [][] ans = new int [rows][cols];
		  for (int i = 0  ; i < rows; i++ ) {
			  for(int j = 0 ; j  <cols ; j++) {
				  ans[i][j] = A[i][j] - B[i][j];
				  //System.out.println("sum is :" + ans[i][j]);
			  }
		  }
		  return ans;
	    }
}
