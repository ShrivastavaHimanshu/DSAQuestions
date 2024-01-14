package com.himanshu;

public class NumberDivisibleByEight {

	public static void main(String[] args) {
		String a = "8";
		int ans = solve(a);
		System.out.println("ans is :" + ans);

	}

	public static int solve(String a) {
		int n = a.length();
		if (n == 0) {
			return 0;
		} else if (n == 1 & ((a.charAt(n-1) - '0') % 8 == 0 )) {
			return 1;
		} else if (n == 2 & ((a.charAt(0) - '0') * 10 + (a.charAt(n - 1) - '0')) % 8 == 0) {
			return 1;
		}

		if (n >= 3) {
			int onesDigit = a.charAt(n - 1) - '0';
			int tensDigit = a.charAt(n - 2) - '0';
			int hundredDigit = a.charAt(n - 3) - '0';

			if ((onesDigit + tensDigit * 10 + hundredDigit * 100) % 8 == 0) {
				return 1;
			}
		}
		return 0;
	}
}
