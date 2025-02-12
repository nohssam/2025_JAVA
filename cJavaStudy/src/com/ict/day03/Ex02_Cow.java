package com.ict.day03;

public class Ex02_Cow {
	public void play() {
		for (int i = 0; i < 100; i++) {
			System.out.println("음~메~ : " + Thread.currentThread().getName());
		}
	}
}
