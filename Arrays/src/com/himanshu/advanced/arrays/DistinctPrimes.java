package com.himanshu.advanced.arrays;

import java.util.HashSet;

/* You have given an array A having N integers. 
 * Let say G is the product of all elements of A.
   You have to find the number of distinct prime divisors of G.
*/
public class DistinctPrimes {

	public static void main(String[] args) {
		int a [] = {208610688 ,48106344, 135402124 ,34168992 ,95013776, 35218040, 117231114 ,172905590 ,                                                                                                                                                     66652014 45970782 222323244 203402914 35292972 159829956 154584716 107190226 71335264 42786172 203327982 3484338 28062034 64179258 210993 94938844 155858560 123562868 223447224 116744056 55711942 88082566 45671054 16072914 165299992 136601036 44659472 219063702 202953322 188341582 116931386 127759060 131318330 49867246 92278758 40875406 218314382 135889182 6893744 97111872 56236466 96662280 52340002 195010530 44884268 167435554 155746162 201679478 54138370 103481092 25814074 186093622 208498290 31883566 122101694 128058788 133566290 55749408 178675354 186056156 155071774 35180574 82050540 7755462 29448276 100333948 130156884 67850926 44509608 17084496 216703344 197295956 174479162 18058612 51290954 173917172 51815478 218426780 184032992 148140564 108951128 };
		int ans = checkDistinctPrimes(a);
		System.out.println("ans is :" + ans);

	}

	private static int checkDistinctPrimes(int[] a) {
		int count = 0;
//		int maximumElement = Integer.MIN_VALUE;
//		for(int i = 0 ; i < a.length; i++) {
//			maximumElement=Math.max(maximumElement, a[i]);
//		}
		
		
		
		int product = 1;
		for(int i = 0 ; i < a.length; i++) {
			product=product*a[i];
		}
		
		boolean [] seiveArray = isPrime(product);

		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i <= product ; i++) {
			if (seiveArray[i]) {
				if(product%i==0) {
					set.add(i);
				}
			}
		}
		return set.size();
	}

	private static boolean[] isPrime(int maximumElement) {
		boolean [] isPrime = new boolean [maximumElement+1];
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i = 2 ; i <=maximumElement; i++) {
			isPrime[i]=true;
		}
		
		for(int i =2 ; i*i <=maximumElement ; i++) {
			if(isPrime[i]==true) {
				// i is prime 
				for(int j = i*i ; j <=maximumElement ; j=j+i) {
					isPrime[j]=false;
				}
			}
		}
		return isPrime;
	}

}
