package com.himanshu.advanced.arrays;

/*Given an array of integers, every element appears thrice except for one, which occurs once.

Find that element that does not appear thrice.
*/


public class SingleNumber2 {

	public static void main(String[] args) {
		int [] arr = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
		int ans = singleNumber(arr);
		System.out.println("ans is :" + ans);

	}
	
	public static int singleNumber(final int[] A) {
        int n = A.length;
        int ans = 0;
        for(int j = 0 ; j < 31 ; j++) {
        	int bitsum=0;
        	int countBits = 0;
        	for(int i = 0 ; i < n ; i++){
        	   int number = A[i];
        	   int tempCount = countBits(number, j);
        	   countBits+=tempCount;
        	}
        	countBits=countBits%3;
        	ans=ans+countBits*(1<<j);
        }
        return ans;
	}

    public static int countBits(int number, int i ){
        int count = 0;
        if((1& (number>>i))==1) {
        	count++;
        }
        return count;
    }

}
