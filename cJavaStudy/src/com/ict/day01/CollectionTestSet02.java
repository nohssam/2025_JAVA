package com.ict.day01;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionTestSet02 {
	public static void main(String[] args) {
		SetExam p1 = new SetExam();
		p1.setName("둘리");
		p1.setAge(3200);
		
		SetExam p2 = new SetExam();
		p2.setName("희동이");
		p2.setAge(3);
		
		SetExam p3 = new SetExam();
		p3.setName("마이콜");
		p3.setAge(24);
		
		HashSet<SetExam> set1 = new HashSet<>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		
		Iterator<SetExam> it2 = set1.iterator();
		while (it2.hasNext()) {
			SetExam k = (SetExam) it2.next();
			if(k.getAge() >= 18) {
				System.out.println(k.getName()+"님 환영합니다.");
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
