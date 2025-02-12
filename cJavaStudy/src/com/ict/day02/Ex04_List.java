package com.ict.day02;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Ex04_List {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>();
		List<String> s2 = new Stack<String>();
		
		// 추가, 
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		
		// 삽입
		s1.add(1, "손흥민");
		s1.add(3, "차두리");
		
		// 입력 순서대로
		System.out.println(s1);
		
		String res = s1.peek();
		System.out.println(res);
		
		// peek는 마지막 요소를 삭제하지 않는다.
		System.out.println(s1);
		
		res = s1.pop();
		System.out.println(res );
		// pop은 마지막 요소를 삭제 한다.
		System.out.println(s1);
		
		// 해당 인자를 포함하고 있는지 알 수 있다.
		boolean b1 = s1.contains("차두리");
		System.out.println(b1);
		
		if(s1.contains("김민재")) {
		  int su =s1.indexOf("김민재");
		  System.out.println("김민재는 " + (su+1) + "번째 있습니다.");
		}else {
			System.out.println("김민재는 없네요");
		}
		
		if(s1.contains("공실이")) {
			int su = s1.search("공실이");
			System.out.println("공실이는 " + su + "번째 있습니다.");
		}else {
			System.out.println("공실이는 없네요");
		}
		
		System.out.println("==================");
		// index가 3인 요소 반환 (4번째)
		System.out.println(s1.get(3));
		
		// index가 1인 요소 반환 (2번째)
		System.out.println(s1.elementAt(1));
		
		System.out.println(s1.firstElement());
		System.out.println(s1.lastElement());
		
		System.out.println("==================");
		
		// 하나씩 추출 하는 것은 개선된 for문, iterator() 사용가능
		for (String k : s1) {
			System.out.println(k);
		}
		
		System.out.println("==================");
		Iterator<String> it = s1.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k+"님 환영");
			
		}
	}
}








