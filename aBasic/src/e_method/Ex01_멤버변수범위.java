package e_method;

public class Ex01_멤버변수범위 {

	// 멤버변수
	static int a =10, b =20;
	static int sum;
	
	// 멤버함수(멤버메소드)
	public static void main(String[] args) {
		add();
		System.out.println("합=" + sum);
	}
	
	static void add() {
		sum = a + b;
	}

}
