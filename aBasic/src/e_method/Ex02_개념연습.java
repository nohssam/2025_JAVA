package e_method;

import java.util.*;

public class Ex02_개념연습 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("문자하나 입력->");
		char ch = input.next().charAt(0);
		boolean result = checkLower(ch);
		System.out.println("결과:" + result);
		
		char result2 = checkUpper(ch);
		System.out.println("결과2" + result2);
	}
	
	/*
	 함수명 : checkUpper
	 인자 : char
	 리턴(반환) : char
	 */
	// 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오.
	// 소문자 a : 97
	// 대문자 A : 65
	static char checkUpper(char ch){
		
		return '0';
	}
	
	

	// 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 
	static boolean checkLower(char ch) {
		
		if( ch>='a' & ch<='z') {
			return true;
		}else {
			return false;
		}
		
		
	}
	
}

/*
(문제 1) 영문자를 입력받은 후 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 

함수명 : checkLower
인자 : char
리턴(반환) : boolean

​
*/
