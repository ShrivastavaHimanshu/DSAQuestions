package com.himanshu.stacks;

class Node {
	int data;
	Node next ;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}

public class StackImplementation {
	
	Node head; 
	int size ;
	
	
	
	StackImplementation(){
		this.head=null;
		this.size = 0;
	}
	
	
	
	public void push (int data) {
		 Node temp = new Node(data);
		 // 1 -> null (head)
		 
		 temp.next = head;
		 size++;
		 head = temp;
	}
	
	
	public int peek () throws Exception {
		if (head==null) {
			//return -1; // underflow condition
			throw new Exception("No elements present in stack");
		}
		return head.data;
		
	}
	
	public int pop() throws Exception {
		if (head==null) {
			//return -1; // underflow condition
			throw new Exception("No elements present in stack");
		}
		// 4 -> 5 -> 1 -> null 
		// pop (4)
		
		int res = head.data;
		head = head.next;
		size--;
		return res;
				
	}

	
	public int size() {
		return size;
	}
	
	
	public boolean isEmpty() {
		return head==null;
	}
}
