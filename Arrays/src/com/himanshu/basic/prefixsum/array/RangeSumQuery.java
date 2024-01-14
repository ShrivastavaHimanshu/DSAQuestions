package com.himanshu.basic.prefixsum.array;

import java.util.ArrayList;
import java.util.List;

public class RangeSumQuery {

	public static void main(String[] args) {
	
		int [] a = { 7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
		//index     1 2 3 4 5 6 7 8
		//Prfeix    4 9 15 24 28 29 37 40 
		int [][] b = {{7, 10},{3, 10},{3, 5},{1, 10}};
		//Ans 20 11 24 29 3 5 25 20 11 9 
		long[] ans = rangeSum(a,b);
		System.out.println("ans is ");
		for(int i = 0 ; i <ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	    	
	}
		
	public static long[] rangeSum(int[] A, int[][] B) {
		int [] prefixSumArray = prefixSum(A);
		long [] ans = new long[B.length];
		long sum =0;
		for (int i = 0 ; i < B.length ; i++) {
			 int leftRange = B[i][0];
			 int rightRange = B[i][1];
			 if (leftRange == 1) 
			 {
				 sum = prefixSumArray[rightRange];
			 }
			 sum = prefixSumArray[rightRange] -  prefixSumArray[leftRange-1];
			 ans[i] = sum;
			 sum =0;
		}
		return ans;
		
	}
	
	public static int[] prefixSum(int[] a) {
		int [] pf = new int [a.length+1];
		pf [1] = a[0];
		for (int i = 2; i <= a.length ; i++) 
		{
			pf[i] = pf[i-1] + a[i-1];
		}
		return pf;
	}

}
