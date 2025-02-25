package e_method;

public class Ex03_CallByValue {

	/*
	 	메소드의 인자가 기본형인 경우
	 		-> 값(value)만 복사
	 		
	 		=> call by value
	 */
	
	public static void main(String[] args) {
		int a =10, b =20;
		add(a,b);
		System.out.println("2. A="+a + ",B=" + b);
	}
	
	static void add(int a, int b){
		a += b;
		System.out.println("1. A="+a + ",B=" + b);
	}

}
