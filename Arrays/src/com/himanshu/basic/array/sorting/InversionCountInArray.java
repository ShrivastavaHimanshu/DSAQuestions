package com.himanshu.basic.array.sorting;

/*Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an 
  inversion of A. Find the total number of inversions of A modulo (109 + 7).*/

public class InversionCountInArray {

	public static void main(String[] args) {
		int [] arr = { 2697, 1073, 3424, 197, 394, 4034, 2380, 3591, 3243, 1157, 1530, 3252, 
					   4454, 2742, 725, 2066, 2242, 838, 1749, 1013, 2836, 2654};
		int ans = solve(arr);
		System.out.println("ans is :" + ans);

	}

	static long count = 0L;
	static long mod = 1000000007;
	private static int solve(int[] arr) {
		mergeSort(arr, 0 , arr.length-1);
		
		return (int) (count%mod);
	}

	private static void mergeSort(int[] arr, int s, int e) {
		if(s==e) {
			return ;
		}
		int m = (s+e)/2;
		mergeSort(arr, s, m);
		mergeSort(arr, m+1, e);
		merge(arr, s, m , e);
		
	}

	private static void merge(int[] arr, int s, int m, int e) {
		int n = arr.length;
		int temp [] = new int [e-s+1];
		int p1 = s , p2 = m+1 , p3 = 0;
		while(p1 <= m && p2 <=e) {
			if(arr[p1]<=arr[p2]) {
				temp[p3]=arr[p1];
				p1++;
				p3++;
			}else {
				temp[p3]=arr[p2];
				p2++;
				p3++;
				count = (count % mod + (m-p1+1) %mod ) %mod;
			}
		}
		while(p1 <= m) {
			temp[p3]=arr[p1];
			p1++;
			p3++;
		}
		
		while(p2 <= e) {
			temp[p3]=arr[p2];
			p2++;
			p3++;
		}
		
		// Sorted element  copy from temp array to orriginal array
		
		for(int i = 0 ; i <=(e-s); i++) {
			arr[i+s]=temp[i];
		}
		
	}

}
