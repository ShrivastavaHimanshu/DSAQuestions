package com.himanshu.queue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int arr [] = {1, 3, -1, -3, 5, 3, 6, 7};
		int b = 3;
		int [] ans = slidingMaximum(arr , b);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] slidingMaximum(int[] arr, int b) {
		Deque<Integer> dq = new LinkedList<>();
		
		// first window forming 
		for(int i = 0 ; i < b ; i++) {
			while(! dq.isEmpty() && dq.peekLast() <= arr[i]) {
				dq.removeLast();
			}
			dq.addLast(arr[i]);
		}
		
		
		int n = arr.length;
		int ans []  = new int [n-b+1];
		
		ans [0] = dq.peekFirst();
		
		// forming other window of b size 
		int l = 1 , r = b;
		
		while ( r < n) {
			// It will remove first element of previous window
			if ( !dq.isEmpty() && dq.peekFirst() == arr[l-1]) {
				dq.removeFirst();
			}
			// say we already have 3 ,3 ,3 and next is 3  this loop will take care of that
			// If we made <= it will remove that also
			while(!dq.isEmpty() && dq.peekLast() < arr[r]) {
				dq.removeLast();
			}
			dq.addLast(arr[r]);
			ans[l] = dq.peekFirst();
			l++;
			r++;
		}
		
		return ans;
	}

}
