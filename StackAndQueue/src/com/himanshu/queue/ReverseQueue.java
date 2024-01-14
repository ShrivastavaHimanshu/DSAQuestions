package com.himanshu.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

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
		int [] ans  = reverseQueue(queue);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] reverseQueue(Queue<Integer> queue) {
		
		Stack<Integer> stack = new Stack ();
		
		while(queue.size() > 0) {
			stack.push(queue.peek());
			queue.remove();
		}
		
		while(! stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();
		}
		
		
		int ans [] = new int [queue.size()];
		
		for(int i = 0 ; i < ans.length ; i++) {
			ans[i] = queue.peek();
			queue.remove();
		}
		return ans;
	}

}
