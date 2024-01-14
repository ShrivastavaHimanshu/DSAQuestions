package com.himanshu.advanced.recusrion;

/*Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated till 
a single digit recursively by adding the sum of the digits after every addition. 
If the single digit comes out to be 1, then the number is a magic number.*/

public class MagicalNumber {

	public static void main(String[] args) {
		int n = 83557;
		int ans = solve(n);
		System.out.println("ans is :" + ans);

	}

	static int ans = 0;

	private static int solve(int n) {

		int result = 0;
		ans = SumOfDigits(n);
		boolean valid = true;
		while (valid) {
			if (ans % 10 == ans) {
				result = ans;
				valid = false;
				break;
			} else {
				ans = SumOfDigits(ans);
			}
		}

		if (result == 1) {
			return 1;
		}

		return 0;
	}

	public static int SumOfDigits(int n) {
		if (n >= 0 && n <= 9)
			return n;
		return n % 10 + SumOfDigits(n / 10);
	}

}
