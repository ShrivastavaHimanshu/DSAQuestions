package com.himanshu.queue;

class Node {
	int data ;
	Node next ;
	
	Node (int data){
		this.data = data;
		this.next = null;
	}
}

// Enqueue -> Enter  element in queue
// DeQueue -> Delete element from queue
// front -> element present in last
// rear -> element present in first
// size -> size of queue


public class QueueImplmentation {
	
	
	Node head ; 
	Node temp ;
	public int size ;
	
	QueueImplmentation (){
		this.head = null;
		this.temp = null;
		this.size = 0;
				
	}
	
	public int front() throws Exception {
		if (head==null) {
			throw new Exception("Queue is Empty ! ");
		}else {
			return head.data;
		}
	}
	 
	public int rear() throws Exception {
		if (head==null) {
			throw new Exception("Queue is Empty ! ");
		}else {
			return temp.data;
		}
	}

	public void enqueue(int data) {
		Node n = new Node(data);
		if (head==null) {
			head = n ;
			temp = n;
		}else {
			temp.next=n;
			temp = temp.next;
		}
		size++;
		
	}


	public int dequeue() {
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}

	public int size() {
		return size;
}

}



