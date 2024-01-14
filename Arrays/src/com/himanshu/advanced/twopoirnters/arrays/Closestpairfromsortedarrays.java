package com.himanshu.advanced.twopoirnters.arrays;

/*Given two sorted arrays of distinct integers, A and B, and an integer C, 
 * find and return the pair whose sum is closest to C and the pair has one element from each array.

More formally, find A[i] and B[j] such that abs((A[i] + B[j]) - C) has minimum value.
If there are multiple solutions find the one with minimum i and even if there are multiple values of
 j for the same i then return the one with minimum j.
Return an array with two elements {A[i], B[j]}.

*
*/
public class Closestpairfromsortedarrays {

	public static void main(String[] args) {
		int A []  = {6, 7, 9, 13, 21, 29, 56, 74, 77, 83, 84, 88, 93, 96, 101, 104, 114, 115, 122, 125, 144, 147, 151, 152, 154, 161, 165, 167, 174, 179, 185, 189, 192, 194, 198, 201, 203, 208, 224, 229, 230, 238, 252, 253, 257, 264, 266, 275, 278, 279, 282, 284, 291, 312, 316, 322, 332, 335, 336, 339, 364, 380, 381, 384, 387, 388, 390, 392, 394, 395, 401, 403, 431, 432, 440, 442, 443, 444, 446, 451, 454, 461, 470, 483, 492 };
		int  B []  =  {2, 8, 13, 16, 19, 21, 22, 23, 37, 48, 63, 66, 68, 71, 72, 95, 102, 116, 123, 127, 131, 132, 146, 148, 153, 171, 173, 179, 187, 194, 215, 220, 227, 229, 240, 245, 254, 255, 257, 259, 271, 276, 277, 286, 296, 312, 314, 318, 321, 333, 339, 341, 343, 355, 356, 359, 363, 364, 380, 390, 393, 398, 401, 409, 413, 417, 427, 442, 444, 446, 454, 455, 459, 460, 468, 471, 473, 475, 476, 478, 479, 482, 483, 488, 489};
		int C = 409;
		int [] ans = solve(A, B, C);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] solve(int[] a, int[] b, int c) {
		int n = a.length;
		int m = b.length;
		int i = 0 , j = m-1;
		int p = 0 , s = 0;
		int ans [] = new int [2];
		int target = Integer.MAX_VALUE;
		while(i < n &&  j >= 0) {
			int sum = a[i]+b[j];
			int diff = Math.abs(sum-c);
			if (diff <= target) {
				if(diff == target	){ // if abs diff is same as the previous, will update second value with current value as P2 will be less
                    if(ans[0] == a[i])
                        ans[1] = b[j];
                }
                else{
                	target = diff;
                    ans[0] = a[i];
                    ans[1] = b[j];
                }
				
			}
			if (sum < c) {
				i++;
			}else {
				j--;
			}
		}
		return ans;
	}

}


//		System.out.println("target is :" + target);
//System.out.println("i is :" + i + " j is " + j);