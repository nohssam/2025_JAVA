package com.ict.day03;

public class Ex05_Counter implements Runnable{
    @Override
    public void run() {
    	for (int i = 0; i < 300; i++) {
    		// 1000 -> 1초
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("숫자 : " + i);
		}
    	
    }
}
