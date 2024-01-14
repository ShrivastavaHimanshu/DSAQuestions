package com.himanshu.bitmanipulation;

public class CountNumberOfBits {

	public static void main(String[] args) {
		int a = 11;
		int ans = numSetBits(a);
		System.out.println("ans is " + ans);

	}

	public static int numSetBits(int a) {
		int count = 0;
		while(a>0) {
			count = count + (a&1);
			a>>=1;
		}
		return count;
	}

}
