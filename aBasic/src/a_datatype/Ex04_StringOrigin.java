package a_datatype;

//import java.lang.*; (자동import)

public class Ex04_StringOrigin {

	public static void main(String[] args) {
		
		String hong = new String("홍길동");
		String gil  = new String("홍길동");
		
		if( hong == gil ) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		}
		
		if( hong.equals(gil)  ) {
			System.out.println("문자열값이 같다"); // ####
		}else {
			System.out.println("문자열값이 다르다");
		}
		
	}
}

/*
	자료형
	1. 기본형
	
	2. 참조형 (클래스/배열)
		 ====> 무조건 new 예약어를 통해 객체 생성 
		 
		[*] String : 유일하게 new 안써도 됨
		
*/