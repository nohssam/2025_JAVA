package com.ict.day02;

import java.util.LinkedList;
import java.util.Queue;

public class Ex06_Queue {
	public static void main(String[] args) {
		// Queue 인터페이스 : FIFO(먼저들어온 데이터가 먼저 나감)
		//       구현 클래스 : LinkedList(동기화 안됨)
		LinkedList<String> link = new LinkedList<>();
		Queue<String> link2 = new LinkedList<String>();
		
		// 추가 : add, addFirst, addLast, offer, offFirst, offLast
		link.add("둘리");
		link.offer("도우너");
		link.addFirst("마이콜");
		link.addLast("희동이");
		link.add("둘리"); // 중복가능
		
		// 둘리와 도우너 사이에 공실이 넣기
		link.add(2, "공실이");
		
		System.out.println(link);
		System.out.println("==============");
		
		// 검색 : indexOf, lastIndexOf
		System.out.println(link.indexOf("둘리"));
		System.out.println(link.lastIndexOf("둘리"));
		System.out.println(link.indexOf("또치")); // 없으면 -1
		System.out.println("==============");
		
		// 특정 위치에 있는 요소 추출 : get(index)
		System.out.println(link.get(3));
		
		System.out.println(link.getFirst());
		System.out.println(link.get(0));
		
		System.out.println(link.getLast());
		System.out.println(link.get(link.size()-1));
		
		// 도우너를 또치로 변경하자 
		link.set(link.indexOf("도우너"), "또치");
		System.out.println(link);
		
		for (String k : link) {
			System.out.println(k + " &&");
		}
	}
}




