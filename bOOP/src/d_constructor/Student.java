package d_constructor;

/*
 	클래스(객체) 초기화 => 생성자함수(constructor)
 	
 		- 클래스명과 동일
 		- void 도 사용하면 안됨(***)
 		- overloading 가능
 	
 	[*] 기본생성자함수 특성
 		- 개발자 1개도 생성자함수를 추가하지 않으면 자동으로 기본생성자 생성
 		- 개발자 1개라도 생성자함수를 추가하면 자동으로 기본생성자가 안 생성함
 			=> 기본생성자 작성
 			
 	[*] this 와 this()
 			` this : 자기 객체를 지칭하는 예약어
 					 멤버변수나 멤버메소드를 명확하게 지칭할 때 사용
 					 
 			` this() : 다른 생성자 함수 호출시
 					   맨 앞에 기술해야 함
 */
public class Student {

	private String name;
	private int kor, eng, math;
	
	private int total;
	private double avg;
	// 생성자함수
	public Student() {
		// 기본생성자함수 (default constructor)
//		name = "아무개";
//		kor = 50;
//		eng = 50;
//		math = 50;
		//Student("아무개",50,50,50);
		
		// 다른생성자 호출할 때
		this("아무개",50,50,50);
		System.out.println("기본생성자");
		
		
	}
			
	public Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자생성자");
	}
		
	
	public int calcTotal() {
		total = kor + eng + math;
		return total;
	}

	public double calcAvg() {
		avg = (double)total / 3;
		return avg;
	}
	
}

