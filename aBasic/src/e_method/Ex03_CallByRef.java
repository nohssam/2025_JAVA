package e_method;

public class Ex03_CallByRef {

	/*
	 	메소드의 인자가 참조형(reference)인 경우
	 		-> 주소 복사함
	 		
	 		=> call by reference
	 */
	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("Hello");
		StringBuffer b = new StringBuffer("안녕");

		add(a,b);
		System.out.println("2. A="+a + ",B="+ b);
	}

	static void add(StringBuffer a, StringBuffer b) {
		//a+=b;
		a.append(b);
		System.out.println("1. A="+a + ",B="+ b);
	}
}
