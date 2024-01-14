package com.himanshu.basic.array;

public class ChristmasTree {

	public static void main(String[] args) {
// index 		1  2  3  4  5  6
	int [] a = {1, 6, 4, 2, 6, 9};
    int [] b = {2, 5, 7, 3, 2, 7};
    int ans = solve(a, b);
    System.out.println(" ans is :" + ans);

	}

	private static int solve(int[] a, int[] b) {
		int ans = Integer.MAX_VALUE , n = a.length;
		
		// because j can't be frst aor last element
		
		for(int j = 1 ; j <=n-2 ; j++) {
			int tempAns = b[j], i_val = Integer.MAX_VALUE , k_val = Integer.MAX_VALUE;
			// we will find min  ith element for A and sum for B
			
			for (int i = j-1 ; i >=0 ; i--) {
				if(a[i] < a[j] && b[i] < i_val) 
					i_val = b[i];
				
			}
			
			for (int k = j+1 ; k<=n-1 ; k++) {
				if(a[k] > a[j] && b[k] < k_val) 
					k_val = b[k];
				
			}
			if (i_val != Integer.MAX_VALUE && k_val != Integer.MAX_VALUE) {
				tempAns= tempAns+ i_val + k_val;
				System.out.println("sum is : " + tempAns);
				ans = Integer.min(tempAns, ans);
			}
			
		}
		
		if (ans == Integer.MAX_VALUE) {
			return -1;
		}
		else {
		  return ans;
		}
	}

	

}
