package j_review2;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("홍길자","컴공");
		Student s2 = new Student("홍길동","컴공");
		
		if( s.equals(s2) ) {
			System.out.println("동일인");
		}else {
			System.out.println("다른사람");
		}
		
		System.out.println(s.toString());
	
	}

}
