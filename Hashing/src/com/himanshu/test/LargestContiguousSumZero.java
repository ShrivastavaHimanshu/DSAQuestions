package com.himanshu.test;

import java.util.HashSet;
import java.util.Vector;

public class LargestContiguousSumZero {

	public static void main(String[] args) {
		int arr [] = {1,2,-2,4,-4};
		// preixsum   1 3 1 5 1
		int [] ans = solve(arr);
		for(int i = 0 ; i < ans.length; i++) {
			
			System.out.print(ans[i]+" ");
			
		}

	}

	
	
	
	public static int[] solve(int[] arr) {
		Vector<Integer> vector = new Vector<>();
		int n = arr.length , start = -1, end =-1;
		int [] prefixSum = prefixSum(arr);
		int length = Integer.MIN_VALUE;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < prefixSum.length ; i++){
			//1 3 1 5 1
			  start = i;
			 int tempLength = 0;
			 //set.add(prefixSum[0]);
			
			   if (!(set.contains(prefixSum[i]))) {
				    set.add(prefixSum[i]);
			   }else {
				   // tempLength = j-i+1;
			   }
			   
			   if (tempLength>length) {
					length=tempLength;
				}
			
		}
		System.out.println(set);
		System.out.println("length is " + length);
		//System.out.println("start is :" + start + "end is :" + end);
//		int [] ans = new int [end-start];
//		for(int i = start +1; i <=end; i++) {
//			ans[i] = arr[i];
//		}
 		return prefixSum;
	}




	public static int[] prefixSum(int[] a) {
		int[] prefixSum = new int[a.length];
		int n = a.length ;
		prefixSum[0] = a[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + a[i];
			
		}
//		System.out.println("prefrix sum is ");
//		for(int i = 0 ; i < prefixSum.length; i++) {
//			System.out.print(prefixSum[i] + " ");
//		}
		return prefixSum;
		
	}
	
}
