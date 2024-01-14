package com.himanshu.basic.array.sorting;

/*

*  Quick Sort : 
*  
*  1: will take a[0] element and send him at the position where all the smaller elements to its left
*  2 : And all the higher elements would be at the right side.
*  3 : Keep on doing the same thing 
*  4 : As we are able to find sub problem inside it , so can use recursion.
*
*/
public class QuickSort {

	public static void main(String[] args) {
		int [] arr = {1, 4, 10, 2, 1, 5};
		int ans [] = quickSort(arr);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		

	}

	private static int[] quickSort(int[] arr) {
		sort(0 , arr.length-1 , arr);
		return arr;
	}
	
	//static int p = 0;
	private static void sort(int s, int e, int[] arr) {
		if (s>=e) // check notes for this condition --> Advanced Sorting - 3
		{
			return ;
		}
		int p = reArrange(arr, s , e);
		sort(s , p-1 , arr);
		sort(p+1 , e , arr);
		
	}

	private static int reArrange(int[] arr, int s, int e) {
		
		int ref = arr[s];
		int l = s+1 , r = e; 
		while(l <= r) {
			if (arr[l] <= ref) {
				l++;
			}else if (arr[r] > ref) {
				r--;
			}else {
				swap(l , r , arr);
			}
		}
		swap(s, l-1 , arr);
		return l-1;
	}

	private static void swap(int l, int r, int[] arr) {
		int temp = arr[l];
		arr[l]=arr[r];
		arr[r]=temp;	
		
	}

}
