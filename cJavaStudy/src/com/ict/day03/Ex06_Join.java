package com.ict.day03;

public class Ex06_Join implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("run : " + Thread.currentThread().getName());
		}
		
	}
}
