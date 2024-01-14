package com.himanshu.tries;

import java.util.HashMap;

/*Given a list of N words, find the shortest unique prefix to represent each word in the list.

NOTE: Assume that no word is the prefix of another. In other words, the representation is always possible
input A = ["zebra", "dog", "duck", "dove"]
output is  ["z", "dog", "du", "dov"]	

*/	


class custumTrie {
	HashMap<Character , custumTrie> hm;
	int freq;
	
	public custumTrie() {
		hm = new HashMap<>();
		freq = 0;
	}
}
public class ShortestUniquePrefix {

	public static void main(String[] args) {
		
		String arr [] = {"zebra", "dog", "duck", "dove"};
		String [] ans = solve(arr);
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static String[] solve(String[] arr) {
		int n = arr.length ;
		String ans [] = new String [n];
		custumTrie root = new custumTrie(); // dummyNode
		for(int i = 0 ; i < n ; i++) {
			String word = arr[i];
			// insert into root
			insert(word, root);
		}
		
		// iterate and check for prefix 
		for(int i = 0 ; i < n ; i++) {
			String word =  arr[i];
			ans[i] = searchPrefix(word, root);
		}
		
		return ans;
	}
		private static String searchPrefix(String word, custumTrie root) {
		custumTrie curr = root;
		StringBuilder ans = new StringBuilder();
		for(int i = 0 ; i < word.length(); i++) {
			char ch = word.charAt(i);
			if(curr.freq == 1) {
				return ans.toString();
			}else {
				ans.append(ch);
				curr = curr.hm.get(ch);
			}
		}
		return ans.toString();
	}

// zebra -> z 
	private static void insert(String word, custumTrie root) {
		int n = word.length();
		custumTrie curr = root;
		boolean flag = true;
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i < n ; i++) {
			char ch = word.charAt(i);
			if (!curr.hm.containsKey(ch)) {
				custumTrie newNode = new custumTrie();
				curr.hm.put(ch, newNode);
				curr.freq++;	
				curr = newNode;
			}else {
				// go the next root;
				curr.freq++;
				curr = curr.hm.get(ch);
				
			}
		}
	}

}
