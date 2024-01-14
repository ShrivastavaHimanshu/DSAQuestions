/**
 * 
 */
package com.himanshu.graph;

import java.util.*;


/**
 * @author Hshri
 *
 */
public class BasicGraphImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 4, 1 }, { 2, 4 }, { 3, 4 }, { 5, 2 }, { 1, 3 } };
		int a = 5 ;
		int ans = solve (arr , a);
		System.out.println(" ans is :" + ans);
		int total = 3;
		 
	}

	private static int solve(int[][] arr, int a) {
		ArrayList<Integer>[] graphList = createAdjacencyList(arr, a);
		boolean vis [] = new boolean [a+1];
		System.out.println(" bool is " + vis[1]);
//		for(int i = 1 ; i <= a ; i++) {
//			if(vis[i] == false) {
//				//   graph   , src , dest, vising array  // Here as per question source is 1 and dest is a
//				BFS(graphList , 1 , a , vis);
//				// Using DFS 
//				DFS(graphList , vis, 1);
//			}
//		}
//		boolean isFlag = vis[a];
//		return isFlag ? 1 : 0;
		
		DFS(graphList, vis, 1);
		return vis[a] ? 1 : 0;
	}

	private static void DFS(ArrayList<Integer>[] graphList, boolean[] vis, int src) {

		vis[src] = true;
		// neighbours of s node present at g[s];
		for (int i = 0; i < graphList[src].size(); i++) {
			int neighbour = graphList[src].get(i);
			if (!vis[neighbour]) {
				DFS(graphList, vis, neighbour);
			}
		}
		
		
	}

	private static void BFS(ArrayList<Integer>[] graphList, int src, int dest, boolean[] vis) {
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		vis[src] = true;
		while (q.size() > 0) {
			int u = q.remove();
			for (int i = 0; i < graphList[u].size(); i++) {
				int v = graphList[u].get(i);
				if (vis[v] == false) {
					q.add(v);
					vis[v] = true;
				}
			}

		}

	}

	private static ArrayList<Integer>[] createAdjacencyList(int[][] graphmatrix, int nodes) {
		ArrayList<Integer>[] g = new ArrayList[nodes + 1];
		for (int i = 0; i <= nodes; i++) {
			g[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < graphmatrix.length; i++) {
			int u = graphmatrix[i][0];  // frst node (u) ----> directed to another node (v)
			int v = graphmatrix[i][1];
			g[u].add(v); // only adding once as its directed graph
			// If it would be undirected graph , it would have been  like 
			// g[v].add(u);
		}
		return g;
	}
}
