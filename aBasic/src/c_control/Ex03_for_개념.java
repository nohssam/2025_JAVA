package c_control;

/*
 	 for ( 초기치; 조건문 ; 증가치 ) {
 	 	반복할 구문들
 	 } 
 */

public class Ex03_for_개념 {

	public static void main(String[] args) {
		
//		for ( int i=0; i<3 ; i++ ) {
//	 	 	System.out.println("오늘도 행복하세요");
//	 	}

//		int hap=0;
//		for ( int i=1; i<=10 ; i++ ) {
//	 	 	hap += i;   // hap=hap+i;
//	 	}
//		System.out.println("1~10까지 합:" +hap);
//		
//		// 1~100까지의 홀수의 합과 짝수의 합 출력
//		int even=0, odd=0;
//		
//		for(int i=1; i<=100; i++) {
//			
//			if( i%2 == 1) {
//				odd += i;
//			}else {
//				even += i;
//			} // end of if
//		} // end of for
//		
//		System.out.println("1~100까지 홀수 합:" +odd);
//		System.out.println("1~100까지 짝수 합:" +even);
		
		// 
		
		//for(char ch='A' ; ch<='Z'; ch=(char)(ch+1) ) {
		
		for(char ch='A' ; ch<='Z'; ch+=3 ) {
			System.out.print(ch);
		}
		System.out.println();
		
//		
//		// 'Z'부터 'A'까지 출력하려면??
//		
//		for(char ch='Z';  ch>='A'  ; ch--) {
//			System.out.print(ch);
//		}
	}

}
