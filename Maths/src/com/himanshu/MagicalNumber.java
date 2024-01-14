package com.himanshu;

public class MagicalNumber {

	public static void main(String[] args) {
		int num = 73;
		int ans = solve(num);
		System.out.println("ans is :" + ans);

	}
	
// Given an integer A, find and return the Ath magic number. 
	
// A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.	
   //1   2     3          4    5            6             7              8    9           10
  // 5 , 25 , 30(25+5) , 125, 130(125+5) , 150 (125+25), 155(125+25+5), 625, 630(625+5), 650(625+25)
	public static int solve(int n) {
		int ans = 0;
		int i = 0;
		while (n > 0) {

			if ((n & 1) == 1) {
				ans = ans + (int) Math.pow(5, i + 1);

			}
			n = n >> 1;
			i++;
			;
		}
		return ans;
	}
	// 78755
	// 78749
	
// 625 > 125 > 25 > 5 > 1
// 	5*5*5
	// 0100    5*3
   // 0101  ans = 5 + 125 	
	
	
	
}
