package a_datatype;

public class Ex03_Declaration {

	public static void main(String[] args) {
		/*
		// 변수 선언 / 값 대입
		int kor;
		kor = 80;
		
		// 초기화 = 변수선언 + 값대입
		int eng = 80;
		*/
		
		// 국어점수와 영어점수가 같다면 '같다'고 출력
//		if( kor == eng ) {
//			System.out.println("두 점수가 동일");
//		}else {
//			// 그렇지않다면
//			System.out.println("두 점수가 다르다");
//		}
				
		int kor=80, eng=81;

		System.out.println("국어:" + kor + "/영어:" + eng);
		
		// swapping : 두 변수의 값을 맞바꾸기
		//int temp = kor;  // temp:80, kor:80, eng:81
		kor = eng;		 // temp:80, kor:81, eng:81
		//eng = temp;		 // temp:80, kor:81, eng:80
		
		System.out.println("국어:" + kor + "/영어:" + eng);
	}
}
