package com.ict.day03;

public class Ex02_Dog {
	
	public void play() {
		for (int i = 0; i < 100; i++) {
			System.out.println("멍~멍~ : "+ Thread.currentThread().getName());
		}
	}
}
