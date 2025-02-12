package b_encapsulation;

public class Main {

	public static void main(String[] args) {
		
		
		// 클래스변수선언
		// 객체생성(new 이용)
		Student s = new Student();
		
		s.setName("홍길동");
		s.setKor(90);
		s.setEng(100);
		s.setMath(80);
		
		System.out.println("이름:" + s.getName());
		System.out.println("총점:" + s.calcTotal());
		
		//s.total = 100;
		System.out.println("평균:" + s.calcAvg());
		
	}

}
