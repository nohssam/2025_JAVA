package com.ict.day02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex07_Map {
	public static void main(String[] args) {
		// Map 인터페이스 : Key와 Value를  1:1 매핑하는 구조
		//              Key를 호출하면 Value가 온다.
		//              Key는 중복될수 없다.
		//              Set은 추가 안됨, Map은 덮어쓴다.(Set과는 다르다)
		//              Key를 별도로 Set에서 관리 => keySet()
		//              add() 관련된 메서드로 추가 할 수 없다.
		//              put(key, value)로 추가 
		
		// 1. 생성
		Map<String,String> map = new HashMap<>();
		// 추가
		map.put("이름", "홍길동");
		map.put("나이", "24");
		map.put("주소", "제주도");
		map.put("취미", "낚시");
		
		
		// 특정요소 가져오기 : get
		System.out.println(map.get("이름"));
		System.out.println(map.get("취미"));
		System.out.println(map.get("직업")); // 키가 없으면 null
		
		
		// 하나씩 꺼내서 출력하기
		Set<String> keys = map.keySet();
		Iterator<String> it =keys.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);         // key 
			System.out.println(map.get(k));// value
		}
		
	}
}
