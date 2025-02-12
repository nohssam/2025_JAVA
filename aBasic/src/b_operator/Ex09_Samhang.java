package b_operator;

import java.util.Scanner;

/*
 * 	  조건 ? A : B
 * 
 *    조건이 true라면 A 실행하고 false라면 B 실행
 */
public class Ex09_Samhang {

	public static void main(String[] args) {
		
		//[0]
		/*
		int jumsu = 71;
		if( jumsu >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}*/
		
		// [1] 삼항연산자
		/*int score = 81;
		String result = ( (score >= 80) ? "합격": "불합격");
		System.out.println(result);
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력하세요");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int max = a > b ? a : b;
		
		System.out.println("두 수 중 큰 수는 => "+max);
		
	}

}
