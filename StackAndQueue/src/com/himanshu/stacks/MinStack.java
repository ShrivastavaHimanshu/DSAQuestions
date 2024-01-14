package com.himanshu.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class MinStack {
	
	Stack<Integer>stack = new Stack();
	Stack<Integer>minStack = new Stack();
	int min = Integer.MAX_VALUE;
	public void push(int x) {
		stack.push(x);
		if(minStack.isEmpty()) {
			minStack.push(x);
		}else {
			minStack.push(Math.min(min, x));
		}
		
		
    }

    public void pop() {
      if(stack.isEmpty() && minStack.isEmpty()) {
    	  return;
      }else {
    	  stack.pop();
    	  minStack.pop();
      }
    }

    public int top() {
		if (stack.isEmpty()) {
			return -1;
		}
    	return stack.peek();
        
    }

    public int getMin() {
    	if(minStack.isEmpty())
		return -1;
    return minStack.peek();
        
    }
	

    
    
public static void main(String[] args) {
		// 19 P 10 P 9 g P 8 g P 7 g P 6 g p g p g p g p g p g
		MinStack stack = new MinStack();
		stack.push(19);
		stack.push(10);
		//stack.push(-2);
		stack.pop();
		System.out.println(" top is :" + stack.top());
		System.out.println("ans is "+ stack.getMin() );

	}
    
}

//Node head;
//int minelement ;
//List<Integer> list;
//
//MinStack (){
//	this.head =  null;
//	this.minelement = Integer.MAX_VALUE;
//	this.list = new ArrayList<Integer>();
//}
//
//public void push(int x) {
//	if (x < minelement) {
//		minelement = x ;
//		list.add(minelement);
//	}else {
//		list.add(minelement);
//	}
//    Node n = new Node(x);
//    if(head == null) {
//    	head = n ;
//    }else {
//    	Node temp = head ;
//    	head = n ;
//    	head.next = temp ;
//    }
//}
//
//public void pop() {
//    if(head==null) {
//    	return ;
//    }else {
//    	head = head.next;
//    	//list.remove(head.data);
//    }
//}
//
//public int top() {
//	if (head == null) {
//		return -1 ;
//	}
//	return head.data;
//    
//}
//
//public int getMin() {
//	if(head == null || top() == -1 || list == null) {
//		return -1;
//	}
//	return list.get(top());
//    
//}