package com.himanshu.advanced.twopoirnters.arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int arr[] = { 1};
		int ans = maxArea(arr);
		System.out.println("ans is :" + ans);

	}

	// Algorith
	/* 
   maximum area would be (i~j) * (Min(arr[i], arr[j])
 *
 * simple if arr[i] is minimum , we will increase the left ++ , beacsue we assume that might 
 * be there is better answer than this left
 * Else we will assume would be better an fpr right as well ; So wil do --> right--;
 *
 *
 */
	
	private static int maxArea(int[] arr) {
		int n = arr.length;
		int l = 0;
		int r = n-1;
		int ans = 0;
		while(l<=r) {
			int width = Math.abs(r-l);
			int height = Math.min(arr[l], arr[r]);
			int area = width * height;
			ans = Math.max(area, ans);
			if (arr[l] <= arr[r]) {
				l++;
			}else {
				r--;
			}
		}
		
		return ans;
	}

}
