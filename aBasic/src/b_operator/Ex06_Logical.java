package b_operator;

import java.util.Scanner;

/*
 * 	일반논리연산자
 * 		- OR  : ||
 * 		- AND : &&
 * 		
 * 	 --------------------
 *     A   B    A||B    A&&B 
 *   --------------------
 *     0   0     0		0
 *     1   0     1		0
 *     0   1     1		0
 *     1   1     1		1
 *     
 * 	 --------------------
 *     A   B    A||B    A&&B 
 *   --------------------
 *     F   F     F		F
 *     T   F     T		F
 *     F   T     T		F
 *     T   T     T		T   
 */
public class Ex06_Logical {

	public static void main(String[] args) {
		
		/*int 성적 = 75;
		char 태도 = 'A';
		
		if( 성적>=80 || 태도=='A'  ) {
			System.out.println("성적이 80점이상이거나 태도가 A이면 우등상입니다");
		}*/
		
		/*
		// 문자도 비교연산자
		if( 'A' > 'B') { // 'A' < 'B' < 'C'
			System.out.println("크다");
		}else {
			System.out.println("작다");		
		}
		
		if( '가' < '나') { // ㄱ < ㄴ < ㄷ < ㄹ 
			System.out.println("가 작다");
		}else {
			System.out.println("가 크다");
		}
		// 'ㄱ' ~ '힣'
		*/
		
		/*
		int jumsu = 88;
		if( jumsu>=80 && jumsu<90 ) {
			System.out.println("점수가 80이상 90미만이면 우수상");
		}*/
		
		/*
		 *	1) 문자 하나를 입력받아서 그 문자가 대문자인지 출력
		 *  2) 대문자 아니라면 소문자인지 출력
		 */
		Scanner input = new Scanner(System.in); 
		System.out.println("문자 하나만 입력->"); // "A"
		char munja = input.next().charAt(0);
		System.out.println("확인:" + munja);
		
		if(munja>='A' && munja<='Z') {
			System.out.println("대문자");
		}else if( munja>='a' && munja<='z') {
			System.out.println("소문자");
		}else {
			System.out.println("그 외 문자");
		}
		
	}

}
