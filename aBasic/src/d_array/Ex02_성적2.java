package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02_성적2 {

	public static void main(String[] args) {
		
		
		System.out.println("학생들의 국어점수를 입력하세요 ( 입력예시 : 10/10/10/10/10 ) ->");
		Scanner input = new Scanner(System.in);
		//String str_score = input.next(); // 스페이스바, 엔터, 탭키 등등 문자열종료로 취급
		String str_score = input.nextLine(); // 엔터만 종료로 취급
		//System.out.println(str_score);
		
		StringTokenizer st = new StringTokenizer(str_score,"/");
		//System.out.println("토큰수:" + st.countTokens());
		
		int [] kor = new int[st.countTokens()]; // 100/90/80/70/60
		
		// 국어점수를 kor 변수에 지정(**)
		for(int i=0; i<kor.length; i++) {
			kor[i] = Integer.parseInt(st.nextToken()) ;
			//System.out.println(kor[i]);
		}
		
		
		// 총점과 평균 구해서 출력
		int total = 0;
		for(int i=0; i < kor.length ; i++) {
			total += kor[i];
		}
		
		// 총점과 평균 출력
		System.out.println("총점:"+ total);
		System.out.println("평균:"+ total/kor.length);


	}

}
