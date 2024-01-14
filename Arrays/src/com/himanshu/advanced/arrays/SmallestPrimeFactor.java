package com.himanshu.advanced.arrays;

public class SmallestPrimeFactor {

	public static void main(String[] args) {
		int n = 25;
		int ans = smallestPrimeNumber(n);
		System.out.println("smallest Prime Factor is :- " + ans);

	}

	private static int smallestPrimeNumber(int n) {
		int ans = 0;
		
		// Create an smallest prime factor of n+1 size and initialize with the number itself
		
		int [] spf = new int [n+1];
		
		for(int i = 0 ; i < spf.length; i++) {
			spf[i] = i;
		}
		
		for(int i = 2 ; i*i < n+1 ; i++) {
			if(spf[i]==i) {
				// i is prime it means 
				for(int j = i*i ; j <=n ; j=j+i) {
					spf[j]=Math.min(spf[j], i); // because might be it already updated in previous iteration 
					                            // SO we shouldn't update as its already have min value 
				}
			}
		}
		
		// Iterate the spf and check which is the min prime factor which divides n and return the ans;
		for(int i = 2 ; i < spf.length; i++) {
//			int x = spf[i];
//			if((n%x)==0) {
//				ans=x;
//				break;
//			}
			
			System.out.print(spf[i] + " ");
			
		}
		
		return ans;
	}

}
