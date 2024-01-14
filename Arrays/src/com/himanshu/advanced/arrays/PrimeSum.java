package com.himanshu.advanced.arrays;

public class PrimeSum {

	public static void main(String[] args) {
		int n = 4;
		int ans [] = primeSum(n);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] primeSum(int n) {
		int ans [] = new int [2];
		boolean [] seiveArray = seiveArray(n);
		for(int i = 0 ; i <=n ; i++) {
			int firstNumber = i;
			int secondNumber = n-i;
			if(firstNumber+secondNumber==n)
			if (seiveArray[firstNumber] && seiveArray[secondNumber]) {
				ans[0]=firstNumber;
				ans[1]=secondNumber;
				break;
			}
		}
		return ans;
	}
	
	
	public static boolean []  seiveArray(int n) {
		boolean [] seiveArray = new boolean [n+1];
		seiveArray[0]=false;
		seiveArray[1]=false;
		for(int i = 2 ; i <=n ; i++) {
			seiveArray[i]=true;
		}
		
		for(int i =2 ; i <=n ; i++) {
			if(seiveArray[i]==true) {
				// i is prime 
				for(int j = 2*i ; j <=n ; j=j+i) {
					seiveArray[j]=false;
				}
			}
		}
		return seiveArray;
		
	}

}
