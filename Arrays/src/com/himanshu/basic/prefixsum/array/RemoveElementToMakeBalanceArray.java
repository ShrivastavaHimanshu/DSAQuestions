package com.himanshu.basic.prefixsum.array;

public class RemoveElementToMakeBalanceArray {

	public static void main(String[] args) {
		int [] a = {2, 1, 6, 4};
		int ans = solve(a);
		System.out.println("ans is :" + ans );

	}

	public static int solve(int[] arr) {
		int oddSum = 0 , evenSum =0, n = arr.length;
		int count =0;
		for(int i = 0; i < n; i++) 
		{
			if (i%2 == 0) {
				evenSum+=arr[i];
			}else {
				oddSum+=arr[i];
			}
		}
		
		for(int i = 0 ; i<n ; i++) {
			
			if(i%2==0) {
				evenSum-=arr[i];
				if(evenSum==oddSum) {
					count++;
				}
				oddSum+=arr[i];
			}else {
				oddSum-=arr[i];
				if(evenSum==oddSum) {
					count++;
				}
				evenSum+=arr[i];
			}
		}
		return count;
	}

}
