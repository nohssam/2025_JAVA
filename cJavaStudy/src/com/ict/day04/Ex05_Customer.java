package com.ict.day04;

public class Ex05_Customer implements Runnable{
	private Ex05_Car car;
	
	public Ex05_Customer(Ex05_Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.pop();
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
