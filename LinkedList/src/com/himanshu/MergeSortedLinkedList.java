//package com.himanshu;
//
//
//
//public class MergeSortedLinkedList {
//
//	public static void main(String[] args) {
//		
//		ListNode head = new ListNode(1);
//		head.next = new ListNode(2, new ListNode(3));
//		printLinkedList(head);
//
//	}
//
//	
//	
//	
//	private static void printLinkedList(ListNode head) {
//		while (head != null) {
//			System.out.print(head.val + "->");
//			head = head.next;
//		}
//	}
//	
//	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//		if (list1 == null || list2 == null)
//			return null;
//
//		ListNode list1Head = list1;
//
//		list1Head.next = list2;
//		ListNode listNewHead = mergeTwoLists(list1.next, list2.next);
//
//		list2.next = listNewHead;
//
//		return list1;
//
//	}
//
//}
