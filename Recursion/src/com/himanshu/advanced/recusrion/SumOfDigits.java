package com.himanshu.advanced.recusrion;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 123;
		int ans = SumOfDigits(n);
		System.out.println("ans is :" + ans);

	}

	private static int SumOfDigits(int n) {
		if (n>=0 && n <=9) return n;
		return n%10+SumOfDigits(n/10);
	}

}
