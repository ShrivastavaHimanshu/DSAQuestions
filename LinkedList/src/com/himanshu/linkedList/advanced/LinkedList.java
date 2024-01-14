package com.himanshu.linkedList.advanced;

public class LinkedList {

	public static void main(String[] args) {
		int n = 5;
		ListNode nodes = createLinkedList(n);
		while(nodes!=null) {
			System.out.print(nodes.data + ",");
			nodes=nodes.next;
		}

	}

	private static ListNode createLinkedList(int n) {
		ListNode head = new ListNode(1);
		ListNode temp = head;
		for(int i = 2 ; i <=n ; i++) {
			temp.next=new ListNode (i);
			temp=temp.next;
		}
		return head;
	}

}
