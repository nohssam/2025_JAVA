package com.ict.day04;

public class Ex02_Wait implements Runnable{
	// wait(): 동기화 처리 할때 현재 실행 중인 스레드를 강제로 대기 상태로 변경 시기는 메서드
	// wait()된 스레드는  대기상태로 있는데, 준비상태로 가지 않아 다시 실행하지 못한다.
	// notify(), notifyAll() 이용해서 준비상태로 만들어 준다. 
	// notify(), notifyAll() : wait 된 스레드 풀어주는 메서드
	
	
	int x = 0 ;
	
	@Override
	public synchronized void run() {
		for(int i=0; i < 50; i++) {
			System.out.println(++x + ":" + Thread.currentThread().getName());
			if(x == 10) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else if(x == 11){
				notifyAll();
			}
			
		}
	}
}
