package com.himanshu.advanced.arrays;

/*We define f(X, Y) as the number of different corresponding bits in the binary representation of X 
 * and Y. For example, f(2, 7) = 2, since the binary representation of 2 and 7 are 010 and 111, 
 * respectively. The first and the third bit differ, so f(2, 7) = 2.
   You are given an array of N positive integers, A1, A2,..., AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 109+7.*/

public class DifferentBitsSumPairWise {

	public static void main(String[] args) {
		int a[] = { 1, 3 , 5};
		//int ans = BruteForceApproach(a);
		int ans = cntBits(a);
		System.out.println("ans is : " + ans);
	}

	private static int BruteForceApproach(int[] a) {
		int countBits = 0;
		int mod = 1000000007;
		// Bruteforce Approach
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				count = countBits(a[i], a[j]);
				countBits = countBits + count;
			}

		}

		return countBits%mod;
	}
	
	private static int countBits(int a, int b) {
		int count = 0;
		for (int i = 0; i < 31; i++) {
			if (((a >> i) & 1) != ((b >> i) & 1)) {
				count++;
			}
		}
		return count;
	}

	//  Optimized Approach
	// Find the number of zeroes and ones at every bit and get the pairs 
	// simply add all the pairs for all the bits 
	// and then multiply by 2 as it (i,j) is different with  (j,i) as per question
	
	
	
	public static int cntBits(int[] a) {
		long countBits = 0;
		int mod = 1000000007;
		int n = a.length;
	
		for(int i = 0 ; i < 31 ; i++) {
			long countOfOnes= 0;
			for(int j = 0; j < n ; j++) {
				int number = a[j];
				if((1 & (number>>i))==1){
					countOfOnes++;
				}
			}
		countBits += 2*countOfOnes*(n-countOfOnes);
		countBits%=mod;	
		}
	    int res = (int) countBits;
		return res;
	}
}
