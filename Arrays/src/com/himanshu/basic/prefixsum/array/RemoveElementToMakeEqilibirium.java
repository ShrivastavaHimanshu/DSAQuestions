package com.himanshu.basic.prefixsum.array;

public class RemoveElementToMakeEqilibirium {

	public static void main(String[] args) {
		int [] a = {2, 1, 6, 4};
		int ans = solve(a);
		System.out.println("ans is :" + ans );

	}

	public static int solve(int[] a) {
		int count =0;
		int n = a.length;
		long evenIndexSum = 0;
		long oddIndexSum = 0;
		int [] arr = new int [n];
		for(int i =0; i< n; i++) 
		{
			arr[i] = a[i];
		}
		int [] prefixEvenSum = prefixEvenSum(arr);
		System.out.println("sum at 'o' " + prefixEvenSum[0]);
		int [] prefixOddSum = prefixOddSum(arr);
		for(int i =0; i<n ; i++) 
		{
			if (i == 0) {
				 evenIndexSum = prefixOddSum[n-1] -prefixOddSum[i];
				 oddIndexSum = prefixEvenSum[n-1] - prefixEvenSum[i];
			}
			else {
				evenIndexSum =  prefixEvenSum[i-1] + (prefixOddSum[n-1] - prefixOddSum[i]);
				oddIndexSum = prefixOddSum[i-1] +(prefixEvenSum[n-1] - prefixEvenSum[i]);
			}
			System.out.println( " evenIndexCount : " + evenIndexSum + " " + "eoddIndexCount :"+ oddIndexSum);
		if (evenIndexSum == oddIndexSum) 
		 {
			 count++;
		 }	
		}
		return count;
	}

	public static int[] prefixEvenSum(int[] arr) {
		int n = arr.length;
		int prefixEvenSum[] = new int[n];
		prefixEvenSum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			if (i % 2 == 1)// odd element
			{
				prefixEvenSum[i] = prefixEvenSum[i - 1];
			} else {
				prefixEvenSum[i] = prefixEvenSum[i - 1] + arr[i];
			}
		}
		return prefixEvenSum;
	}

	// prefixOddSumArray 
	
	public static int[] prefixOddSum(int[] arr) {
		int n = arr.length;
		int prefixOddSum[] = new int[n];
		prefixOddSum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			if (i == 1) {
				prefixOddSum[i] = arr[i];
			} else {
				if (i % 2 == 0)// even no need to add same sum till previous element
				{
					prefixOddSum[i] = prefixOddSum[i - 1];
				} else {
					prefixOddSum[i] = prefixOddSum[i - 1] + arr[i];
				}
			}
		}
		return prefixOddSum;
	}
	
	
}
