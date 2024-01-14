package com.himanshu.stacks;

import java.util.Stack;

public class EvaluateExpression {

	public static void main(String[] args) {
		String[] a = { "2", "2", "/"};
		int ans = evalRPN(a);
		System.out.println(" ans is : " + ans);

	}

	private static int evalRPN(String[] s) {
		int ans = 0;
		Stack<Integer> stack = new Stack();
		for (int i = 0; i < s.length; i++) {

			if (s[i] == "+" || s[i] == "-" || s[i] == "*" || s[i] == "/") {
				int a = stack.peek();
				int b = stack.peek();
				ans = calculate(b, a, s[i].charAt(0));
				stack.push(ans);
			} else {
				int val = Integer.parseInt(s[i]);
				stack.push(val);
			}

		}
		return ans;
	}

	private static int calculate(int a, int b, char s) {
		switch (s) {
		case '+':
			return a + b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		case '-':
			return a - b;
		}
		return -1;
	}
}
