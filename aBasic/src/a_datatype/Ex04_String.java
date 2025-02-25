package a_datatype;

public class Ex04_String {

	public static void main(String[] args) {
		
		// 문자형(char) : 문자 1개 저장하는 변수
		
//		char name = '홍';
//		char name2 ='길';
//		char name3 ='동';
		//char name = "홍길동";
		
		// ------------------------------
		// 문자열 (String) : 0개 이상의 문자들
//		String name = "홍길동";
//		System.out.println("당신의 이름은 " + name);
	
		String hong = "홍길동";
		String gil  = "홍길동";
		
		if( hong == gil ) {
			System.out.println("주소가 같다");  // #
		}else {
			System.out.println("주소가 다르다"); 
		}
		
		if( hong.equals(gil)  ) {
			System.out.println("문자열값이 같다"); // #
		}else {
			System.out.println("문자열값이 다르다");
		}
		
	}

}
