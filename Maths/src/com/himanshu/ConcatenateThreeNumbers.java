package com.himanshu;

public class ConcatenateThreeNumbers {

	public static void main(String[] args) {
		int A = 91;
		int B = 91;
		int C = 91;
		int ans = solve(A, B, C);
		System.out.println("ans is :" + ans);

	}

	public static int solve(int a, int b, int c) {
		
		if ((a < b && b < c) || ((a == b) && (b < c)) || ((b == c) && (c > a))) {
			int ans = a * 10000 + b * 100 + c;
			return ans;
		}
		else if ((b < a && a < c) || ((a==c) && (c > b)) || ((a==b) && (b==c))) {
			int ans = b * 10000 + a * 100 + c;
			return ans;
		}
		else if (c < a && a < b) {
			int ans = c * 10000 + a * 100 + b;
			return ans;
		}
		else if ((c < b && b < a) || ((a==b) && (b > c))) {
			int ans = c * 10000 + b * 100 + a;
			return ans;
		}
		else if ((b < c && c < a) || ((b == c) && (c < a))) {
			int ans = b * 10000 + c * 100 + a;
			return ans;
		}
		else if ((a < c && c < b) || ((a == c) && (c < b))) {
			int ans = a * 10000 + c * 100 + b;
			return ans;
		}

		return 0;

	}

}
