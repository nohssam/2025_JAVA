package a_datatype;

public class Ex02_Casting {

	public static void main(String[] args) {
		
		/*
		 	[자료형]
		 	1. 기본형
		 		- boolean
		 		- char (2B)
		 		- int(4B) / long(8B)
		 		- double(8B)
		 		
		 	2. 참조형
		 		- 클래스형/배열형
		 */
		
		
		/*
		 * [기본]
		 * 		변수의 자료형 == 값의 자료형
		 * 		char a = '박';
		 * 		int  b = 10000;
		 */
		
		
		char ch = 65;
		System.out.println("ch 값:"+ ch);

		int su = 'B';
		System.out.println("su 값:"+ su);
		
		float 에프 = 3.6F;
		System.out.println("f 값:"+ 에프);
		
		// float : 4B
		// double : 8B
		
		double d = 3.6F;
		System.out.println("d 값:"+ d);
		
		
		/*
		 	1. 변수의 공간 > 값의 크기		 	
		 	
		 		=> 자동형변환
		 		
		 	2. 변수의 공간 < 값의 크기
		 	
		 		=> 강제형변환 : casting  (변경할자료형타입)
		 */
		double dd = 100; // 8B 변수에 4B 값을 대입
		System.out.println(dd);
		
		int num = (int)3.6;
		System.out.println(num);
		
		// 정수형 : int(4B) / long(8B)
		int big = 1000000000;
		System.out.println(big);
		
		long big2 = 10000000000L;
		System.out.println(big2);
	}

}

/* 참고
 * 
 *  [ C 언어 ]
 * 		문자형 자료형 : char (1Byte)
 * 	
 * 		1B = 8bit = 2진수인 경우  표현하는 갯수: 256
 * 		
 * 		* ASCII 언어체제
 * 			영어소문자, 영어대문자, 숫자, 특수기호 등등
 * 
 *  [ java 언어 ]
 *  	문자형 자료형 : char (2Byte)
 *  
 *  	2B = 16bit 
 *  
 *  	* Unicode 언어제체
 *  		ASCII / 중국어 / 일본어 / 한국어....
 *  
 *  [ ASCII 문자체제 ]
 *  
 *     _ _ _ _ _ _ _ _ 
 *     
 *     0 1 0 0 0 0 0 1     100: 대문자  0001:'A' 
 *       = 1 * 2(6) + 1 * 2(0)
 *       = 1 * 64 + 1 * 1
 *       = 65
 *  
 */

