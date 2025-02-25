package com.ict.day03;

public class Ex05_Daemon {
	// 데몬 스레드 : 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
	//           주 스레드가 종료되면 데몬 스레드는 강제적으로 자동 종료된다.
	
	public static void main(String[] args) {
		Ex05_Counter count = new Ex05_Counter();
		
		Thread t1 = new Thread(count);
		// 데몬 스레드 만들기
		t1.setDaemon(true);
		t1.start();
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("여기는 메인 : " + i);
		}
		System.out.println("수고하셨습니다.");
	}
}
