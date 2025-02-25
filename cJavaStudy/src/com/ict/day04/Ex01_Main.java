package com.ict.day04;

public class Ex01_Main {
	public static void main(String[] args) {
		
		Ex01_Bank bank = new Ex01_Bank(10000);
		
		Ex01_User user1 = new Ex01_User(bank, true, 500, "hong");
		Ex01_User user2 = new Ex01_User(bank, false, 15500, "kang");
		Ex01_User user3 = new Ex01_User(bank, false, 500, "hong");
		Ex01_User user4 = new Ex01_User(bank, true, 1500, "kim");
		Ex01_User user5 = new Ex01_User(bank, false, 500, "noh");
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		
		try {
			user1.join();
			user2.join();
			user3.join();
			user4.join();
			user5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("잔액 : " + bank.getTotal());
	}
}
