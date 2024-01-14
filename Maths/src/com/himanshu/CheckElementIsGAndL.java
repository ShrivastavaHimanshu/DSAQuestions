package com.himanshu;

public class CheckElementIsGAndL {

	public static void main(String[] args) {
		int a [] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		int ans = findElement(a);
		System.out.println("ans is :" + ans);

	}

	public static int findElement(int[] a) {
		int n = a.length;
		int ans = 0;
		 
		int [] prefixMaxArray = prefixMaxArray(a, n);
		for(int i = 0 ; i < n ;i++) {
			System.out.print(prefixMaxArray[i]+ " ");
			
		}
		System.out.println();
		int [] suffixMaxArray = suffixMaxArray(a, n);
		for(int i = 0 ; i < n ;i++) {
			System.out.print(suffixMaxArray[i]+ " ");
			
		}
		
		for(int i = 1 ; i < n-1; i++) {
			 int temp = a[i];
			 if (temp > prefixMaxArray[i-1] && temp < suffixMaxArray[i+1]) {
				 ans = 1;
			 }
		}
		return ans;
	}
  
	public static int [] prefixMaxArray (int [] arr , int n) {
		int[] prefix = new int[n];
		prefix[0] = arr[0];
		for(int i=1;i<n;i++)
	    {
	        prefix[i]=Math.max(prefix[i-1],arr[i]);
	    }
		
		return prefix;
	}
	
	 //5, 1, 4, 3, 6, 8, 10, 7, 9
	public static int [] suffixMaxArray (int [] arr , int n) {
		int [] suffixMaxArray  = new int [n];
		suffixMaxArray[n-1] = arr[n-1];
		for(int i = n-2 ; i>=0; i--) {
			
				suffixMaxArray[i]=Math.min(suffixMaxArray[i+1],arr[i]);
			
		}
		return suffixMaxArray;
	}
	
}
