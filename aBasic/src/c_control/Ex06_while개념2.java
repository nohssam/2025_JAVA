package c_control;

import java.util.Scanner;

public class Ex06_while개념2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//-----------------------
		/*
		System.out.println("몇 번 반복하시겠습니까?");
		int su = input.nextInt();
		for( int m=0; m<su ;m++) {
			
			// 구구단 단수를 입력받아서 해당 구구단 출력 -> for 문이용
			System.out.println("단 입력->");
			//int dan = Integer.parseInt(input.next());
			int dan = input.nextInt();		
			for(int i=1; i<=9; i++) {
				//System.out.println( dan +"*" + i +"=" + dan*i);
				System.out.printf("%d * %d = %d \n", dan, i, dan*i);
			}
		}*/
		
		
		//--------------------------------------
		while(true) {
			System.out.println("단 입력->");			
			int dan = input.nextInt();		
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d \n", dan, i, dan*i);
			}
			
			System.out.println("끝내시겠습니까?(y|n)");
			String answer = input.next();
			if( answer.equals("y") | answer.equals("Y")) {
				break;
			}
		}
		
		
		
	}

}
