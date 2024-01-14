package com.himanshu.stacks;

import java.util.Stack;

public class FindSubsequence {

	public static void main(String[] args) {
		String a = "bit";
		String b = "dfbkjijgbbiihbmmt";
		String ans = solve(a, b);
		System.out.println("ans is :" + ans);
		
		int i = 3;
		int ansLength = (int) Math.pow(2, 3);
		System.out.println("length is :" + ansLength);
		
		

	}

	public static String solve(String A, String B) {
		Stack<Character> stack = new Stack();
		for (int i = 0; i < A.length(); i++) {
			stack.push(A.charAt(i));
		}

		for (int i = B.length() - 1; i >= 0; i--) {
			char c = B.charAt(i);
			if (stack.size() > 0) {
				if ((stack.peek() == c)) {
					stack.pop();
				}
			}

		}

		if (stack.size() == 0) {
			return "YES";
		}
		return "NO";
	}

}
