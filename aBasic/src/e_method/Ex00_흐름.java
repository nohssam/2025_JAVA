package e_method;

public class Ex00_흐름 {
	
	static void method() {
		System.out.println(" 메소드 실행 ");
	}
	
	public static void main(String[] args) {
		System.out.println("main 시작");
		method();
		method();
		System.out.println("main 끝");
	}
}
