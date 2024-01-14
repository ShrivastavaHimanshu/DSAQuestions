package com.himanshu.advanced;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class pair{
	int x ;
	int y ;
	
	pair(int x , int y ){
		this.x=x;
		this.y=y;
	}

	public pair() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pair other = (pair) obj;
		return x == other.x && y == other.y;
	}
	
	
	
}

public class CountRectangles {

	public static void main(String[] args) {
		int [] A = {1, 1, 2, 2, 3, 3};
		int [] B = {1, 2, 1, 2, 1, 2} ;
		int ans = solve (A, B);
		System.out.println(" count is : " + ans);

	}

	private static int solve(int[] a, int[] b) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		Set<pair> set = new HashSet<>();
		int n = a.length;
		int count = 0;
		for(int i = 0 ; i < n ; i++) {
			int x = a[i], y = b[i];
			set.add(new pair(x,y));
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = i+1 ; j < n ; j++) {
				int x1 = a[i] , y1 = b[i];
				int x2 = a[j] , y2 = b[j];
				
				if (x1==x2 || y1==y2)
					continue;
				
				// other two points 
				
				pair p1 = new pair(x2, y1);
				pair p2 = new pair(x1, y2);
				
				if (set.contains(p1) && set.contains(p2)) {
					count++;
				}
			}
		}
		
		
		return count/2;
	}

}
