package com.himanshu.queue;

import java.util.LinkedList;
import java.util.Queue;

/*Given an integer A, you have to find the Ath Perfect Number.

A Perfect Number has the following properties:

It comprises only 1 and 2.

The number of digits in a Perfect number is even.

It is a palindrome number.

For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.*

*/
public class PerfectNumber {

	public static void main(String[] args) {
		int a = 2 ;
		String ans = solve (a);
		System.out.println(" ans is : " + ans);

	}

	private static String solve(int a) {
		Queue<String> q = new LinkedList<String>(); 
		
		q.add("11");
		q.add("22");
		
		int count = 2 ;
		int removalCount = 0;
		while(count < a) {
			String x = q.peek();
			q.remove();
			removalCount++;
			int size = x.length();
			String s1 = x.substring(0, size/2);
			String s2 = x.substring(size/2, size);
			
			q.add(s1+"11"+s2);
			q.add(s1+"22"+s2);
			
					
			count+=2;
		}
		
		
		int ans = a - removalCount;
		String res = null;
		while(ans > 0) {
			res = q.peek();
			q.remove();
			ans--;
		}
		
		
		
		return res;
	}

}
