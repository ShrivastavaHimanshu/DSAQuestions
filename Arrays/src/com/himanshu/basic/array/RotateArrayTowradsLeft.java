package com.himanshu.basic.array;

public class RotateArrayTowradsLeft {

	public static void main(String[] args) {
		 int a [] = {5, 17, 100, 11};
			int b [] = {1};
			
			
			// form a 2D array 
			
			int [][] result  = solve(a , b);
			for (int i = 0 ; i < b.length; i ++){
				for (int j = 0 ; j <a.length ; j ++){
					System.out.print(result[i][j] + " ");
				}
			System.out.println();	
			}
			

		}

		private static int[][] solve(int[] a, int[] b) {
			int rows = b.length;
			int cols = a.length;
			int [][] res = new int [rows][cols];
			  
			for (int i = 0 ; i < rows; i ++){
				int numberOfRotations = b[i];
				int [] rotatedArray = rotateLeftArray(a,numberOfRotations);
				
				for (int j = 0 ; j < cols ; j++)
				{
					res[i][j] = rotatedArray[j];
				}
			}
			
			
			return res;
		}

		public static int[] rotateLeftArray(int[] a, int numberOfRotations) {
			// (1) Reverse the entire array 
			// (2) Reverse the array from 0 to ((sizeOfArray-1) - numberOfRotations)
			// (3) Reverse the array from numberOfRotation to (sizeOfArray-1)
			
			
			int sizeOfArray = a.length;
			int n = sizeOfArray-1;
			 if (numberOfRotations == sizeOfArray)
			 {
				 return a;
			 }
			
			
			if (numberOfRotations > sizeOfArray)
			{
				numberOfRotations = numberOfRotations % sizeOfArray;
			}
			System.out.println("numebr of rotation :" + numberOfRotations);
			// 1 step 
			
			int startIndex = 0;
			int endIndex = n;
			int arr[] = reverseArray(a, startIndex, endIndex, sizeOfArray);
			
			// 2 step 
			
			startIndex = 0;
			endIndex = (n- numberOfRotations);
			int [] revArray = reverseArray(arr , startIndex, endIndex , sizeOfArray);
			
			// 3 step 
			
			startIndex = numberOfRotations+1;
			System.out.println("si :" + startIndex);
			endIndex = n;
			
			int [] roatatedLeftArray = reverseArray(revArray , startIndex, endIndex , sizeOfArray);
			return roatatedLeftArray;
		}

		private static int[] reverseArray(int[] arr, int startIndex, int endIndex, int sizeOfArray) {
			
			while (startIndex < endIndex)
			{
				int temp = arr[startIndex];
				arr[startIndex] = arr[endIndex];
				arr[endIndex] = temp;
				startIndex++;
				endIndex--;
				
			}
			return arr;

	}



}
