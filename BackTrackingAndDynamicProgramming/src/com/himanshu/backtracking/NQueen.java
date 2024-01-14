package com.himanshu.backtracking;

import java.util.*;

public class NQueen {

	public static void main(String[] args) {
		int n = 4;
		ArrayList<ArrayList<String>> res = solveNQueens(n); 
		for(int i = 0 ; i < res.size(); i++) {
			for(int j = 0 ; j < res.get(i).size(); j++) {
				System.out.print(res.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

	
	static ArrayList<ArrayList<String>> ans = new ArrayList<>();
    public static ArrayList<ArrayList<String>> solveNQueens(int n) {
   
			char [][] mat = new char[n][n];
			ans = new ArrayList<>();
			for(int i = 0 ; i < n ; i++) {
				Arrays.fill(mat[i], '.');
			}
			generateNQueensArrangement(mat, n , 0);
			return ans;
		
	}

	private static void generateNQueensArrangement(char[][] mat, int n, int i) {
	  if(i == n) {
		  ans.add(stringArrayToList(mat));
		  return;
	  }
		  
	
		for(int j = 0 ; j < n ; j++) {
			if(check(mat, i , j)) {
				mat[i][j] = 'Q'; // placed the queen
				generateNQueensArrangement(mat, n, i+1);
				mat[i][j] = '.'; // revert back the changes or remove the queen
			}
		}
	  
	}

	private static ArrayList<String> stringArrayToList(char[][] mat) {
		ArrayList<String> list = new ArrayList<String>();
		for(char [] str : mat ) {
			 list.add(String.copyValueOf(str));
		}
		return list;
	}

	private static boolean check(char[][] mat, int i, int j) {
		// Step-1 : We are trying to place at columns at (i,j)
		for(int r = 0 ; r < i ; r++) {
			if(mat[r][j] == 'Q') 
				return false;
			
		}
		
		// Step-2 : Check for left diagonal -- i-1 & j-1
		int r = i , c = j;
		while( r >= 0 && c >=0) {
			if (mat[r--][c--] == 'Q') 
				return false;
		}
		
		// Step -3 : Check for right diagonal --> i-1 ,j
		int k = i , l = j;
		int n = mat.length;
		while(k >=0 && l < n) {
			if(mat[k--][l++] == 'Q')
				return false;
		}
		
		return true;
	}

	
}

