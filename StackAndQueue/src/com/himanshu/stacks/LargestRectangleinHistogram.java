package com.himanshu.stacks;
import java.util.*;
import java.util.Stack;
public class LargestRectangleinHistogram {

	public static void main(String[] args) {
		int arr [] = {2, 1, 5, 6, 2, 3};
		int ans = largestRectangleArea(arr);
		System.out.println(" ans  is :" + ans);

	}

	private static int largestRectangleArea(int[] arr) {
		int n = arr.length;
		// Create an array which will give nearest smaller element from left
		
		
		int leftMin [] = new int [n];
		// initialize with -1
		for(int i = 0 ; i < n ; i++) {
			leftMin[i] = -1;
		}
		
		Stack<Integer> leftMinStack = new Stack();
		
		for(int i = 0 ; i < n ; i++) {
			while(leftMinStack.size() > 0 && arr[i] <= arr[leftMinStack.peek()]) {
				leftMinStack.pop();
			}
			if( leftMinStack.size() > 0) {
				leftMin[i] = leftMinStack.peek();
			}
			leftMinStack.push(i);
		}
		
		
		// Create an array which will give nearest greater element from right
		
		int rightMax [] = new int [n];
		
		// initialize with n to cover edge cases
		
		for(int i = 0 ; i < n ; i++) {
			rightMax [i] = n;
		}
		
		Stack<Integer> rightMaxStack = new Stack();
		
		for(int i = n-1 ; i >=0 ; i--) {
			
			while(rightMaxStack.size() > 0 && arr[i] <= arr[rightMaxStack.peek()]) {
				rightMaxStack.pop();
			}
			if(rightMaxStack.size() > 0) {
				rightMax[i] = rightMaxStack.peek();
			}
			rightMaxStack.push(i);
		}
		
		int ans = Integer.MIN_VALUE; 
		
		for(int i = 0 ; i < n ; i++) {
			int width = rightMax[i]-leftMin[i] - 1; //-1  to exclude outer side
			int height = arr[i];
			ans = Math.max(ans, (width*height));
		}
		
		
		return ans;
	}

}
