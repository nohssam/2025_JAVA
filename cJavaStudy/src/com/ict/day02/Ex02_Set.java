package com.ict.day02;

import java.util.Set;
import java.util.TreeSet;

public class Ex02_Set {
	public static void main(String[] args) {
		// 1-10까지 랜덤 숫자 6개 출력  중복 안되게 
		int[] numbers = new int[6];
		
		for (int i = 0; i < numbers.length; i++) {
			int num = (int) ((Math.random()*10) + 1) ;
			
			// 중복검사
			for (int j = 0; j < i; j++) {
				// 중복이면
				if(numbers[j] == num) {
					// 새로 난수 발생
					num = (int) ((Math.random()*10) + 1) ;
					// 처음부터 다시 중복 검사 
					j = -1 ;
				}
			}
			numbers[i] = num;
		}
		
		// 개선된 for문
		// 배열 numbers 요소를 하나씩 꺼내서 int i 저장
		//  : 의 의미가 처음부터 끝까지라는 의미
		// 단, 특정요소만을 처리할때는 더 불편하다.(이유: index가 존재하지 않음)
		for (int i : numbers) {
			System.out.print(i +"  ");
		}
		System.out.println();
		
		
		// 1-10까지 랜덤 숫자 6개 출력  중복 안되게 (Set)
		Set<Integer> set1 = new TreeSet<Integer>();
		while(set1.size() < 6) {
			int su = (int)(Math.random()*10)+1 ;
			set1.add(su);
		}
		System.out.println(set1);
	}
}










