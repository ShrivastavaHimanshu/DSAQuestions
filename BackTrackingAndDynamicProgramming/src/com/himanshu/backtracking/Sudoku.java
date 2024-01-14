package com.himanshu.backtracking;

public class Sudoku {

	public static void main(String[] args) {
		//ch [] [] = {{53..7....}, {6..195...}, {.98....6.}, {8...6...3}, {4..8.3..1}, {7...2...6}, {.6....28.}, {...419..5}, {....8..79}}

	}
	
	public void solveSudoku(char[][] A) {
        solve(A, 0 , 0);
	}

	private boolean solve(char[][] suduko, int row, int col) {
		int n = suduko.length;
		if(row >= n) {
			return true;
		}
		
		int nextCol = col+1==n ? 0 : col+1;
		int nextRow = col+1==n ? 0 : col+1;
		
		if(suduko[row][col] != '.') {
			return solve(suduko, nextRow, nextCol);
		}
		
		// If not we need to cehck for all possible solution
		for(char i = '1' ; i <= '9' ; i++) {
			 if(checkOption(suduko, row, col, i)) {
				 suduko[row][col] = i; // setting value
				 if (solve(suduko, nextRow, nextCol)){
					 return true;
				 }
				 suduko[row][col] = '.'; // undo changes
			 }
		}
		return false;
	}

	private boolean checkOption(char[][] suduko, int row, int col, char option) {
		// check for all rows
		int n = suduko.length;
		for(int i = 0 ; i < n ; i++ ) {
			if(suduko[row][i] == option) {
				return false;
			}
		}
		// check for all cols 
		for(int i = 0 ; i < n ; i++ ) {
			if(suduko[i][col] == option) {
				return false;
			}
		}
		
		
		// check for square boxez
		
		int startRow = (row/3)*3, startCol = (col/3)*3;
		
		for(int i = startRow ; i < startRow+3 ; i++) {
			for(int j = startCol ; j < startCol+3 ; j++) {
				if(suduko[i][j] == option) {
					return false;
				}
			}
			
		}
		
		return true;
	}

}
