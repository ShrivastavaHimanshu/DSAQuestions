package com.himanshu.queue;

import java.util.Deque;
import java.util.LinkedList;

public class SumOfMinAndMax {

	public static void main(String[] args) {
		int arr[] = {2, -1, 3};
		int b = 2;
		int ans = slidingMinMax(arr, b);

		System.out.print(" ans is : " + ans);

	}

	private static int slidingMinMax(int[] arr, int b) {
		long ans = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		long mod = 1000000007;
		Deque<Integer> dqMax = new LinkedList<>();
		Deque<Integer> dqMin = new LinkedList<>();
		// checking in first window for max and min

		for (int i = 0; i < b; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		dqMax.push(max);
		dqMin.push(min);
		ans = (ans % mod + dqMax.peekFirst() % mod +dqMin.peekFirst() % mod)%mod;
		if(ans<0) {
			ans +=mod;
		}
		int n = arr.length;
		int l = 1 , r = b;
		while(r < n) {
			if(!dqMax.isEmpty() && dqMax.peekFirst() == arr[l-1]) {
				dqMax.removeFirst();
			}
			
			if(!dqMin.isEmpty() && dqMin.peekFirst() == arr[l-1]) {
				dqMin.removeFirst();
			}
			
			// removing all elements in last which is lesser than curreent element as 
			//it wont be any use for coming sliding window
			
			 while(!dqMax.isEmpty() && dqMax.peekLast() < arr[r]) {
				 dqMax.removeLast();
			 }
			 
			// removing all elements in last which is greater than current element as 
			//it wont be any use for coming sliding window
			 while(!dqMin.isEmpty() && dqMin.peekLast() > arr[r]) {
				 dqMin.removeLast();
			 }
			 
			 dqMax.addLast(arr[r]);
			 dqMin.addLast(arr[r]);
			 ans = (ans % mod + dqMax.peekFirst() % mod +dqMin.peekFirst() % mod)%mod;
				if(ans<0) {
					ans +=mod;
				}
			 l++;
			 r++;
			 
		}
		
		return (int) ans;
	}

}
