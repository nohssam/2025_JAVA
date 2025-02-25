package i_review;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Language lang = null; 
				
		Scanner input = new Scanner(System.in);
		System.out.println("언어선택(1.한국어 2.영어 3.일본어) ->");
		int sel = input.nextInt();
		switch(sel) {
		case 1: lang = new Korean(); break;
		case 2: lang = new English(); break;
		case 3: lang = new Japaness(); break;
		}
		
		System.out.println("선택 (1.인사말 2.소개  3.하고픈말)->");
		switch(sel) {
		case 1: lang.greeting(); break;
		case 2: lang.introduce(); break;
		case 3: lang.message(); break;
		}
		
		
		
	}

}
