package e_method;

/*
 	인자 : argument		- 보내는 값
 	매개변수 : parameter	- 받는 변수
 */

public class Ex01_인자 {

	public static void main(String[] args) {
		// 데이타
		int a =10, b = 20;
		add(a,b);
	}

	static void add(int a, int b) {
		// a와 b값을 더해서 작업
		int sum = a + b;
		System.out.println("합=" + sum);
	}
}
