package com.himanshu.advanced.arrays;

public class ImplementPowerFunction {

	public static void main(String[] args) {
		int A = 71045970; int B = 41535484; int C = 64735492;
		int power = pow(A,B,C);
		//System.out.println(1%9);
		System.out.println("ans is :" + power);

	}

	private static int pow(int a, int b, int c) {
			if(a==0) {
				return 0;
			}
			if (b==0) {
				return 1;
			}
			long p = (long) pow(a, b/2, c);
			// if power is even
			if(b%2==0) {
				return (int) ((p%c *p%c) + c)%c;  // this is mod prop to prevent negative remainder
			}
			// else it power is odd
			return (int) ((a%c * p%c *p%c) + c)%c;
	}

}
