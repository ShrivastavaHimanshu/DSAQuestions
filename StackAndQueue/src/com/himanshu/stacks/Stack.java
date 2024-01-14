package com.himanshu.stacks;

public class Stack {

	public static void main(String[] args) throws Exception {
		StackImplementation stack = new StackImplementation();
		stack.push(3);
		stack.push(4);
		System.out.println("size is " + stack.size);
		stack.pop();
		stack.pop();
		
System.out.println("size is " + stack.size);
stack.pop();
	}

}
