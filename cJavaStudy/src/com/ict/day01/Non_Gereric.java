package com.ict.day01;

public class Non_Gereric {
	public static void main(String[] args) {
		// 물컵에 물을 담자 
		Water water = new Water();
		WaterCup waterCup = new WaterCup();
		// 클래스에서 데이터 넣는 방법 : 생성자,  setter 이용
		waterCup.setWater(water);
		System.out.println(waterCup.getWater());
		
		// 콜라컵에 콜라를 담자 
		Cola cola = new Cola();
		ColaCup colaCup = new ColaCup();
		colaCup.setCola(cola);
		System.out.println(colaCup.getCola());
		
		// 콜라컵에 물을 담자(오류)
		// colaCup.setCola(water);
		
	}
}
