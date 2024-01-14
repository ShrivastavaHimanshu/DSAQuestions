/**
 * 
 */
package com.himanshu.dynamicprogramming;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.*;

/**
 * @author Hshri
 *
 */
public class DungeonsPrincess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int [] [] A = {   
		 			{-2, -3, 3},
		 			{-5, -10, 1},
		 			{10, 30, -5}
				};

		 int minimumHealthPoint = calculateMinimumHP(A);
		 IntStream.of(1,1,3,3,7,6,7)
		 .distinct()
		 .parallel()
		 .map( i -> i*2)
		 .sequential()
		 .forEach(System.out::print);
		 
	}

	private static int calculateMinimumHP(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		int dp[][] = new int [n][m]; 
		
		// 1. dp state dp[i][j] - min health required to reach from i,j to n-1,m-1;
//		 dp expression- 
//        a[i][j]=-5, min health required will be -> 6 
//        -2 -5 , min health req= x-2=6 -> 8
// x-3=min(8,10)    <-|-3 -2|->8   min health req=11  
//                    |-4 -5|->6
//                     |
//                     V
//                     10
//    so dp[i][j]+H[i][j]=max(min(H[i][j+1],H[i+1][j]),1) 1 is to adding to avoid negative val
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				dp[i][j] = -1;
			}
		}
		
		dp[n-1][m-1] = Math.max(1,1-a[n-1][m-1]); // for last row /cols 

	    return findMinHP(a,n,m,dp,0,0);
	}

	private static int findMinHP(int[][] a, int n, int m, int[][] dp, int i, int j) {
		if (i == n || j == m) {
			return Integer.MAX_VALUE;
		}
		
		// It means dp[i][j] is not calculated
		if(dp[i][j] == -1) {
			int x = findMinHP(a, n, m, dp, i+1, j);
			int y = findMinHP(a, n, m, dp, i, j+1);
			dp[i][j] = Math.max(1, Math.min(x, y)-a[i][j]);
		}
		return dp[i][j];
	}

}
