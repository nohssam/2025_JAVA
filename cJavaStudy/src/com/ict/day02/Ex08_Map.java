package com.ict.day02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex08_Map {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국 ,스위스의 수도를 Map 에 저장하고 
		// 나라를 입력하면 해당 나라의 수도가 출력되게 코딩하자.
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("한국", "서울");
		map.put("캐나다", "어타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		// key만 관리하자 (keySet())
		Set<String> keys = map.keySet();
		Scanner scan = new Scanner(System.in);
		
		esc: while(true) {
			System.out.print("나라 입력 >> ");
			String str = scan.next();
			if(keys.contains(str)) {
			  String res = map.get(str);
			  System.out.println(str + "의 수도는 " + res + "입니다.");
			}else {
				System.out.println("데이터가 없는 나라입니다.");
			}
			
			while(true) {
				System.out.print("계속할까요(y/n) ");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc ;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("제대로 입력하세요");
					continue;
				}
			}
		}
	}
}












