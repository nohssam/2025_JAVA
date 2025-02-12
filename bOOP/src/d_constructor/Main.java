package d_constructor;

/* [초기화]
 		변수선언  int a;
 		값 지정  a = 10;
 	
 		초기화		int a = 10;
 		
 	[클래스기본]
 		클래스변수선언	Student s;
 		객체생성		s = new Student();
 		값 지정		s.name = "홍길동"
 	
 					Student s = new Student();
 					s.name = "홍길자";
 					
 		초기화			Student s = new Student("홍길자");
 		
 */
public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동",99,88,45);
		System.out.println("총점:" + s.calcTotal());
		System.out.println("평균:" + s.calcAvg());
		
		Student s2 = new Student();
		System.out.println("총점:" + s2.calcTotal());
		System.out.println("평균:" + s2.calcAvg());
		
	}

}
