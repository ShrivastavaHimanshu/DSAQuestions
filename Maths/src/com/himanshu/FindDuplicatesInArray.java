package com.himanshu;

/*
 * Given a read only array of n + 1 integers between 1 and n, 
 * find one number that repeats in linear time using less than O(n) space and 
   traversing the stream sequentially O(1) times*/

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int[] a = { 5, 1, 2, 1, 2};
		int ans = getDuplicate(a);
		//int ans = getDuplicateByModifyingAnArray(a);
		System.out.println("ans is :" + ans);

	}

	public static int getDuplicate(int[] arr) {

		int ans = -1;
		int n = arr.length;
		int frequencyArray [] = new int [n+1];
		
		for(int i = 0 ; i < n ; i++) {
			int temp = arr[i];
			if(frequencyArray[temp] > 0) {
				ans = temp;
			}
			frequencyArray[temp] = 1;
			
		}
		
		System.out.println("freq array is :");
		for(int i = 0 ; i < n ; i++) {
//			if(frequencyArray[i]==0) {
//				ans[1]=i+1;
//			}
			
			System.out.print(frequencyArray[i] + " ");
		}
		System.out.println();
		return ans;
	}
	
	public static int getDuplicateByModifyingAnArray(int [] arr) {
		int ans = -1;
		int n = arr.length;
		//  2, 1, 2, 0, 3 
		for(int i = 0 ; i < n ; i++) {
			
			int index = Math.abs(arr[i]);
			if (arr[index] < 0) {
				ans = index;
			}
			arr[index] = - arr[index];		
			}
		
		return ans ;
	}

}
