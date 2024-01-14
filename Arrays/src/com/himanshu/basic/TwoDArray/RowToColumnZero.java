package com.himanshu.basic.TwoDArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RowToColumnZero {

	public static void main(String[] args) {
		int[][] a = { 
				  {1,2,3,4},
				  {5,6,7,0},
				  {9,2,0,4}
				  };
		int[][] ans = solve(a);
		int rows = ans.length;
		int cols = ans[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] solve(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		Set<Integer> temprows = new HashSet<Integer>();
		Set<Integer> tempcols = new HashSet<Integer>();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] == 0) {

					temprows.add(i);
					tempcols.add(j);
				}
			}
		}

		// iterating over array and making corresponding rows & cols as zero

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (temprows.contains(i) || tempcols.contains(j)) {
					a[i][j] = 0;
				}
			}
		}
		return a;
	}

	

	public static void columnToZero(int[][] a, int temp_cols, int rows) {
		int count = 0;
		while (count < rows) {
			a[count][temp_cols] = 0;
			count++;
		}

	}

	public static void rowsToZero(int[][] a, int temp_rows, int cols) {

		int count = 0;
		while (count < cols) {
			a[temp_rows][count] = 0;
			count++;
		}
	}

}
