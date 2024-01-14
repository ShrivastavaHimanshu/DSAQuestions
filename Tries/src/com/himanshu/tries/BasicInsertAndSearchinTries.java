/**
 * 
 */
package com.himanshu.tries;

import java.util.*;

/**
 * @author Hshri
 *s
 */

class Trie {
	boolean isEnd;
	HashMap<Character, Trie> hm = new HashMap<>();
	Trie(){
		isEnd = false;
	}
}
public class BasicInsertAndSearchinTries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] A = { "hat", "cat", "rat" };
		String [] B = { "cat", "ball" };
		int [] ans = solve(A, B);
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print( ans [i] + " ");
		}

	}

	private static int[] solve(String[] a, String[] b) {
		int [] ans = new int [b.length];
		int k = 0;
		Trie root = new Trie(); // dummy Node
		// Read array A and insert into map
		
		for(int i = 0 ; i < a.length; i++) {
			String word = a[i]; // reading a word
			insert(word, root); // insert into root 
		}
		
		// Reading the queries and B array and check whether it is present or not 
		for(int i = 0 ; i < b.length; i++) {
			String wordToFind = b[i];
			if(search(wordToFind, root)) {
				ans[k] = 1;
			}else {
				ans[k] = 0;
			}
			k++;	
		}
		
		return ans;
	}

	private static boolean search(String wordToFind, Trie root) {
		int n = wordToFind.length();
		Trie curr = root;
		for(int i = 0 ; i < n; i++) {
			char ch = wordToFind.charAt(i);
			if(!curr.hm.containsKey(ch)) {
				return false;
			}else {
				curr = curr.hm.get(ch);
			}
		}
		return curr.isEnd;
	}

	private static void insert(String word, Trie root) {
		Trie curr = root;
        for(int i=0;i<word.length();i++) {
            char childWord = word.charAt(i);
            if (! curr.hm.containsKey(childWord)){
            	Trie newNode = new Trie();
            	curr.hm.put(childWord, newNode);
            	curr = newNode;
            } else {
            	curr = curr.hm.get(childWord);
            }
        }
        curr.isEnd = true;
	}

}
