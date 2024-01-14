package com.himanshu.advanced.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddOneToNumber {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(0);
		ArrayList<Integer> ans = plusOne(list);
		for(int i : ans) {
			System.out.print(i + " ");
		}
//int num = 9/10;
//int mod = 10%10;
//System.out.println("num is :" + num + " mod is :" + mod);
	}

	 public static ArrayList<Integer> plusOne(List<Integer> list) {
	        int n = list.size();
	        ArrayList<Integer> ans = new ArrayList<Integer>();
	        int carry = 1;
	        for(int i = n-1 ; i >= 0; i--) {
	        	int sum = list.get(i)+carry;
	        	int digit = sum%10;
	        	carry = sum/10;
	        	ans.add(digit);
	        	
	        }
	        
	        // if extra carry is present 
	        if(carry==1) {
	        	ans.add(carry);
	        }
	        
	        //list will contain the answer in reverse direction
	        // remove 0s from last [leading 0's in answer]
	        int index = ans.size()-1;
	        while(ans.get(index)==0) {
	        	ans.remove(index);
	        	index--;
	        }
	        
	        Collections.reverse(ans);
	        return ans;
	    }
}
