package com.himanshu.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*Given an integer, A. Find and Return first positive A integers in ascending order containing 
 * only digits 1, 2, and 3.

NOTE: All the A integers will fit in 32-bit integers.*/
public class NintegersContaining123 {

	public static void main(String[] args) {
		int a = 29451;
		int ans [] = solve (a);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] solve(int a) {
		List <Integer> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<Integer>() ;
		q.add(1);
		q.add(2);
		q.add(3);
		
		
		
		int removalCount = 0; // keep to track how many elements will be inn queue and same will return 
		int count = 0 ;
		int ans [] = new int [a];
		while(count < a) {
			String s = String.valueOf(q.peek());
			ans[count] = q.remove();
			removalCount++;
			q.add((int) Long.parseLong(s+'1'));
			q.add((int) Long.parseLong(s+'2'));
			q.add((int) Long.parseLong(s+'3'));
			count++;
		}
		return ans;
	}

}
