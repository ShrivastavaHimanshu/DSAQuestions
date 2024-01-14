package com.himanshu.advanced.arrays;

public class MinimumSwapToSortAnArray {

	public static void main(String[] args) {
		int a[] = {2, 0, 1, 3};
		//int ans = solve(a);
		//System.out.println("ans is :" + ans);
		int [] ans = prefixMin(a);

		 for(int i = 0 ; i < ans.length ; i++) {
	        	System.out.print(ans[i] + " ");
	        }
		
	}

	private static int solve(int[] a) {
		int swapRequired = 0;
		//Unsigned long = -1;
		return swapRequired;
	}
	
	//2, 0, 1, 3
	public static int [] prefixMin(int [] arr) {
		int n = arr.length;
		int [] prefixMin = new int [n];
		int count = 0;
		//prefixMin[0] = count;
		int curr = arr[0];
		for(int i = 1; i < n ; i++) {
			int next = arr[i];
			if(curr > next) {
				curr = next;
				count+=1;
				prefixMin[i]=count;
			}else {
				//curr=arr[i-1];
				prefixMin[i]=count;
			}
		}
		return prefixMin;
		
			}
}
