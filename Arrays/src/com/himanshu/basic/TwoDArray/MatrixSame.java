package com.himanshu.basic.TwoDArray;

public class MatrixSame {

	public static void main(String[] args) {
	int [][] A = {{1, 2, 3},           
				  {4, 5, 6},                 
				  {7, 8, 9}}; 
	int [][] B = {{1, 2, 3}, 
				  {4, 5, 6},
			  	  {7, 8, 9}                 
			  	  }; 
	
	int ans = checkMatrixSame(A,B);
	System.out.println("ans is :" + ans);

	}

	public static int checkMatrixSame(int[][] A, int[][] B) {
		 	
			int rows = A.length;
			int cols = A[0].length;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols ; j++) {
					
						if (A[i][j] != B[i][j])
							return 0;

					
				}
			}
			
			return 1;
	}

}
