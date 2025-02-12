package c_control;

import java.util.Scanner;

public class Ex03_for_연습2 {

	public static void main(String[] args) {
		
		// 숫자 하나를 입력받아 1부터 그 숫자까지 출력
		Scanner input = new Scanner(System.in);
		System.out.println("숫자하나 입력->");
		int number = input.nextInt();

		for( int i=1 ; i<=number   ; i++ ) {
			System.out.print(i + " ");
			
			if( i%5 == 0) {
				System.out.println();
			}
			
		} // end of for
		
		/*
		 문제 1)1~ N까지의 숫자를 다음처럼 출력하라				
				1 2 3 4 5 
				6 7 8 9 10
				11 12 13 14 15
		 */
	}

}
