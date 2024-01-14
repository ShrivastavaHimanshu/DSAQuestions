package com.himanshu.advanced.arrays;

import java.util.HashMap;
import java.util.Map;

public class PairSumDivisibleByM {

	public static void main(String[] args) {
		int a [] = {5, 17, 100, 11};
		int b = 28;
		int ans = solve(a, b);
		System.out.println("ans is :" + ans);
	

	}

	private static int solve(int[] a, int b) {
		long ans = 0;
		int mod=1000000007;
		Map<Integer, Long> map = new HashMap<>();
		int n = a.length;
		// Makinfg a hashMap with remainder corresponding to array elements
		for(int i = 0 ; i < n ; i++) {
			int remainder = 0;
			if (a[i] > 0) {
				remainder = a[i]%b;
			}else {
				remainder=(a[i]+b)%b;
			}
			
			if (map.containsKey(remainder)) {
				map.put(remainder, map.get(remainder)+1L);
			}else {
				map.put(remainder , 1L);
			}
		}
		
		 if(map.get(0)!=null){
	           long k=map.get(0);
	           k=k%mod;
	           ans+=(k*(k-1))/2;
	        }
		
		int i = 1 ; int j = b-1;
		while(i < j) {
			if(map.get(i)!=null && map.get(j)!=null) {
				ans = ans+map.get(i)*map.get(j);
				}
				i++;
				j--;
			}
			
		// if b is even
		if(b%2==0) {
			if (map.get(b/2) !=null) {
				 long k=map.get(b/2);
		          k=k%mod;
		         ans+=(k*(k-1))/2;
			}
			
		}
		
		if (ans<0) {
			return (int)(ans+mod)%mod;
		}
		return (int)ans%mod;
	}
	
}
