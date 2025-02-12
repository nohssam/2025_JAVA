package c_control;

import java.util.Scanner;

public class Ex09_복습 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자하나 입력->");
		int number = input.nextInt();
		//System.out.println("입력한 숫자 :" + number);
		
		/*
		 * 입력받은 수를 9 나머지연산한 결과가 1이면 "홀수" 출력
		 * 그렇지 않으면 "짝수" 출력
		 */
		if( number%2 ==1 ) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
	}

}
