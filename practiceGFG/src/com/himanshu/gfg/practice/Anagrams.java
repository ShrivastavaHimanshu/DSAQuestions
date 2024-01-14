package com.himanshu.gfg.practice;

import java.util.*;

//Given an array of strings strs, group the anagrams together. You can return the answer in 
//any order. An Anagram is a word or phrase formed by rearranging the letters of a different 
//word or phrase, typically using all the original letters exactly once.

//Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]






public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> ans = groupAnagrams(strs); 
		
//		Thread t1 = new Thread(new Runnable() {
//		Test test = new Test();	
//			
//			@Override
//			public void run() {
//				test.oddNumber();
//				
//			}
//		})
		
	}

	private static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> ans = new ArrayList<>();
		HashMap<String , List<String>> map = new HashMap<>();
		for(String s : strs) {
			char [] ch = s.toCharArray();
			Arrays.sort(ch);
			String st = new String(ch);
			if(!map.containsKey(st)) {
				map.put(st, new ArrayList<String>());
			}
			map.get(st).add(s);
		}
		ans.addAll(map.values());
		return ans;
	}

}
