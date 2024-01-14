package com.himanshu.stacks;
import java.util.Stack;
public class CheckTwoBracketExpressions {

	public static void main(String[] args) {
		String a = "-(a+b+c)";
		String b = "-a-b-c";
		int ans = solve(a, b);
		System.out.println(" ans is :" + ans);

	}

	private static int solve(String a, String b) {
		int [] p1 = evaluate(a);
		int [] p2 = evaluate(b);
		for (int i = 0; i < 26 ; i++) {
			if (p1[i] !=  p2[i]) {
				return 0;
			}
		}
		return 1;
	}

	private static int[] evaluate(String a) {
		Stack<Boolean> stack = new Stack();
		int ans [] = new int [26];
		stack.push(true);
		
		for(int i = 0 ; i < a.length(); i++) {
			char c = a.charAt(i);
			if (c == '+' || c== '-') {
				continue;
			}
			
			else if (c=='(' && i >0) {
				if (a.charAt(i-1) == '-') {
					// Need to chnage global sign 
					stack.push(!stack.peek());
				}else {
					stack.push(stack.peek());
				}
			}else if (c == ')') {
				stack.pop();
			}else {
				if (c >= 'a' && c <= 'z') {
					if(i > 0 && a.charAt(i-1)=='-') {
						ans[c-'a']=(stack.peek()?-1:1);
					}else {
						ans[c-'a'] = (stack.peek()?1:-1);
					}
				}
			}
		}
		return ans;
	}

}
