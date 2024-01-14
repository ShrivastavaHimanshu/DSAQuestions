package com.himanshu.advanced.twopoirnters.arrays;
/*	Given three sorted arrays A, B and Cof not necessarily same sizes.

Calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c 
such that a, b, c belongs arrays A, B, C respectively. i.e. minimize | max(a,b,c) - min(a,b,c) |.
	
	*/
public class Minimizetheabsolutedifference {

	public static void main(String[] args) {
		int [] A = { 1, 4, 5, 8, 10 };
		int []	B = { 6, 9, 15 };
		int [] C = { 2, 3, 6, 6 };
		int ans = solve(A, B,C);
		System.out.println(" ans is :" + ans);
		}

	private static int solve(int[] a, int[] b, int[] c) {
			int n = a.length;
	        int m = b.length;
	        int o = c.length;
	        int i = 0 , j = 0 , k = 0;
	        int ans = Integer.MAX_VALUE;
	        while( i < n && j < m && k < o){
	        	int min = Math.min(a[i], Math.min(b[j], c[k]));
	        	int max = Math.max(a[i], Math.max(b[j], c[k]));
	        	System.out.println("min is :" + min + " max is : " + max);
	        	ans =Math.min(ans,Math.abs(max-min));
	        	if (min==a[i]) {
	        		i++;
	        	}else if (min==b[j]) {
	        		j++;
	        	}else {
	        		k++;
	        	}
	        }
	        return ans;
	
	}

	}


