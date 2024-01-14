package com.himanshu.stacks;

import java.util.*;
import java.util.Stack;
public class MaximumOccurrenceElementinStack {

	static HashMap<Integer , Integer> freqMap = new HashMap<>();
	static  Map<Integer, Stack<Integer>> setMap = new HashMap<>();
	static int maxFreq = 1;
	
	public static void main(String[] args) {

		 push(4);
	        push(6);
	        push(7);
	        push(6);
	        push(8);
		System.out.println(pop());
		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//		
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());

	}

	static List<Integer> list = new ArrayList<Integer>();
	static void push(int i ) {
		int cFreq = freqMap.getOrDefault(i, 0) + 1;
		freqMap.put(i, cFreq);
		maxFreq = Math.max(maxFreq, cFreq);
		if(!setMap.containsKey(cFreq)) {
			setMap.put(cFreq, new Stack());
		}
		Stack<Integer> tempStack = setMap.get(cFreq);
		tempStack.add(i);
		setMap.put(cFreq, tempStack);
	}
	
	static int pop () {
		if(maxFreq <=0) {
			return -1;
		}
		int ans = setMap.get(maxFreq).pop();
		freqMap.put(ans, freqMap.get(ans)-1);
		if(setMap.get(maxFreq).size()==0) {
			maxFreq--;
		}
		return ans;
		
	}
	
}



//if(freqMap.containsKey(i)) {
//	freqMap.put(i, freqMap.get(i)+1);
//	List<Integer> levelList ;
//	if (ListMap.containsKey(freqMap.get(i))) {
//		levelList = ListMap.get(freqMap.get(i));
//	} else {
//		levelList = new ArrayList<Integer>();
//	}
//	levelList.add(i);
//	ListMap.put(freqMap.get(i), levelList);
//	maxFreq = Math.max(maxFreq, freqMap.get(i));
//}else {
//	freqMap.put(i, 1);
//	list.add(i);
//	ListMap.put(1, list);
//}

//////////////////////////





//if (maxFreq <= 0) {
//	return -1;
//}
//int ans = 0 ;
//List<Integer> listAns = ListMap.get(maxFreq);
//ans = listAns.get(listAns.size()-1);
//listAns.remove(listAns.size()-1);
//ListMap.put(maxFreq, listAns);
//if(listAns.size()==0) {
//	maxFreq--;
//}
//freqMap.put(ans, freqMap.get(ans)-1);
//return ans;