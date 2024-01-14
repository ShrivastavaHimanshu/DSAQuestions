package com.himanshu.basic.prefixsum.array;

public class PickFromBothSides {

	public static void main(String[] args) {
		int [] a = {5, -2, 3 , 1, 2};
		int b = 3;
		int ans = solve(a,b);
		System.out.println("ans is :" + ans);

	}

	public static int solve(int[] a, int b) {
		int [] prefixSum = prefixSum(a);
		int sum = 0;
		int n = a.length;
		for(int i = 0 ; i<= b; i++) {
		   int tempsum = 0;
		   if (i == b) {
			   // tempsum = 0 to n-b
			    tempsum = prefixSum[n-b];
		   }else {
			   // tempSum = n-b to n-1
		    tempsum = prefixSum[n-1] - prefixSum[(n-b)-1];
		    }
		   System.out.println("tempsum is :" + tempsum);
		   if (tempsum > sum) {
			   sum = tempsum;
		   } 
		}
		
		
		return sum;
	}

	public static int[] prefixSum(int[] a) {
		int[] prefixSum = new int[a.length];
		int n = a.length ;
		prefixSum[0] = a[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + a[i];
			}
		System.out.println("prefix sum is :");
		for(int i = 0 ; i < n; i++) {
			System.out.print( prefixSum[i] + " ");
		}
		return prefixSum;	
		
	}
}
