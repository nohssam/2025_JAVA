package com.ict.day04;

// 두 개의 스레드를 생성하여 첫번째 스레드의 출력 1-50까지 출력하고,
// 두번째 스레드의 출력은 51-100까지 출력하고,
// 다시 첫번째 스레드가 101-150까지 출력하고, 
// 두번째 스레드가 151-200 출력 (synchronized 사용)
public class Ex04_Main {
	public static void main(String[] args) {
		Ex04_Wait wait = new Ex04_Wait();
		
		Thread t1 = new Thread(wait, "dog");
		Thread t2 = new Thread(wait, "cat");
		
		t1.start();
		t2.start();
	}
}
