package com.himanshu.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int a [] = {1 ,2, 3 ,4,5 };
		int b = 5; //1  24 28 10 4
		//            1  25 53 63 67
		// 1, 2, 3, 4, 5  // b = 5
		 int [] ans = solve(a, b); 
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] solve(int[] A, int B) {
		 HashMap<Integer , Integer > map = new HashMap<>();
	        ArrayList<Integer> list = new ArrayList<>();
	        int n = A.length , end = -1 , start = -1;
	        // creating a freq array with sum differnce
	        // 5, 10, 20, 100, 105 // // 110
	        // 5 15 35 135 215
	        // 1 2 3 4 5   // 5
	        // 1 3 6 10 15 
	        
	        int[] prefixSum = prefixSum(A);
	        for(int i = 0 ; i < n ; i++) {
	        	int sum = 0;
	        	for(int j = i+1; j < n ; j++) {
	        		if (i ==0) {
	        			sum = sum + prefixSum[j];
	        		}else {
	        	   sum = sum + prefixSum[j]-prefixSum[j-1];}
	        	   if (sum == B) {
	        		   start = i;
	        		   end = j;
	        		   break;
	        	   }
	        	}
	        	
	        }
	        
	        
	        
	        
	        
//	        for(int i = 0 ; i < n ; i++) {
//	        	 int a = A[i];
//		         int b = B-a;
//		         if (map.containsKey(b)) {
//		        	 end = i;
//		        	 start = map.get(b);
//		        	 break;
//		        }else {
//		        	map.put(a, i);
//		        	
//		        }
//		     }
	        System.out.println("start is :" + start + "end is :" + end);
	        int length = end-start+1;
	        int sum = 0;
	        if(length > 0) {
	        	int arr [] = new int [length];
	        	for(int i = 0 ; i < length; i++) {
	        		arr[i] = A[start];
	        		//sum +=arr[i];
	        		start++;
	        	}
	        	//if (sum==B)
	        	return arr;
	        }
	        int arr [] = {-1};
	        return arr;
	}
	
	
	public static int [] prefixSum (int [] arr) {
		int [] prefixSum = new int [arr.length];
		prefixSum[0] = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i-1]+arr[i];
		}
		return prefixSum;
		
	}

}



//for(Entry<Integer, Integer> m : map.entrySet()) {
//System.out.println("key is :" +m.getKey() + " value is :" + m.getValue());
//}