package a_datatype;

import java.util.Scanner;

public class Ex09_복습 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 

		System.out.println("첫번째 숫자 입력하세요->");		
		int su1 = input.nextInt();
		
		System.out.println("두번째 숫자 입력하세요->");
		int su2 = input.nextInt();
		
		int result1 = su1 + su2;
		System.out.println("더하기 결과:"+result1);
		
		// 빼기 (-)
		
		// 곱하기 (*)
		
		// 나누기 (/)
		
		// 나머지 (%)
		int result5 = su1 % su2;
		System.out.println("더하기 결과:"+result5);
	}
}
