package com.himanshu.linkedList.advanced;

import java.util.List;

public class DeleteMiddleElementOfLinkedList {

	public static void main(String[] args) {
		int n = 5;
		ListNode nodes = createLinkedList(n);
		ListNode head = deleteNode(nodes);
		printLinkedList(head);

	}

	
	private static void printLinkedList(ListNode nodes) {
		while(nodes!=null) {
			System.out.print(nodes.data + ",");
			nodes=nodes.next;
		}
		
	}
	
	private static ListNode deleteNode(ListNode nodes) {
	
		ListNode head = nodes;
		
		
		// frst find middle Element
		
		ListNode slow = nodes;
		ListNode fast = nodes;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode middleNode = slow ;
		ListNode temp = head ;
		while(temp.next != middleNode) {
			
			temp = temp.next;
		}
		
		
		temp.next = middleNode.next;
		return head;
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
