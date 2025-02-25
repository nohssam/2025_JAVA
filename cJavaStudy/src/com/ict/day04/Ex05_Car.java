package com.ict.day04;

import java.util.ArrayList;
import java.util.List;

public class Ex05_Car {
	// 판매할 차를 가지고 있는 공간
	private List<String> carList = null;
	
	//  객체를 생성할때 carList가 생성된다.
	public Ex05_Car() {
		carList = new ArrayList<>();
	}
	
	// 해당 메서드를 호출하면 carName 반환
	// 차 생산
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random() * 3)) { //0-2
			case 0: carName = "SM5"; break;			
			case 1: carName = "매그너스"; break;			
			case 2: carName = "카렌스"; break;			
		}
		return carName;
	}
	
	// 차 판매
	public synchronized String pop() {
		String carName = null;
		if(carList.size() == 0) {
			try {
				System.out.println("차가 없네요. 생산 할때 까지 기다리세요");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// carList에 마지막 요소를 삭제(판매)
		// \" =>  쌍따옴표 를 의미한다. 
		carName = carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다... 구입한 차 이름: \"" + carName + "\"");
		return carName;
	}
	
	// 만들어진 차를 받아서 차 리스트에 추가
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어 졌습니다. 차 이름: \"" + car + "\"");
		
		// 판매할 차가 5개 되면 대기상태의 스레드를 준비상태로 전환
		if(carList.size() == 5) {
			this.notify();
		}
	}
}








