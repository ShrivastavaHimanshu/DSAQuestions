/**
 * 
 */
package com.himanshu.basic.array.sorting;

/**
 * Bubble Sort Steps 
 * 1 : In Bubble Sort , we can only swap adjacent element 
 * 1 : At every iteration will send the maximum to the right most element. 
 * 2 : Keep on doing the same until, we get the array sorted in ascending Order
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 11, -9, 4, -17, 0, 56, 3, 4, 7 };
		int ans[] = bubbleSort(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int swapCount = 0;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int oldIndex = j;
					int newIndex = j + 1;
					swap(oldIndex, newIndex, arr);
					// here is one drawback that suppose there is an array which is already sorted
					// 1,2,3,4,5
					// Then this code will check and swap unnecessary
					// We can avoid that simple break from the loop , if there is no swaps
					swapCount++;
				}
			}
			if (swapCount == 0)
				break;

		}
		return arr;
	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
