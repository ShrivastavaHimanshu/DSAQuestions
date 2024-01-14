package com.himanshu.basic.prefixsum.array;

public class PrefixSumEvenArray {

	public static void main(String[] args) {
		int [] arr = {3,-2,4,6,-3,5};
		// index   =  0  1 2 3  4  5
	// pfEven Array = 3  3 7 7 4 4
	/*
	 * int [] prefixEvenSum = prefixEvenSum(arr); for(int i = 0 ; i
	 * <prefixEvenSum.length; ++i) { System.out.print(prefixEvenSum[i] + " "); }
	 */

		int [] b =   {2,4,1,3,5,7};
		// index   =  0 1 2 3 4 5
		// pfOdd   =  2 4 4 7 7 14
		
		int [] prefixOddSum = prefixOddSum(b);
		for(int i = 0 ; i <prefixOddSum.length; ++i) {
			System.out.print(prefixOddSum[i] + " ");
		}
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
