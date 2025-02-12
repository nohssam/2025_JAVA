package d_array;

import java.util.Scanner;

public class Ex02_성적 {

	public static void main(String[] args) {
		
		System.out.println("학생수를 입력->");
		Scanner input = new Scanner(System.in);
		
		int stusu = input.nextInt();

		int[] kor = new int[stusu];
				
		for(int i=0; i<stusu ;i++) {
			System.out.println(i+"번째 국어점수를 입력->");
			kor[i] = input.nextInt();
		}
		
		// 총점구하기
		int total = 0;
		for(int i=0; i< kor.length; i++) {
			total += kor[i];
		}
		
		// 총점과 평균 출력
		System.out.println("총점:"+ total);
		System.out.println("평균:"+ total/stusu);
		
	}

}
