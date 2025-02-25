package c_control;

public class Ex06_반복문 {

	public static void main(String[] args) {
		/*
		// [1] for 문
		for(int i=0 ; i<5 ; i++) {
			System.out.println("새해복");
		}
		
		// [2] while 문
		int i=0;
		//for( ; i<5 ; ) {
		while(i<5) {
			System.out.println("새해복2");
			i++;
		}
		*/
		
		/*
		// [3] do~ while문
		int i=0;
		do {
			System.out.println("새해복3");
			i++;
		}while(i<5);
		*/
		
		/*  for문 	: 반복횟수가 정해진
		 * 	while문 : 반복횟수가 정해지지 않은 경우 주로
		 * 
		 */
		
		
		// ----------------------------------------------
		// 1~10까지의 합을 먼저 for 문으로 작성 ==> while 으로 수정하기
		/*
		int total = 0;
		for( int i=1; i<=10; i++) {
			total += i;
		}
		System.out.println("1-10 합:" + total);
		*/
		
		/*
		int total = 0;
		int i=1;
		while(  i<=10 ) {
			total += i;
			i++;
		}
		System.out.println("1-10 합:" + total);
		*/
		
		// do~while
		int total = 0;
		int i=1;
		do {
			total += i;
			i++;
		}while(  i<=10 );
		System.out.println("1-10 합:" + total);
		
		
	}

}
