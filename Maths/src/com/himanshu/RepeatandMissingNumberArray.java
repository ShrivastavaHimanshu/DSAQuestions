package com.himanshu;

public class RepeatandMissingNumberArray {

	public static void main(String[] args) {
		int a [] = {4, 1, 4, 5 ,3};
		int [] ans = repeatedNumber(a);
		System.out.println("ans is ");
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] repeatedNumber(int[] a) {
		 int ans [] = new int [2];
			int n = a.length , x = 0 , y = 0;
			int [] frequencyArray = new int [n];
			for(int i = 0 ; i < n ; i++) {
				int temp = a[i];
				if (frequencyArray[temp-1] >0) {
					x = temp;
				} 
				if (frequencyArray[temp-1] == 0) {
					  frequencyArray[temp-1] = temp;
				}
				 
			}
			
			for(int i = 0 ; i < n ; i++) {
				if(frequencyArray[i]==0) {
					y  = i+1;
				}
			}
	        ans[0] = x;
	        ans[1] = y;
		    return ans;
	}

}
