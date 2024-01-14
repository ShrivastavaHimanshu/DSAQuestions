package com.himanshu.basic.array;

import java.util.Scanner;

public class SeparateOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases ; i++) 
		{
			int sizeOfArray = sc.nextInt();
			int arr [] = new int[sizeOfArray];
			for(int j = 0 ; j < sizeOfArray ; j++) 
			{
				 arr[j] = sc.nextInt();
			}
			
			separateOddEven(arr, sizeOfArray);
		}
	}

	public static void separateOddEven(int[] arr , int n ) {
		int[] evenArray = new int [n];
		int[] oddArray = new int [n];
		int countEven = 0;
		int countOdd = 0;
		
		  for(int i = 0 ; i < n ; i++) 
		  { if (arr[i] % 2 == 0) { 
			  evenArray[countEven] = arr[i]; 
			  countEven++; } 
		  else { 
			  oddArray[countOdd] = arr[i]; 
			  countOdd++; 
			  }
		 
		  }
		printArray(evenArray, countEven);
		
		printArray(oddArray, countOdd);
		
	}

	public static void printArray(int[] arr, int n) {
		 for (int i =0 ; i < n ; i ++) 
		 {
			 System.out.print(arr[i] + " ");
		 }
		
		
	}

}
