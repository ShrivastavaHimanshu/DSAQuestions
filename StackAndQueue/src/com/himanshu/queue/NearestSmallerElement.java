package com.himanshu.queue;

import java.util.Stack;

public class NearestSmallerElement {

	public static void main(String[] args) {
		int a [] = {4, 5, 2, 10, 8};
		int ans [] = prevSmaller(a);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] prevSmaller(int[] a) {
		int n = a.length;
		int ans [] = new int [n];
		//initializing all elements with -1
		for(int i = 0 ; i < n ; i++) {
			ans[i]=-1;
		}
		
		Stack<Integer> stack = new Stack();
		
		for(int i = 0 ; i < n ; i++){
				while (stack.size() > 0 && a[i] <= stack.peek()) {
					stack.pop();
				}
				if (stack.size() > 0) {
					ans[i]=stack.peek();
				}
				stack.push(a[i]);
		
		}
		
		return ans;
	}

}
