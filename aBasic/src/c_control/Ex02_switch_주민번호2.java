package c_control;

import java.util.Scanner;

public class Ex02_switch_주민번호2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		System.out.println("당신의 주민번호를 입력->");		
		String  id = input.next();					

		char sung = id.charAt(7);

		/* [switch 으로 작성] 
		 * 
		 * sung 변수가 1이거나 3이면 '남성' 출력
		 * 2이거나 4라면 '여성' 출력
		 * 5라면 '외국인' 출력
		 * 그외는 '한국인' 출력
		 */

		String gender = "";

		switch( sung ) {
		case '1': 
		case '3': gender="남성";		break;
		case '2': gender="여성";		break;
		case '4': gender="여성";		break;
		case '5': gender="외국인";	break;
		default:  gender="한국인";	break;
		}

		System.out.println("당신은 " + gender +"입니다");

	}

}
