/**
 * 
 */
package com.himanshu.graph;

import java.util.*;

/**
 * @author Hshri
 *
 */
public class PathExistinGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] mat = { { 0,1}, { 1, 2 }, { 2, 0} };
		int vertices = 3;
		int src = 0;
		int dest = 2;
		boolean ans = validPath(vertices , mat, src, dest);
		System.out.println(" ans is :" + ans);

	}

	private static boolean validPath(int vertices, int[][] mat, int src, int dest) {
		ArrayList<Integer> [] graphList = createAdcencyList(mat, vertices);
		boolean visitedArray [] = new boolean [vertices+1];
		dfs(graphList, src, visitedArray);
		return visitedArray[dest];
	}

	private static void dfs(ArrayList<Integer>[] graphList, int src, boolean[] visitedArray) {
		visitedArray[src] = true;
		for(int i = 0 ; i < graphList[src].size(); i++) {
			int neighbour = graphList[src].get(i);
			if(!visitedArray[neighbour]) {
				dfs(graphList , neighbour, visitedArray);
			}
		}
	}

	private static ArrayList<Integer>[] createAdcencyList(int[][] mat, int vertices) {
		ArrayList<Integer>[] ans = new ArrayList [vertices+1];
		for(int i = 0 ; i <= vertices ; i++) {
			ans[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i < mat.length ; i++) {
			int u = mat[i][0];
			int v = mat[i][1];
			// As its bi-dresctional graph , we need to add in both the nodes
			ans[u].add(v);
			ans[v].add(u);
		}
		return ans;
	}

}
