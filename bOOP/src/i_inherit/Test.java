package i_inherit;

public class Test {

	public static void main(String[] args) {
		
//		Appa parent = new Appa();
//		parent.gene();
//		parent.job();
		
//		// [*] 자식변수에서 부모의 멤버 접근 가능
//		Adul child = new Adul();
//		child.gene();
//		child.study();
//		child.job(); // * 

		// [*] 부모변수에 자식 생성 가능
		//Adul ad = new Appa(); ==> 에러
		
		//Appa ap = new Adul();
		//ap.job();	// O
		//ap.gene(); // [*****] overriding
		//ap.study();// X
		
		// [*] 형변환 (casting)
		//		- 기본형끼리
		//		- 상속관계의 클래스끼리
		/*
		String s = "헬로유ㅜ";
		StringBuffer sb = (StringBuffer)s;
		*/
		
//		Appa parent = new Appa();
//		Adul child = (Adul)parent;
		
		Adul child = new Adul();
		Appa parent = (Appa)child;
		
	}

}
