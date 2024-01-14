package com.himanshu.basic.array.sorting;

public class SquareRoot {

	public static void main(String[] args) {
		int a = 11;
		int ans = sqrt(a);
		System.out.println("ans is " + ans);;

	}

	private static int sqrt(int a) {
		int ans = 0;
		int l = 1 , h = (int) Math.sqrt(a);
		while(l<=h) {
			int mid = (l+h)/2;
			if(mid*mid == a) {
				return mid;
			}
			if (mid*mid < a) {
				ans=mid;
				l = mid+1;
			}else {
				h = mid-1;
			}
		}
		return ans;
	}

}
