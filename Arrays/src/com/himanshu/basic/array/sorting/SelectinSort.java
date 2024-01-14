/**
 * 
 */
package com.himanshu.basic.array.sorting;

/**
 * Selection Sort Steps 
 * 
 *  1 : We will try to find minimum element in every iteration
 *  2 : Once we find minimum then swap it with current element
 *  3 : Keep on doing the same till less than N-1 as in last N-1 element will automatically sorted .
 *
 */
public class SelectinSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr [] = {5, -9,6,19,3 , 26};
		int ans[] = selectionSort(arr);
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print(ans[i] + " ");
		}

}

	private static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++) {
			int minElement = arr[i];
			int index = i;
			for(int j = i ; j < n-1 ; j ++) {
				if (arr[j] < minElement) {
					minElement=arr[j];
					index=j;
				}
			}
			swap(i, index, arr);	
		}
		return arr;
	}

	private static int[] swap(int i, int j, int arr []) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	
		
	}
