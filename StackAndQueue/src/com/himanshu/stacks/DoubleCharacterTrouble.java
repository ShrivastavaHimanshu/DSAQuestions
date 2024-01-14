package com.himanshu.stacks;

import java.util.Stack;

public class DoubleCharacterTrouble {

	public static void main(String[] args) {
		String a = "ab";
		String ans = solve(a);
		System.out.println(" ans is : " + ans);

	}

	private static String solve(String s) {
		Stack<Character> st = new Stack();
		for(int i = 0 ; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(st.isEmpty()) {
				st.push(ch);
			}else {
				if(st.peek()==ch) {
					st.pop();
				}else {
					st.push(ch);
				}
			}
		}
		StringBuilder ans = new StringBuilder();
		while(!st.isEmpty()) {
			ans.append(st.peek());
			st.pop();
		}
		return ans.reverse().toString();
	}

}
