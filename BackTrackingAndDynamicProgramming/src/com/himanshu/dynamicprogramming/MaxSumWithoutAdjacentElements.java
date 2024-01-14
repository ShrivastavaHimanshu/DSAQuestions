package com.himanshu.dynamicprogramming;

/*Given a 2 x N grid of integer, A, choose numbers such that the sum of the numbers is maximum and
 *  no two chosen numbers are adjacent horizontally, vertically or diagonally, and return it.
Note: You can choose more than 2 numbers.

*
*/
public class MaxSumWithoutAdjacentElements {

	public static void main(String[] args) {
		 int [] [] A = {   
				 			{74, 37, 82, 1},
				 			{66, 38, 16, 1}   
		 				};
		 
		 int maxSum = adjacent(A);
		 System.out.println("maxSum is :" + maxSum);

	}

	private static int adjacent(int[][] a) {
		// So here we we need to maximize the sum , we need to get maximum at every column 
		// We can simply create the 2-D array into 1-D array by getting maximum column wise.
		
		int n = a[0].length;
		int [] maxColumnWise = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			
			maxColumnWise[i] = Math.max(a[0][i], a[1][i]);
		}
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(maxColumnWise[i]+ " ");
		}
		
		System.out.println();
		// Now as the question we can't pick adjacent to each other
		
		// For betterment we maintain res [i] which will maintain max sum till ith index  
		
		// So if we pick the element , we can't pick i-1 
		
		
		int [] dp = new int [n];
		
		// base case if n==1 -> ans dp[0];
		// if n= 2 -> dp[1] = max of dp[0], dp[1]
		
		dp[0] = maxColumnWise[0];
		
		if(n==1) {
			return dp[0];
		}
			
		else {
			dp[1] = Math.max(maxColumnWise[0], maxColumnWise[1]);
			
			
			for(int i = 2 ; i < n ; i++) {
				//               not picking element  while picking the element
				dp[i] = Math.max(dp[i-1], (maxColumnWise[i]+dp[i-2]));
				
			}
			return dp[n-1];
		}
		
		
	}

}
