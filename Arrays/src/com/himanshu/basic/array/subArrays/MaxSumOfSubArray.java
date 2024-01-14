package com.himanshu.basic.array.subArrays;

public class MaxSumOfSubArray {

	public static void main(String[] args) {
		int[] arr = {1, -2, 3, 4, -10};
		
		//int ans = maxSumArrayUsingN2TC(arr);
		//System.out.println("ans is :" + ans);
		int res = maxSumArray(arr);
		System.out.println("res is :" + res);
		
		

	}

	// Kadane's Algorithm with TC :- O(n) 
	// Here we know if want maximum we wont include -ve number is our array
	//So we will keep a track of current sum and check if element is -ve then discard else will take 
	public static int maxSumArray(int[] arr) {
		int curr_Sum = arr[0], max_Sum = arr[0], n = arr.length;
		for (int i = 1; i < n; i++) {

			if (curr_Sum < 0) {
				curr_Sum = 0;
			}
			curr_Sum = curr_Sum + arr[i];
			if (curr_Sum > max_Sum) {
				max_Sum = curr_Sum;
			}
		}
		return max_Sum;
	}

	
	// Brute Force Approach with TC O(n^2)
	public static int maxSumArrayUsingN2TC(int[] A) {
		 int  maxSum = Integer.MIN_VALUE , n = A.length;
	        for(int s= 0 ; s< n ; s++){
	        	int sum = 0;
	            for (int e = s ; e < n ; e++ ){
	                sum += A[e];
	                maxSum = Integer.max(sum, maxSum);
	            } 
	        } return maxSum;

	}
   
	

}
