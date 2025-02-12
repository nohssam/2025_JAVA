package com.ict.day03;

public class Ex02_Cat {
	public void play() {
		for (int i = 0; i < 100; i++) {
			System.out.println("야~옹~ : " + Thread.currentThread().getName());
		}
	}
}
