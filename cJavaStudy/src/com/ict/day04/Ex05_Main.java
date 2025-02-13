package com.ict.day04;

public class Ex05_Main {
	public static void main(String[] args) {
		Ex05_Car car = new Ex05_Car();
		
		Ex05_Producer producer = new Ex05_Producer(car);
		Ex05_Customer customer = new Ex05_Customer(car);
		
		Thread tProducer = new Thread(producer);
		Thread tCustomer = new Thread(customer);
		
		tProducer.start();
		tCustomer.start();
	}
}
