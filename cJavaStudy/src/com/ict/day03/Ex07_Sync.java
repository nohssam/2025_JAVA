package com.ict.day03;

public class Ex07_Sync implements Runnable{
	// 임계영역 : 멀티스레드에서 공유자원이 참조될 수 있는 코드의 범위
	//         이 영역에서 실행 중인 스레드는 다른 스레드에게 제어권을 빼앗길 수 있는 문제 발생 
	//         이러한 문제를 해결하기 위한 방법이 동기화 이다.
	
	// 동기화 처리: 먼저 차지하고 있는 스레드가 끝날때까지 다른 스레드가 제어권을 빼앗을 수 없게 락을 걸어버린다.
	// 해당 메서드 반환형 앞에 synchronized 예약어를 사용한다.
	
	int x = 0 ;
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + ":" + Thread.currentThread().getName());
		}
		
	}
}
