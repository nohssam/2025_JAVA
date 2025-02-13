package com.ict.day03;

public class Ex07_Main {
	public static void main(String[] args) {
		
		Ex07_Sync sync = new Ex07_Sync();
		
		Thread t1 = new Thread(sync,"dog");
		Thread t2 = new Thread(sync,"cat");
		Thread t3 = new Thread(sync,"tiger");
		Thread t4 = new Thread(sync,"lion");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
