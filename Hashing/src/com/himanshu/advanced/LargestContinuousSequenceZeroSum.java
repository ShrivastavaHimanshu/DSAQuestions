package com.himanshu.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LargestContinuousSequenceZeroSum {

	public static void main(String[] args) {
//		//int arr [] = { 0, -10, -12, -8, 21, -11, -28, -11, 0, -8, 17, -1, -4, -7, -5, 22, -26, -24, -7, 13, 18, -21, 10};
//		//int arr [] = { 10, 13, -1, 8, 29, 1, 24, 8, 21, 20, 21, -23, -21, 0}; --> 0
//		//int arr [] = {-19, 8, 2, -8, 19, 5, -2, -23}; --> em pty array
//		int arr [] = { c}; 
//		//--> empty array 
//		int [] ans = solve (arr);
//		for(int i = 0 ; i < ans.length; i++) {
//			System.out.print(ans[i] + " ");
//		}
//		
		 ArrayList<Integer> list = (ArrayList<Integer>) Arrays.asList(-19, 8, 2, -8, 19, 5, -2, -23);
		 ArrayList<Integer> ans = Iszero(list);
		 for(int i : ans) {
			 System.out.print(i + " " );
		 }

	}

	private static ArrayList<Integer> Iszero(ArrayList<Integer> list) {
		int n = list.size();
		int sum = 0;
		int start = -1 , end = -1 , length = 0;
		HashMap<Integer, Integer> map = new HashMap <>();
		map.put(0, -1);
		for(int i = 0 ; i < n ; i++) {
			sum+=list.get(i);
			if(map.containsKey(sum)) {
				int value = map.get(sum);
				int tempLength = i-value;
				if(tempLength > length) {
					start = value +1;
					end=i;
					length = tempLength;
				}
				
			}else {
				map.put(sum, i);
			}
		}
		ArrayList<Integer> ansList = new ArrayList<>();
		if(start>=0 && end>=0){
			for (int i=start; i<=end; i++){
			ansList.add(list.get(i));
			}
			}
		return ansList;
		
	}

	private static int[] solve(int[] arr) {
		int n = arr.length;
		int [] pf = new int [n];
		pf[0]= arr[0];
		for(int i = 1 ; i < n ; i++) {
			pf[i]= pf[i-1]+arr[i];
		}
		
		HashMap<Integer, Integer> map = new HashMap <>();
		map.put(0, -1);
		int length = 0;
		int start = 0 , end = 0;
		
		for(int i = 0 ; i < n ; i++) {
			if(map.containsKey(pf[i])) {
				int value = map.get(pf[i]);
				
				int tempLength = i-value;
				if(tempLength > length) {
					start = value +1;
					end=i;
					length = tempLength;
				}
				
			}else {
				map.put(pf[i], i);
			}
		}
		if (start==0 && end ==0) {
			return new int[0];
		}

			System.out.println("start is " + start + " end is : " + end);
			int ans [] = new int [length];
			int k = 0;
			for(int i = start ; i <=end; i++) {
				ans[k]=arr[i];
				k++;
			}
			return ans;

	}

}


