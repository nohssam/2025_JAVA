package e_method;

public class Ex03_CallBy스트링 {

	public static void main(String[] args) {
		
		String a = "안녕";
		String b = "헬로우";
		add(a ,b );
		System.out.println("2. A=" + a + ",B=" + b);
	}

	static void add(String a, String b) {
		a += b;
		System.out.println("1. A=" + a + ",B=" + b);
	}
}
