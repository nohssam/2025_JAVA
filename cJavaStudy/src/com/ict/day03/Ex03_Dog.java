package com.ict.day03;

//Thread 클래스 : start(), run() 존재한다.
public class Ex03_Dog extends Thread{
	
//	@Override
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("멍멍~ : " + Thread.currentThread().getName());
//		}
//	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("멍멍~ : " + Thread.currentThread().getName());
		}
	}
}
