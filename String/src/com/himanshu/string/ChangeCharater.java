package com.himanshu.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChangeCharater {

	public static void main(String[] args) {
		String a = "abcabbccd";
		int B = 3;
		int ans = solve(a, B);
		System.out.println("ans is :" + ans);

	}

	public static int solve(String A, int B) {
		 int cnt[] = new int[26];
	        for(int i = 0; i < A.length(); i++){
	            int idx = A.charAt(i)-'a';
	            cnt[idx]++;
	        }

	        ArrayList<Integer> C = new ArrayList<Integer>();
	        for(int i = 0; i < 26; ++i){
	            if(cnt[i] > 0){
	                C.add(cnt[i]);
	            }
	        }

	        Collections.sort(C);
	        
	        for(int i : C) {
	        	System.out.print(C.get(i)+ " ");
	        }
	        for(int i = 0; i < C.size(); ++i) {
	            B -= C.get(i);
	            if(B < 0){
	                return C.size() - i;
	            }
	        }
	        return 1;
		}
}
