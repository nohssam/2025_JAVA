package com.ict.day03;

public class Ex04_Main {
	public static void main(String[] args) {
		System.out.println("main:"+Thread.currentThread().getName());
		
		Ex04_Dog dog = new Ex04_Dog();
		Ex04_Cat cat = new Ex04_Cat();
		Ex04_Cow cow = new Ex04_Cow();
		
		// Runnable 에는 start()가 없어서 사용 할 수 없다.
		// dog.start();
		
		Thread t1 = new Thread(dog);
		// dog 클래스를 target으로 dog이 가지고 있는 run에 간다. 
		t1.start();
		
		// 익명 
		new Thread(cat).start();
		new Thread(cow).start();
		
		// 익명 내부클래스 방식: 안드로이드
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("삐약삐약:"+Thread.currentThread().getName());
				}
			}
		}).start();
		
		System.out.println("수고하셨습니다.");
	}
}
