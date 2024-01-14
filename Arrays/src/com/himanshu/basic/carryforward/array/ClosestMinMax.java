package com.himanshu.basic.carryforward.array;

public class ClosestMinMax {

	public static void main(String[] args) {
		int [] arr = {2};
		int ans = solve(arr);
		System.out.println("ans is :" + ans);

	}

	public static int solve(int[] arr) {
		// find maximum and min value in array
		int n = arr.length;
		int maxValue = getMaximumValue(arr, n);
		int minValue = getMinimumValue(arr, n);
		
		int ans = 5 , min_index = -1 , max_index = -1;
		int length = 0;
		if (maxValue == minValue) {
			
			return 1;
		}
		for(int i = n-1; i >=0 ; i--) {
			if (arr[i] == minValue) {
				min_index = i;
				if (max_index !=-1) {
					   // [ minIndex ,maxIndex]
					length = max_index-min_index+1;
					ans = Integer.min(ans,length);
				}
			}else if (arr[i] == maxValue) {
				max_index = i;
				if(min_index != -1) {
					// [maxIndex , MinIndex]
					length = min_index-max_index+1;
					ans = Integer.min(ans, length);
				}
			}
		}
		return ans;
	}
   
	// Finding Maximum value
	public static int getMaximumValue(int[] arr, int n) {
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i ++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	// Finding Minimum value
	public static int getMinimumValue(int[] arr, int n) {
		int minValue = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; i ++) {
			if(arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

}
