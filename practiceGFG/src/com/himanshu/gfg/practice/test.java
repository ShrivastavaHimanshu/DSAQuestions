package com.himanshu.gfg.practice;

public class test {

	public void run () throws NullPointerException{
		// 
		System.out.println("akhgfkhagf");
	}
}


class testBody extends test{
	public String test() throws RuntimeException{
		return "skjdhkjdh";
	}
	
	public static void main(String[] args) {
		testBody t = new testBody();
		System.out.print(t.test());
	}
} 