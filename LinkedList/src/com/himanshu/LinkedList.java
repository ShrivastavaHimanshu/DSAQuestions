package com.himanshu;

class Node {

	public int data;
	public Node next;

	public Node() {
		this.data = 0;
		this.next = null;
	}

	
}

public class LinkedList {

	static Node head = null;
	static int sizeOfLL = 0;

	public static void insert_node(int position, int value) {
		
		if(position >= 1 && position<= sizeOfLL+1) {
			Node temp = new Node();
			temp.data = value;
			if (position==1) {
				temp.next=head;
				head = temp;
			}else {
				int count = 1;
				Node prev_Node = head;
				while (count < position - 1) {
					prev_Node=prev_Node.next;
					count++;
				}
				
				temp.next=prev_Node.next;
				prev_Node.next=temp;
			}
			sizeOfLL++;
		}
	}
	
	public static void delete_node(int position) {
		if (position >= 1 && position <= sizeOfLL) {
		Node temp = null;
	    if (position==1) {
	    	temp=head;
	    	head = head.next;
	    } else {
	    	int count = 1;
			Node prev_Node = head;
			while (count < position - 1) {
				prev_Node=prev_Node.next;
				count++;
			}
			temp=prev_Node.next;
			prev_Node.next=prev_Node.next.next;	
	    }  
	    sizeOfLL--;
		}
    }
	
	 public static void print_ll() {
		 Node temp = head;
		    int flag = 0;
		    while (temp != null) {
		        if (flag == 0) {
		            System.out.print(temp.data);
		            flag = 1;
		        } else
		            System.out.print(" " + temp.data);
		        temp = temp.next;
		    }
	    }

}
