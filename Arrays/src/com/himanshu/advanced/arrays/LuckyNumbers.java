package com.himanshu.advanced.arrays;
/*
 * A lucky number is a number that has exactly 2 distinct prime divisors.
   You are given a number A, and you need to determine the count of lucky 
   numbers between the range 1 to A (both inclusive).

*/
public class LuckyNumbers {

	public static void main(String[] args) {
	int n = 8;
	int ans = countLuckyNumbers(n);
	System.out.println("lucky Numbers is :- " + ans);

	}

	private static int countLuckyNumbers(int n) {
		// Modified version of Seive of Erastothenes Theorem
		// Simply make and array of N size and initially mark 0 
		// Then as per seive of Erastothenes Theorem , increase the number by 1 
		// in the last , iterate an array aand simply check which has  2 value and return the answer
		
		int ans = 0;
		int [] spf = new int [n+1];
		for(int i = 0 ; i <=n; i++) {
			spf[i]=0;
		}
		
		for(int i = 2 ; i <= n; i++) {
			if(spf[i]==0) {
				// i is prime 
				for(int j = 2*i ; j <=n ; j=j+i) {
					spf[j]=spf[j]+1;
				}
				
			}
		}
		
//		for(int i = 0 ; i < spf.length; i++) {
//			System.out.print(spf[i] + " ");
//			
//		}

		for(int i : spf) {
			System.out.print(i + " ");
		}

		
		for(int i = 2; i <=n ; i++) {
			if(spf[i]==2) {
				ans++;
			}
		}
		return ans;
	}

}
