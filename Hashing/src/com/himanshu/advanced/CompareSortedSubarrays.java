package com.himanshu.advanced;

import java.util.HashMap;
import java.util.HashSet;

public class CompareSortedSubarrays {

	public static void main(String[] args) {
		int [] a = {100000, 100000, 100000, 100000, 100000};
		int [][] b = {
				  {4, 4, 1, 1},
				  {1, 3, 0, 0},
				  {2, 4, 1, 1}
				};
		int ans [] = solve(a, b);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	
	private static int[] solve(int[] a, int[][] b) {
		HashMap<Integer , Long > map = new HashMap<>();
		int rows = b.length;
		int ans [] = new int [rows];
		generateHash(a, map);
		int n = a.length;
		long [] pf = new long [n];
		pf[0] = map.get(a[0]);
		for(int i = 1 ; i < n ; i++) {
			pf[i] = pf[i-1]+map.get(a[i]);
		}
		for(int i = 0 ; i < rows ; i ++) {
			
			int l1 = b[i][0] , r1 = b[i][1];
			int l2 = b[i][2] , r2 = b[i][3];
			
			
			if (r1-l1==r2-l2) {
				long sum1 = 0L , sum2 = 0L;
				if (l1==0) {
					sum1 = pf[r1];
				}else {
					sum1= pf[r1]-pf[l1-1];
				}
				
				if (l2==0) {
					sum2 = pf[r2];
				}else {
					sum2= pf[r2]-pf[l2-1];
				}
				
				
				if (sum1==sum2) {
					ans[i]=1;
				}
			}
			
		}
		return ans;
		
	}


	private static void generateHash(int[] a, HashMap<Integer, Long> map) {
		int n = a.length;
		  long range = 1000*1000*1000*1000;
		for(int i = 0 ; i < n ; i++) {
			long hashValue = (long) (Math.random()*range +1);
			if (!map.containsKey(a[i]))
			map.put(a[i], hashValue);
		}
		
		
	}

}


//int rows = b.length;
//int cols = b[0].length;
//int [] ans = new int [rows];
//int k = 0;
//HashSet <Integer> set = new HashSet<>();
//for(int i = 0 ; i < rows ; i ++) {
//	set = new HashSet<>();
//	int l1 = b[i][0] , r1 = b[i][1];
//	int l2 = b[i][2] , r2 = b[i][3];
//	
//
//	while (l1 <= r1 ) {
//		set.add(a[l1]);
//		l1++;
//	}
//	int count = 0 ;
//	while(l2 <= r2) {
//		if(!set.contains(a[l2])) {
//			count++;
//		}
//		l2++;
//	}
//	if (count==0) {
//		ans[k]=1;
//		k++;
//	}
//	set.clear();
//}
//return ans;