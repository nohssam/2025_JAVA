package com.ict.day04;

public class Ex05_Producer implements Runnable{
	private Ex05_Car car;
	
	public Ex05_Producer(Ex05_Car car) {
		this.car = car ; 
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (Exception e) {
			}
		}
		
	}
}
