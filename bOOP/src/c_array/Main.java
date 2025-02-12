package c_array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student[] s = new Student[3];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<s.length; i++) {
			
			s[i] = new Student();
					
			System.out.println("이름->");
			s[i].setName( input.next() );
			// 국,영,수 입력받기
			
			System.out.println(s[i].getName() + "총점:" + s[i].calcTotal());
			System.out.println(s[i].getName() + "평균:" + s[i].calcAvg());
		}

	}

}
