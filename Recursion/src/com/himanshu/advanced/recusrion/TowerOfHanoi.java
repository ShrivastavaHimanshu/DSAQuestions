package com.himanshu.advanced.recusrion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TowerOfHanoi {

	public static void main(String[] args) {

		int a = 3;
		ArrayList<ArrayList<Integer>> ans = towerOfHanoi(a);
		for(ArrayList<Integer> list : ans) {
			for(int i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}
	
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
	private static ArrayList<ArrayList<Integer>> towerOfHanoi(int a) {
		int source = 1; int temp = 2; int destination = 3;
		toh(a , source, temp, destination);
		return ans;
	}
	
	private static void toh(int a, int source, int temp, int destination) {
		if (a==0) {
			return;
		}
		toh(a-1, source, destination,temp);
		List<Integer> l = Arrays.asList(a, source, destination);
		
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(source);
		list.add(destination);
		ans.add((ArrayList<Integer>) list);
		toh(a-1, temp, source,destination);
		
		
	}
}