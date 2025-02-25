package com.ict.day03;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex03_Cat cat = new Ex03_Cat();
		Ex03_Dog dog = new Ex03_Dog();
		Ex03_Cow cow = new Ex03_Cow();
		
		// run() 호출 : 스레드 아님
		//cat.run(); 
		//dog.run(); 
		//cow.run();
		
		// 스레드 처리됨
		cat.start();
		System.out.println("main : " + Thread.currentThread().getName());
		dog.start();
		System.out.println("main : " + Thread.currentThread().getName());
		cow.start();
		System.out.println("main : " + Thread.currentThread().getName());
		
		System.out.println("main : " + Thread.currentThread().getName());
		System.out.println("수고하셨습니다.");
	}
}
