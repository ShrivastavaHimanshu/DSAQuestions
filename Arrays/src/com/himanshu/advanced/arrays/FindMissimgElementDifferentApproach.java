package com.himanshu.advanced.arrays;

import java.util.Collections;

public class FindMissimgElementDifferentApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 4, -1, 1};
		int ans = firstMissingPositive(arr);
		System.out.println("ans is :- " + ans);
	}

	private static int firstMissingPositive(int[] arr) {
		
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			int number = arr[i];
			if(number > 0 && number <= n) {
				//int position = arr[i]-1;
//				if(arr[position]!=arr[i]) {
//					swapToCorrectPosition(arr, arr[position], arr[i]);
//					i--;
//				}
				 int pos = arr[i] - 1;
		            if (arr[pos] != arr[i]) {
		            	System.out.println("inside swap");
		                swap(arr[pos], arr[i]);
		                //i--;
		            }
				
			}
		}
		System.out.println("after swap");
		for(int i : arr) {
			System.out.print(arr[i] + " ");
		}
		
		
		return 0;
	}

	private static void swap(int i, int j) {
		int temp = j;
		i = j;
		j = temp;
		
	}

	private static void swapToCorrectPosition(int[] arr, int position, int number) {
	   int temp = arr[position];
	   arr[position] = number;
	   number = temp;
	}

}
