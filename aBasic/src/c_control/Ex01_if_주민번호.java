package c_control;

import java.util.Scanner;

public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("당신의 주민번호를 입력->");
		
		String  id = input.next();
					
		
		char sung = id.charAt(7);
		//System.out.println(sung);
		
		// [주의] '1' == 1  false
		
		// sung 변수값이 1이거나 3이면 '남성' 출력
		String gender = "한국인"; 
		
		if( sung=='1' | sung=='3') {
			
			gender = "남성";
			
		}else if( sung =='2' | sung=='4') {
			
			gender = "여성";
			
		}else if( sung =='5') {
			
			gender = "외국인";
			
		}
		
		System.out.println("당신은 " + gender +"입니다");
		
		
	}

}
