package com.himanshu.queue;

import java.util.Stack;

public class MaxMin {

	public static void main(String[] args) {
	int [] arr = {4, 7, 3, 8};
	int ans = solve(arr);
	System.out.println(" ans is : "+ ans);

	}

	private static int solve(int[] arr) {
		int [] smaller_left = generateSmallerLeft(arr);
		int [] smaller_right = generateSmallerRight(arr);
		int [] greater_left = generateGreaterLeft(arr);
		int [] greater_right = generateGreaterRight(arr);
		
		
		int n = arr.length;
		long mod = 1000000007;
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			//subarray in which A[i] is min
		      int p1 = smaller_left[i];
		      int p2 = smaller_right[i];
		      long prodMin = (1L * (i - p1) * (p2 - i)) % mod;
		      long minContribution = (prodMin * arr[i]) % mod;

		      //subarray in which A[i] is max
		      int p3 = greater_left[i];
		      int p4 = greater_right[i];
		      long prodMax = (1L * (i - p3) * (p4 - i)) % mod;
		      long maxContribution = (prodMax * arr[i]) % mod;

		      //computing ans
		      ans = (ans % mod) + ((maxContribution - minContribution) % mod);
		      ans = ans % mod;
		    }
		    if (ans < 0) {
		      ans = (ans + mod) % mod;
		    }
		    return (int)(ans % mod);
		}
		
	

	private static int[] generateSmallerLeft(int[] arr) {
		int n = arr.length;
		int ans [] = new int [n];
		for(int i = 0 ; i < n ; i++) {
			ans[i]= -1 ;
		}
		Stack<Integer> stack = new Stack();
		for(int i = 0 ; i < n ; i++) {
			 while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
				 stack.pop();
			 }
			 if (!stack.isEmpty()) {
				 ans[i] = stack.peek();
			 }
			 stack.push(i);
		}
		
		return ans;
	}
	
	private static int[] generateSmallerRight(int[] arr) {
		
		int n = arr.length;
		int ans [] = new int [n];
		for(int i = 0 ; i < n ; i++) {
			ans[i]= n ;
		}
		Stack<Integer> stack = new Stack();
		for(int i = n-1 ; i >= 0 ; i--) {
			// here less than and above less than or eq to bcz of duplicates 
			 while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
				 stack.pop();
			 }
			 if (!stack.isEmpty()) {
				 ans[i] = stack.peek();
			 }
			 stack.push(i);
		}
		return ans;
	}

	private static int[] generateGreaterRight(int[] arr) {
		int n = arr.length;
		int ans [] = new int [n];
		for(int i = 0 ; i < n ; i++) {
			ans[i]= -1 ;
		}
		Stack<Integer> stack = new Stack();
		for(int i = 0 ; i < n ; i++) {
			 while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
				 stack.pop();
			 }
			 if (!stack.isEmpty()) {
				 ans[i] = stack.peek();
			 }
			 stack.push(i);
		}
		
		return ans;
	}

	private static int[] generateGreaterLeft(int[] arr) {
		int n = arr.length;
		int ans [] = new int [n];
		for(int i = 0 ; i < n ; i++) {
			ans[i]= n ;
		}
		Stack<Integer> stack = new Stack();
		for(int i = n-1 ; i >= 0 ; i--) {
			// here less than and above less than or eq to bcz of duplicates 
			 while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
				 stack.pop();
			 }
			 if (!stack.isEmpty()) {
				 ans[i] = stack.peek();
			 }
			 stack.push(i);
		}
		return ans;
	}

	

}
