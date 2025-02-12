package e_method;

import java.util.Scanner;

public class Ex09_복습 {

	public static void main(String[] args) {
		
		String result = func();
		method(result);		
	}
	
	static void method(String result) {
		// 합격여부를 출력
		System.out.println(result);
	}
	
	static String func() {
		// 점수를 입력받아 80이상이면 "합격" 리턴하고 그렇지 않으면 "불합격" 리턴하기
		Scanner input = new Scanner(System.in);
		System.out.println("점수입력->");
		int jumsu = input.nextInt();
		
		if( jumsu >= 80 ) {
			return "합격";
		}else {
			return "불합격";
		}
	}

}
