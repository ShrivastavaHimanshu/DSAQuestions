package com.himanshu.advanced.arrays;

import java.util.ArrayList;

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		int n = 50;
		int [] ans = printPrimeNoUsingSeiveEratosthenes(n);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] printPrimeNoUsingSeiveEratosthenes(int n) {
		boolean [] checkPrime = new boolean [n+1];
		// Mark / Assume initially all are prime numbers 
		for(int i = 0 ; i < checkPrime.length; i++) {
			checkPrime[i]= true;
		}
		
		checkPrime[0]= false;
		checkPrime[1]= false;
		
		for(int i = 2 ; i <=n ; i++) {
			if(checkPrime[i]==true) {
				// it means i is prime 
				for(int j = i*i ; j <=n ; j= j+i) {
					checkPrime[j]=false;
				}
				
			}
		}
		
		// Simple iterate the bool Array and store all the prime numbers between 1 to n
		
		ArrayList<Integer> primeNoList = new ArrayList<>();
		
		for(int i = 0 ; i < checkPrime.length; i++) {
			if (checkPrime[i]==true) {
				primeNoList.add(i);
			}
		}
		
		
		// Create a Array and store list values in the array 
		
		int [] ansArray = new int [primeNoList.size()];
		for(int i = 0 ; i < ansArray.length; i++) {
			ansArray[i]=primeNoList.get(i);
		}
		
		return ansArray;
	}

}
