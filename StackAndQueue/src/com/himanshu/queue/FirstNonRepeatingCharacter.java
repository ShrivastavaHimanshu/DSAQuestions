package com.himanshu.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*Given a string A denoting a stream of lowercase alphabets, you have to make a new string B.
B is formed such that we have to find the first non-repeating character each time a character is 
inserted to the stream and append it at the end to B. If no non-repeating character is found, 
append '#' at the end of B
*/
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String a = "abcabc";
		String ans = solve(a);
		System.out.println(" ans is : "+ ans);

	}

	private static String solve(String a) {
		Queue <Character> q = new LinkedList<Character> ();
		HashMap<Character, Integer> map = new HashMap<>();
		StringBuilder s = new StringBuilder();
		int n = a.length();
		
		for(int i = 0 ; i < n ; i++) {
			char ch = a.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
			
			if(map.get(ch)==1) {
				q.add(ch);
			}
			
				while( !q.isEmpty() && map.get(q.peek()) > 1) {
					q.remove();
				}
			
			
			if (q.isEmpty()) {
				s.append('#');
			}else {
				s.append(q.peek());
			}
		}
		
		return s.toString();
	}

}
