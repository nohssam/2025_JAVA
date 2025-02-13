package com.ict.day04;

public class Ex02_Main {
	public static void main(String[] args) {
		Ex02_Wait wait = new Ex02_Wait();
		
		Thread t1 = new Thread(wait, "dog");
		Thread t2 = new Thread(wait, "cat");
		Thread t3 = new Thread(wait, "tiger");
		Thread t4 = new Thread(wait, "lion");
		
		t1.start();	
		t2.start();	
		t3.start();	
		t4.start();	
	}
}
