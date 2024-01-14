package com.himanshu.advanced.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pair {
	int value;
	int index;
	
	Pair (int value, int index){
		this.value=value;
		this.index = index;
	}
}



public class MaxDistance {

	public static void main(String[] args) {
		int arr [] = {3, 5, 4, 2};
		int ans = maximumGap(arr);
		System.out.println("ans is :" + ans);
	}

	private static int maximumGap(int[] arr) {
		// First we will create a list of pairs using given array
		
		List<Pair> indexPair = new ArrayList<>();
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			Pair p = new Pair(arr[i], i+1);
			indexPair.add(p);
		}
//		for( Pair p : indexPair) {
//			System.out.println(" value is " + p.value + "index is " + p.index);
//		}
		
		
		// Sort the indexpair list on value of value
		
		Collections.sort(indexPair, new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				if(o1.value < o2.value) {
					return -1;
				}else if(o1.value > o2.value) {
					return 1;
				}
				return 0;
			}
		});
		
		// Now iterate the list in reverse order and make two variables
		// 1 - Max Value of J and update it , Inititally it will be index of last pair
		// 2 - ans which initially be 0;
		
		int ans = 0;
		int maxIndex = indexPair.get(indexPair.size()-1).index;
		
		
		for(int i = indexPair.size()-1; i >=0 ; i--) {
			Pair tempPair = indexPair.get(i);
			
			
			ans = Math.max(ans, maxIndex-tempPair.index);
			maxIndex = Math.max(maxIndex, tempPair.index);
			
		}
		return ans;
	}

}
