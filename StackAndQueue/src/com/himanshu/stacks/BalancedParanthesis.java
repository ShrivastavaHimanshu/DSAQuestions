package com.himanshu.stacks;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String A = "(()())";
		int ans = solve(A);
		System.out.println("ans is :" + ans);

	}

	public static int solve(String a) {
		Stack<Character> stack = new Stack();
		int n = a.length();
		for(int i = 0 ; i < n; i++) {
			// frst we are inserting open parentheses
			if(a.charAt(i)=='(') {
				stack.push(a.charAt(i));
			}else {
				// Here we are checking that whether stack has only closed parentheses , 
				//if yes simply return 0
				if(stack.isEmpty()) {
					return 0;
				}
				
				// here we are checking that whether that open parentheses has corresponding closed parentheses
				// If simply remove it ;
				stack.pop();
			}
		}
		if(stack.size()==0) 
		{return 1;}
		return 0;
	}

}
