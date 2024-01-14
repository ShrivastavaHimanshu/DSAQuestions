package com.himanshu.basic.array.sorting;

/*Given an array A of non-negative integers of size N. Find the minimum sub-array Al, Al+1 ,..., Ar 
such that if we sort(in ascending order) that sub-array, then the whole array should get sorted. 
If A is already sorted, output -1.*/

public class MaximumUnsortedSubarray {

	public static void main(String[] args) {
		int [] arr = { 1, 2, 3, 5, 6, 13, 15, 16, 17, 13, 13, 15, 17, 17, 17, 17, 17, 19, 19 };
		int [] ans = subUnsort(arr);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.println(ans[i] + " ");
		}

	}
// Steps to do this
	/*
	 * 1 : We will find probable start & end index where unsort array can start 
	 * 2 : Iterate from start and check if (arr[i]<=arr[i+1]) and if not then start = i;
	 * 3 : Iterate from end and check arr[i] >= arr[i-1]
	 * 4 : Find max and min in between start and end of the array
	 * 5  :Iterate in array from left  and check if arr[i] > min of probale sorted array  & update start
	 * 6 : Iterate in array from right and check for max and do the same; 
	 * 
	 * 
	 * */
	private static int[] subUnsort(int[] arr) {
		int [] index = new int [2];
		int n = arr.length;
		//  Iterate from start and check if (arr[i]<=arr[i+1]) and if not then start = i;
		int start = 0 , end = n-1;
		for(int i = 0; i < n-1 ; i++) {
			if (arr[i] <= arr[i+1]) {
				continue;
			}else {
				start = i;
				break;
			}
		}
		
		// Iterate from end and check arr[i] >= arr[i-1]
		
		
		for(int i = n-1 ; i >=1 ; i--) {
			if (arr[i] >= arr[i-1]) {
				continue;
			}else {
				end = i;
				break;
			}
		}
		
		// Find max and min in between start and end of the array
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for(int i = start ; i <= end ; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		
		
		// Iterate in array from left  and check if arr[i] > min of probale sorted raay update start
		
		for(int i = 0 ; i < n ; i++) {
			if (arr[i] > min) {
				start=i;
				break;
			}
		}
		
		//  // Iterate in array from right  and check if arr[i] < max of probale sorted array update start
		
		for(int i = n-1; i >=0 ; i--) {
			if (arr[i] < max) {
				end = i;
				break;
			}
		}
		
		index[0]=start;
		index[1]=end;
		
		
		return index;
	}

}
