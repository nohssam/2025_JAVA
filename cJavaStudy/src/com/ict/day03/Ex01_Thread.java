package com.ict.day03;

public class Ex01_Thread {
	// 스레드(담당일꾼): 현재 실행 중인 프로그램 내에서 실행되는 세부 작업 단위
	// 싱글 스레드 : 스레드가 하나, 
	// 멀티 스레드 : 스레드가 여러개 , 병행처리
	// 자바에서 스레드 생성(일꾼생성): start() -> run() 
	
	// 스레드 생성 방법
	// 1. Thread 클래스 이용 : start(), run() 둘 다 존재한다.
	// 2. Runnable  인터페이스 이용 : run()만 존재한다.(start X)
	
	// Thread 클래스 가지고 생성
	// 1. Thread(), 2. Thread(Runnable 인터페이스를 상속받은 객체)
	// 3. Thread(스레드이름지정), 
	// 4. Thread(Runnable 인터페이스를 상속받은 객체, 스레드 이름지정)
	
	public static void main(String[] args) {
		// 현재 실행 중인 스레드 이름 구하기 
		System.out.println(Thread.currentThread().getName());
		
		// 인스턴스 메서드,변수 ; 객체 생성할 때 같이 만들어지는 메서드와 변수를 말함
		Ex01_Thread test = new Ex01_Thread();
		
		test.sound();
		System.out.println(Thread.currentThread().getName());
		
		test.play();
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public void sound() {
		// 현재 실행 중인 스레드 이름 구하기 
		System.out.println("sound :" + Thread.currentThread().getName());
		
		// 만약에 무한 루프를 넣으면 자기를 호출한 곳으로 갈 수없다.
	}
	
	public void play() {
		// 현재 실행 중인 스레드 이름 구하기 
		System.out.println("play : " + Thread.currentThread().getName());
	}
	
}
