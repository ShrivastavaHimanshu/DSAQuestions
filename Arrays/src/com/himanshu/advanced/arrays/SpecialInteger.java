package com.himanshu.advanced.arrays;

/*Given an array of integers A and an integer B, find and return the maximum value K 
 * such that there is no subarray in A of size K with the sum of elements greater than B.*/


public class SpecialInteger {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int b = 10;
		int ans = solve(arr, b);
		System.out.println("ans is :" + ans);
		
		

	}

	private static int solve(int[] arr, int b) {
		int n = arr.length;
		int l  = 1 , h = n;
		int ans = 0;
		while(l<=h) {
			int k = (l+h)/2;
			if(checkMaxSum(arr, k, n) <=b) {
				ans=k;
				l=k+1;
			}else {
				h=k-1;
			}
		}
		
		return ans;
	}

	private static int checkMaxSum(int[] arr, int k, int n) {
		int maxSum = 0;
		
		// Finding sum of frst window
		
		for(int i = 0 ; i < k ; i++) {
			maxSum+=arr[i];
		}
		
		int windowSum = maxSum;
		
		// Finding sum in remaining windows 
		
		for(int i = k ; i < n ; i++) {
			windowSum+=arr[i]-arr[i-k];
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

	

}
