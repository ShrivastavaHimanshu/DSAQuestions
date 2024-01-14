package com.himanshu.stacks;

import java.util.Stack;

public class BalanancedParanthesesDifferentType {

	public static void main(String[] args) {
		String A = "{([])}";
		int ans = solve(A);
		System.out.println("ans is :" + ans);

	}

	public static int solve(String a) {
		Stack<Character> stack = new Stack();
		int n = a.length();
		
		for(int i = 0 ; i < n; i++) {
			// frst we are inserting open parentheses
			if(a.charAt(i)=='(' || a.charAt(i)=='{' || a.charAt(i)=='[') {
				stack.push(a.charAt(i));
			}else {
				
				if(stack.isEmpty()) {
					return 0;
				}
				 char peek ;
				 if (stack.peek()=='[') {
					 peek = ']';
				 }else if (stack.peek()=='(') {
					 peek = ')';
				 }else {
					 peek = '}';
				 }
				if(peek ==a.charAt(i))
					stack.pop();
			}
		}
		System.out.println("stack siez is :" + stack.size());
//		if(stack.size()==0) 
//		{return 1;}
//		return 0;
		return stack.size()==0 ? 1 : 0;
	}

}
