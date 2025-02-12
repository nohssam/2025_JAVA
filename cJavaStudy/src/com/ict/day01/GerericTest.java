package com.ict.day01;

public class GerericTest {
	public static void main(String[] args) {
		Cola cola = new Cola();
		Water water = new Water();
		
		// 콜라컵
		Cup<Cola> cup = new Cup<Cola>();
		cup.setDrink(cola);
		System.out.println(cup.getDrink());
		
		// 물컵	
		Cup<Water> cup2 = new Cup<Water>();
		cup2.setDrink(water);
		System.out.println(cup2.getDrink());
	}
}
