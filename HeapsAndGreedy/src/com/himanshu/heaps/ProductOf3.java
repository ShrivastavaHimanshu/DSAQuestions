/**
 * 
 */
package com.himanshu.heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * @author Hshri
 *
 */
public class ProductOf3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4, 5};
		int ans [] = solve(arr);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

// Steps 
	// Put element in maxHeap 
	// pop all the element from max heap and then again push , this way it will always maintain the order
	private static int[] solve(int[] arr) {
		int n = arr.length;
		int ans [] = new int [n];
		int currProduct = 1;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i = 0 ; i < n ; i++) {
			maxHeap.add(arr[i]);
			if(i < 2) {
				ans[i] = -1;
			}else {
				int a = maxHeap.remove();
				int b = maxHeap.remove();
				int c = maxHeap.remove();
				
				ans[i] = a*b*c;
				
				// again push in maxheap , so order is maintained
				
				maxHeap.add(a);
				maxHeap.add(b);
				maxHeap.add(c);
			}
		}
		return ans;
	}

}
