package com.ict.day04;

//두 개의 스레드를 생성하여 첫번째 스레드의 출력 1-50까지 출력하고,
//두번째 스레드의 출력은 51-100까지 출력하고,
//다시 첫번째 스레드가 101-150까지 출력하고, 
//두번째 스레드가 151-200 출력 (synchronized 사용)

public class Ex04_Wait implements Runnable{
	int x = 0 ;
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + ++x);
			if(x == 50 || x == 100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else if(x == 51 || x == 101) {
				notifyAll();
			}
			
			
//			if(x%50==0 ) {
//				try {
//					wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			notifyAll();
			
		}		
	}
	
}
