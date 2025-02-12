package e_method;

public class Ex01_인자와반환 {

	public static void main(String[] args) {
		// 데이타
		int a=10, b=20;
		int sum = add(a, b);
		// 결과처리
		System.out.println("합3:"+ sum);
	}
	
	static int add(int a, int b) {
		// 더하기 계산
		int sum = a + b;
		return sum;
	}

}
