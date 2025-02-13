package com.ict.day04;

public class Ex01_User extends Thread{
	private Ex01_Bank bank ;
	private boolean isDeposit; 
	private int amount;
	
	

	public Ex01_User(Ex01_Bank bank, boolean isDeposit, int amount, String name) {
		this.bank = bank;
		this.isDeposit = isDeposit;
		this.amount = amount;
		this.setName(name);
	}
	
	@Override
	public void run() {
		if(isDeposit) {
			// 입금
			bank.deposit(amount);
		}else {
			// 출금
			bank.withdraw(amount);
		}
	}

}
