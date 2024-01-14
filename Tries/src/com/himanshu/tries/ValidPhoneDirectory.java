package com.himanshu.tries;

class CustomeTrieNode {
	boolean isPrefix;
	CustomeTrieNode[] children;

	CustomeTrieNode() {
		children = new CustomeTrieNode[10];
		isPrefix = false;
	}
}

public class ValidPhoneDirectory {

	public static void main(String[] args) {
		String arr[] = { "00121", "001" };
		int ans = solve(arr);
		System.out.println(" ans is :" + ans);

	}

	private static int solve(String[] arr) {
		int n = arr.length;
		CustomeTrieNode root = new CustomeTrieNode(); // dummy node
		for (int i = 0; i < n; i++) {
			String word = arr[i];
			if (insert(word, root)) {
				return 0;
			}
		}
		return 1;
	}

//	Insert String in Trie Ndoe  with maintaining a flag (isPrefix)
//    if we are adding new trieNode then string (s) is not prefix.

	private static boolean insert(String word, CustomeTrieNode root) {
		CustomeTrieNode curr = root;
		boolean isPrefix = true;
		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);
			int index = ch - '0';
			if (curr.children[index] == null) {
				isPrefix = false;
				curr.children[index] = new CustomeTrieNode();	
			}
			curr = curr.children[index];

		}

		return isPrefix;

	}

}
