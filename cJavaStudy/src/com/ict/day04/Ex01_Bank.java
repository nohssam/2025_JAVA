package com.ict.day04;

public class Ex01_Bank {
	private int total;

	
	public Ex01_Bank(int total) {
		this.total = total;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	// 입금 (동기화 처리)
	public synchronized void deposit(int amount) {
		total += amount ;
		System.out.println(Thread.currentThread().getName()
				+ " 입금 : " + amount + ", 총액: " + total);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// 출금 (동기화 처리)
	public synchronized void withdraw(int amount) {
		if(total >= amount) {
			total -= amount ;
			System.out.println(Thread.currentThread().getName()
					+ " 출금 : " + amount + ", 총액: " + total);
		}else {
			System.out.println(Thread.currentThread().getName()
					+ " 잔액 부족 : " + total);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
