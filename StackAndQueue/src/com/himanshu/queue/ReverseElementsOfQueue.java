package com.himanshu.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseElementsOfQueue {

	QueueImplmentation queue = new QueueImplmentation();
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
		int b = 3 ;
		int [] ans = solve (queue, b);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] solve(Queue<Integer> qu, int b) {
		Stack<Integer> stack = new Stack();
		Queue<Integer> q = null ;
		int n = qu.size();
		int ans [] = new int [n];
		int count = b;
		int i = 0;
		
		while(count > 0) {
			stack.push(qu.peek());
			qu.remove();
			count--;
		}
		
		int j = 0 ;
		while(! stack.isEmpty()) {
			q.add(stack.peek());
			j++;
			stack.pop();
		}
		
		while(j < n) {
			q.add(j);
			j++;
		}
		
		for(int k = 0 ; k < ans.length ; k++) {
			ans[k] = qu.peek();
			q.remove();
		}
		
		return ans;
	}

}
