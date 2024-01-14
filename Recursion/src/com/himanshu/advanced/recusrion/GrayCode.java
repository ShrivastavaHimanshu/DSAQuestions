package com.himanshu.advanced.recusrion;

import java.util.ArrayList;



public class GrayCode {

	public static void main(String[] args) {
	  int a = 2;
		ArrayList<String> binaryGrayCode = binaryGrayCode(a);
		ArrayList<Integer> result = new ArrayList<>();
		for (String i : binaryGrayCode) {
			result.add(Integer.parseInt(i, 2));
	  }
	  	
	}

	private static ArrayList<String> binaryGrayCode(int a) {
		ArrayList<String> result = new ArrayList<>();
		
		// base Condition
		
		if (a==1) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("0");
			baseResult.add("1");
			return baseResult;
		}
		
		ArrayList<String> recursiveResult = binaryGrayCode(a-1);
		
		// Adding 0 in ascending order
		
		 for(int i = 0 ; i < recursiveResult.size(); i++) {
			    result.add("0"+ recursiveResult.get(i));
		 }
		 
		 // adding 1 in reverse order 
		 
		 for(int i = recursiveResult.size()-1 ; i >=0; i--) {
			    result.add("1"+ recursiveResult.get(i));
		 }
		 
		return result;
	}
	
	/// test
	
	
	
	 public int solve(int A, int B) {
	        int setBitsOfA = 0;

	        for (int i = 0; i < 32; i++) {
	            setBitsOfA += ((A & (1 << i)) != 0) ? 1 : 0;
	        }

	        if (setBitsOfA == B) {
	            return A;
	        }
	        else if (setBitsOfA < B) {
	            int toSet = B - setBitsOfA;
	            for (int i = 0; i < 32 && toSet > 0; i++) {
	                if ((A & (1 << i)) == 0) {
	                    toSet--;
	                    A = A | (1 << i);
	                }
	            }
	        }
	        else if (setBitsOfA > B){
	            int toUnset = setBitsOfA - B;
	            for (int i = 0; i < 32 && toUnset > 0; i++) {
	                if ((A & (1 << i)) != 0) {
	                    toUnset--;
	                    A = A & ~(1 << i);
	                }
	            }
	        }

	        return A;
	    }

}
