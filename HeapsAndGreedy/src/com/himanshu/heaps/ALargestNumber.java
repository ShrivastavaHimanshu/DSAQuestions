package com.himanshu.heaps;

import java.util.PriorityQueue;

/*Given an integer array B of size N.

You need to find the Ath largest element in the subarray [1 to i], where i varies from 1 to N. 
In other words, find the Ath largest element in the sub-arrays [1 : 1], [1 : 2], [1 : 3], ...., 
[1 : N].

NOTE: If any subarray [1 : i] has less than A elements, then the output should be -1 at the ith index.*/


public class ALargestNumber {

	public static void main(String[] args) {
		int arr [] = {15, 20, 99, 1};
		int a = 2 ;
		int ans [] = solve(arr, a);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] solve(int[] arr, int a) {
		int n = arr.length;
		int ans [] = new int [n];
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int i = 0 ; i < a ; i++) {
			minHeap.add(arr[i]);
			if ( i+1 < a) {
				ans[i] = -1;
			}
			if (i+1 == a) {
				ans[i] = minHeap.peek();
			}
		}
		
		for(int i = a ; i < n ;i++ ) {
			if (minHeap.peek() < arr[i]) {
				minHeap.remove() ;// delete
				minHeap.add(arr[i]);
			}
			ans[i]=minHeap.peek();
		}
		
		return ans;
	}

}
