package com.ict.day01;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionTestSet01 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복불가, 특정기준으로 정렬이 안됨
		//       단, TreeSet은 항상 오름차순을 유지
		
		// 1. 컬렉션 생성
		// E => Element = 요소 ;
		HashSet<String> h1 = new HashSet<>();
		HashSet<Integer> h2 = new HashSet<>();
		HashSet<Double> h3 = new HashSet<>();
		
		// 2. 컬렉션에 객체 넣기 (add(E e))
		String str1 = "Hello";
		String str2 = "world";
		String str3 = "java";
		
		h1.add(str1);
		h1.add(str2);
		h1.add(str3);
		h1.add(new String("spring"));
		// 중복불가
		h1.add(str2);
		h1.add(new String("Hello"));
		
		System.out.println(h1);
		
		Integer int1 = new Integer(10);
		Integer int2 = new Integer("20");
		
		h2.add(int1);
		h2.add(int2);
		h2.add(new Integer(30));
		h2.add(new Integer(10));
		h2.add(50); // 오토 박싱 : 기본자료형(int) => 래퍼클래스(Integer)로 자동으로 변경
		            // 오토 언박싱 : 래퍼클래스(Integer) => 기본자료형(int)로 자동으로 변경        
		System.out.println(h2);
		
		h3.add(3.14);
		// h3.add(30);  // Integer 가  Double 에 못들간다.
		h3.add(new Double(30));
		h3.add(new Double("40"));
		
		System.out.println(h3);
		
		System.out.println("==================");
	    int[] su = {100,500,600,700};
	    for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
				
		// 컬렉션은 iterator를 사용해서 차례대로 접근 한다.
	    Iterator<Double> it =  h3.iterator();
		Iterator<Integer> it2 =	h2.iterator();
		Iterator<String> it3 = 	h1.iterator();	
				
		while (it3.hasNext()) {
			String msg = (String) it3.next();
			System.out.println(msg+"님");
		}
		
	}
}








