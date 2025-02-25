package a_basic;

public class Main {

	public static void main(String[] args) {
		
		
		// 클래스변수선언
		Student s;
		
		// 객체생성(new 이용)
		s = new Student();
		
		s.name = "홍길동";
		s.kor = 90;
		s.eng = 100;
		s.math = 80;
		
		System.out.println("총점:" + s.calcTotal());
		System.out.println("평균:" + s.calcAvg());
		
	}

}
