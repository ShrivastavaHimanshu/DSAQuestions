package com.himanshu.subsequences;

import java.util.Stack;

public class LittlePonnyandTqoSubsequence {

	public static void main(String[] args) {
		String a = "ksdjgha";
		String ans = solve(a);
		System.out.println("ans is :"+ ans);

	}

	// Create a Stack and iterate the string 
	// if it is empty simply push the element 
	// traverse the stack and check given character is less than stack element and also check remaining length of string 
	// is less than K
	// if stack is empty or stack.size less than K -> add the element in stack
	// Iterate the stack and reverse the string 
	// Returns the string 
	private static String solve(String a) {
		int k = 2;
		String ans = getSmallestSubsequenece(a , k);
		return ans;
	}

	public static String getSmallestSubsequenece(String a, int k) {
		StringBuilder revString = new StringBuilder();
		int n = a.length();
		Stack <Character> checkStr = new Stack (); 
		for(int i = 0 ; i < n ; i++) {
			if(checkStr.isEmpty()) {
				checkStr.push(a.charAt(i));
			}else {
				while(!checkStr.isEmpty() && checkStr.peek()> a.charAt(i) && (checkStr.size()-1+n-i) >= k) {
					checkStr.pop();
				}
				
				if (checkStr.isEmpty() || checkStr.size() <k) {
					checkStr.push(a.charAt(i));
				}
			}
		}
		
		// Iterate the stack and get elements in reverse order

		while(!checkStr.isEmpty()) {
			revString.append(checkStr.peek());
			checkStr.pop();
		}
		
		return revString.reverse().toString();
	}

}
