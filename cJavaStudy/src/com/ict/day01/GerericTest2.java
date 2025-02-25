package com.ict.day01;

import java.util.ArrayList;
import java.util.List;

class Drink {}
class Juice extends Drink {}
class AppleJuice extends Juice{}

public class GerericTest2 {
	public static void main(String[] args) {
        // ArrayList<Juice> juiceList = new ArrayList<>();
		// List 인터페이스이고  ArrayList가 List를 상속 받았을 떄 
		// 보통 생성하는 방법
		// 해당 클래스를 자세히 알고 싶으면 이클리스에서는 shift + f2
		
		// Juice라는 클래스를 이용해서 만든 객체를 모아 놓은 ArrayList 객체이다.
		List<Juice> juiceList = new ArrayList<>();
		
		// 공변 : 쓰기 X, 읽기 O, 부모허용하면 자식허용  
		List<? extends Juice> list1 = juiceList;
		
		// 오류 : 읽기만 가능 (쓰기는 오류) 
		// list1.add(new Juice());
		// list1.add(new AppleJuice());
		
		// list1.get(0) => 자료형 juice 이다.
		Juice juice = list1.get(0);
		AppleJuice appleJuice = (AppleJuice) list1.get(0); // 강제 형변환
		Drink drink = list1.get(0); // 업 캐스팅
		System.out.println("===============================");
		
		// 반공변 : 읽기 O,쓰기 O, 자식허용하면 부모허용됨
		List<? super Juice> list2 = juiceList;
		list2.add(new Juice());
		list2.add(new AppleJuice());
		// list2.add(new Drink());
		
		Object obj = list2.get(0);
		Juice juice2 = (Juice) list2.get(0);
		AppleJuice appleJuice2 = (AppleJuice) list2.get(0);
		Drink drink2 = (Drink) list2.get(0);
		
		// 불공변 : 객체 생성할때 상속관계가 의미가 없다.
		//        아래 코딩은 오류
		// List<Drink> list3 = new ArrayList<Juice>();
		
		// 공변의 상위 클래스 제한(? extends T) 
		// 리스트에 담을 수 있는 타입을 제한한다.
		// 쓰기 안됨, 읽기 가능
		
		// 반공변의 하위 클래스 제한 (? super T)
		// 리스트에 담을 수 있는 타입을 제한한다.
		// 쓰기 가능, 읽기(단,Object)
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
