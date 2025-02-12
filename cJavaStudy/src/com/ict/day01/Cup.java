package com.ict.day01;

// 제네닉 사용
public class Cup<T> {
	private T drink;

	public T getDrink() {
		return drink;
	}

	public void setDrink(T drink) {
		this.drink = drink;
	}
	
}
