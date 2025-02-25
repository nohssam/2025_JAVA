package com.ict.day02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex05_List {
	public static void main(String[] args) {
		// List 인터페이스를 구현한 클래스 :  Vector, ArrayList  : 배열과 흡사한 구조
		// ArrayList : 동기화 지원 X
		//             여러 스레드가 동시에 접근 했을 때 문제 발생  
		// Vector    : 동기화 지원 O
		//             여러 스레드가 동시에 접근 했을 때 문제 발생 해결
		List<String> list = new ArrayList<>();
		List<String> vector = new Vector<>();
		
		// 추가 : add
		list.add("손흥민");
		list.add("김민제");
		list.add("박지성");
		System.out.println(list);
		
		// 삽입 : add(index, element)
		list.add(0, "차두리");
		
		// 손흥민과 김민제 사이에 이강인을 넣자 
		list.add(2, "이강인");
		// 중복가능
		list.add("손흥민");
		
		System.out.println(list);
		System.out.println("==============");
		
		// 검색 : indexOf
		System.out.println(list.indexOf("차두리")); // 차두리 위치
		System.out.println(list.indexOf("손흥민")); // 여러개 있으면 처음 찾는 위치
		System.out.println(list.indexOf("둘리"));  // 없으면 -1
		System.out.println(list.contains("둘리")); // 없으면 false
		
		System.out.println("==============");
		
		// 특정 위치에 있는 요소 추출 ; get(index)
		System.out.println(list.get(3)); // 인덱스가 3인 위치에 있는 요소 반환
		System.out.println(list.get(0)); // 맨 처음 
		System.out.println(list.get(list.size()-1)); // 맨 마지막
		
		// set(index,element) => 바꾸기 치환 
		// 이강인을 찾아서 황희찬으로 변경하자
		// int k = list.indexOf("이강인");
		// list.set(k, "황희찬");
	
		list.set(list.indexOf("이강인"), "황희찬");
		System.out.println(list);
		
		// 하나씩 가져오기
		for (String k : list) {
			System.out.println(k+" ^^");
		}
		System.out.println("============");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k+" ??");
		}
		
		
		
		
		
		
		
		
		
	}
}
