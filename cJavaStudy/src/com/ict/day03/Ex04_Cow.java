package com.ict.day03;

public class Ex04_Cow implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("음메~ : " + Thread.currentThread().getName());
		}
	}
}
