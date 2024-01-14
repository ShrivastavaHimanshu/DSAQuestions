package com.himanshu.bitmanipulation;

public class UnsetBitsFromRight {

	public static void main(String[] args) {

    long a = 25;
    int b = 3;
    long ans = solve(a, b);
    int ab = -40%7;
    System.out.println("ans is :" + ab);

	}

	public static long solve(long a, int b) {
		long ans = 0;
		// 25 = 11001
		//3     11000
		
		// frst we will check LSB is set or not 
		for(int i = 0 ; i < b ; i++) {
			if((a&(1<<i)) > 0) {
				// 11001
	// we want     11110
				   //11000
				long mask = ~(1<<i);
				a = a&mask;
				   
			}
		}
		return a;
	}

}
