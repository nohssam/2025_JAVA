package c_control;

import java.util.Scanner;

public class Ex03_for_연습3 {

	public static void main(String[] args) {
		
		// 문자 하나 입력받아서 소문자인지 확인하여 "소문자"출력
		// 그렇지 않고 대문자라면 "대문자"출력
		// 그외는 "에러"출력
		Scanner input = new Scanner(System.in); 
		System.out.println("문자 하나만 입력->"); 
		char munja = input.next().charAt(0);
				
		if(munja>='A' && munja<='Z') {
			// 여기
			
		}else if( munja>='a' && munja<='z') {
			// 여기
			
		}else {
			System.out.println("에러");
		}

	}

}
