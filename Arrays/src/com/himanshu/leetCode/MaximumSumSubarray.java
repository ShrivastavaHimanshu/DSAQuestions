package com.himanshu.leetCode;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		int [] a = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = getSum(a);
		System.out.println("sum is :" + ans);

	}

	public static int getSum(int[] a) {
		int n = a.length;
		if (n==1) {
			return a[0];
		}
		int maxSum = a[0] , current_Sum = a[0];
	  for(int i = 1 ; i < n ;i++) {
		  
		  if (current_Sum < 0) {
			  current_Sum =0;
		  }
		  current_Sum = current_Sum + a[i];
		  if (maxSum < current_Sum) {
			  maxSum = current_Sum;
		  }
	  }
		
		return maxSum;
	}
	
	
}
