package b_operator;

public class Ex02_Not {

	public static void main(String[] args) {
		/*
		 *  not : 결과를 반대로 하는 연산자
		 *  
		 *  	` ! : 일반논리 not
		 *  	` ~ : 이진논리 not
		 *  
		 *   	* 일반논리 : true/false 
		 *   	* 이진논리 : bit값(0/1)
		 */
		
		boolean result = 3 > 4;
		System.out.println(result);
		System.out.println(!result);
		
		int a = 15;
		System.out.println(a);	
		System.out.println(~a);
		
		// 15    00000000 00000000 00000000 00001111
		//~15	 11111111 11111111 11111111 11110000
		
	}
}
