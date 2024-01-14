package com.himanshu.advanced.arrays;

import java.util.Arrays;

/*Farmer John has built a new long barn with N stalls. Given an array of integers A of size N 
 * where each element of the array represents the location of the stall and an integer B which 
 * represents the number of cows.

His cows don't like this barn layout and become aggressive towards each other once put into 
a stall. To prevent the cows from hurting each other, John wants to assign the cows to the stalls,
such that the minimum distance between any two of them is as large as possible. 
What is the largest minimum distance?
*/public class AgresiveCows {

	public static void main(String[] args) {
		
		int arr [] = {5, 17, 100, 11};
		int b = 2;
		int ans = solve(arr, b);
		System.out.println("ans is :" + ans);
	}

	private static int solve(int[] arr, int b) {
		int n = arr.length;
//		// Frst find the search space 
//		
//		// lower would be min distance among all the stalls in array 
//		
//		int l = getLowerValue(arr, n);
//		
//		// higher would be max distance as its distance we can assume be on X axis 
//		// So max distance would be arr[n-1] - arr[0];
		
		Arrays.sort(arr);
		int l = 1;
		int h = arr[n-1]-arr[0];
		
		
		System.out.println("l is :" + l+ " higher is :" + h);
		int ans = 0;
		while(l<=h) {
			int mid = (l+h)/2;
			if(check(arr, mid, b , n)) {
				ans = mid;
				l = mid+1;
				
			}else {
				h = mid-1;
			}
		}
		return ans;
	}

	private static boolean check(int[] arr, int mid, int b, int n) {
		int lastCow = arr[0] , cowCount = 1;
		for(int i = 1; i < n ; i++) {
			if ((arr[i]-lastCow) >= mid) {
				lastCow=arr[i];
				cowCount++;
			}
			if (cowCount==b) {
				return true;
			}
		}
		return false;
	}

	
}
