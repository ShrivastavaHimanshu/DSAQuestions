package com.himanshu.advanced.arrays;

public class MinimumSwapsTwo {

	public static void main(String[] args) {
		int [] n = {2, 0, 1, 3};
		int ans = minSwaps(n);
		System.out.println("Total Swaps :- " + ans);
		

	}

	private static int minSwaps(int[] a) {
		int n = a.length;
		  int ans = 0;
		  for(int i = 0 ; i < n ; i++) {
			  if (a[i]!=i) {
				  int temp1 = a[i];
				  int temp2=a[a[i]];
				  a[i]=temp2;
				  a[temp1]=temp1;
				  ans++;
			  }
		  }
		    return ans;
		}
		
		
	}


