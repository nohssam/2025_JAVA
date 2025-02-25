package e_method;

public class Ex05_overloading {

	/*
	 	overloading 
	 		- 동일한 메소드명들 (함수의 역할이 동일하기에)
	 		- 인자의 자료형과 갯수 다른 경우
	 		
	 		단, 리턴형만 다른 것은 아님!!
	 */
	
	public static void main(String[] args) {
		
		String str = new String("홍길순");
		StringBuilder sb = new StringBuilder("홍길동");
		char[] ch = new char[] {'홀','길','돌'};

		addFighting(ch);
		addFighting(str);
		addFighting(sb);
	}

	// 문자열에 "화이팅!!" 더하고 출력한 메소드
	static void addFighting(String str) {
		str += "화이팅!!!";
		System.out.println(str);
	}
	
	static void addFighting(StringBuilder sb) {
		sb.append("화이팅!!");
		System.out.println(sb);
	}
	
	static void addFighting(char[] ch) {
		char[] result = new char[6];
		
		for( int i=0; i<ch.length; i++) {
			result[i] = ch[i];
		}
		result[3] = '화';
		result[4] = '이';
		result[5] = '팅';
		System.out.println(result);
	}
	
	
	
}
