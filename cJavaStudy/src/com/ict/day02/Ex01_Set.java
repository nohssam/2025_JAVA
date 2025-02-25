package com.ict.day02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01_Set {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new TreeSet<>();
		
		// 넣기
		set1.add("자바");
		set2.add("자바");
		
		set1.add("java");
		set2.add("java");
		
		set1.add("JAVA");
		set2.add("JAVA");
		
		set1.add("Java");
		set2.add("Java");
		
		set1.add("jsp");
		set1.add("Spring");
		
		set2.add("jsp");
		set2.add("Spring");
		
		System.out.println(set1); // 
		System.out.println(set2); // 자동으로 오름차순
		
		HashSet<String> set3 = new HashSet<>();
		set3.add("HTML");
		set3.add("자바");
		
		// set1에 모든 정보를  set3에 추가 하자 (addAll)
		set3.addAll(set1);
		
		System.out.println(set3);
		
		// 삭제하기 : remove(Object o), clear()
		set3.remove("자바");
		set3.clear();
		
		System.out.println(set3);
		System.out.println(set3.isEmpty()); // 비어있으면 true
		System.out.println(set1.isEmpty()); // 객체가 있으면 false
		System.out.println(set3.size()); // 요소의 수
		System.out.println(set1.size()); 
		System.out.println(set1.contains("자바"));    // 자바가 있으면 true
		System.out.println(set1.contains("spring")); // 자바가 없으면 false
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
