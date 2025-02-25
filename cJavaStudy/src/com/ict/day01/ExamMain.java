package com.ict.day01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExamMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 성적을 담을 객체 필요하다.
		// Set 를 이용해서 성적 객체를 담자 
		
		// HashSet<E> set1 = new HashSet<>();
           Set<ExamVO> set1 = new HashSet<>();
           
       esc:while(true) {
    	   try {
        	System.out.print("이름 : ");
        	String name = scan.next();
        	System.out.print("국어 : ");
        	int kor = scan.nextInt();
        	System.out.print("영어 : ");
        	int eng = scan.nextInt();
        	System.out.print("수학 : ");
        	int math = scan.nextInt();
        	
        	ExamVO vo = new ExamVO(name, kor, eng, math);
        	System.out.println(vo);
        	set1.add(vo);
    	   }catch (Exception e) {
			System.out.println("점수는 숫자로 넣어주세요");
			scan.next(); // 입력버퍼 지우기
			continue esc;
    	   }
        	while(true) {
        		System.out.print("계속할까요(y/n)? ");
        		String msg = scan.next();
        		if(msg.equalsIgnoreCase("y")) {
        			continue esc;
        		}else if(msg.equalsIgnoreCase("n")) {
        			break esc;
        		}else {
        			System.out.println("제대로 입력하세요");
        			continue ;
        		}
        	}
        }
       System.out.println();
       scan.close();
       // 출력
       Iterator<ExamVO> it =set1.iterator();
       while (it.hasNext()) {
		ExamVO k = (ExamVO) it.next();
		System.out.print(k.getName() + "\t"); // 탭
		System.out.print(k.getSum() + "\t");
		System.out.print(k.getAvg() + "\t");
		System.out.print(k.getHak() + "\n");  // 줄 바꿈
		
		
	}
	}
}








