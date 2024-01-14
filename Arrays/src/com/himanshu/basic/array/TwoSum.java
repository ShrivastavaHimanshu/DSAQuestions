package com.himanshu.basic.array;

public class TwoSum {

	public static void main(String[] args) {
		int [] a= {3,2,3};
		int target = 6;
		int [] ans = solve(a, target);
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] solve(int[] a, int target) {
		int ans [] = new int [2];
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = i+1 ; j <a.length ; j++) {
				if (a[i]+a[j]==target) {
					System.out.println("Inside");
					ans[0] = i;
					ans[1] = j;}
			}
		}
		return ans;
	}

}
