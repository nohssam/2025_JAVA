package d_array;

public class Ex00_배열문법 {

	public static void main(String[] args) {
		
		//---------------------
		// [1] 배열변수 선언
		//		그 변수에 배열객체 생성		
		//int [] kor;
		//kor = new int[3];
		
//		int [] kor = new int[3];
//		kor[0] = 88;
//		kor[1] = 77;
//		kor[2] = 66;
		
		/*	초기화
		 		int a;	// 변수선언
		 		a = 10; // 값지정
		 	int b = 10; // 초기화
		 	
		 	배열초기화
		 		변수선언+객체생성 + 값지정
		 */
		//int [] kor = new int[] {88,77,66};
		int [] kor = {88,77,66};
		
		// 총점구해서 출력
		int total = 0;
		for(int i=0; i< kor.length; i++) {
			total += kor[i];
		}
		System.out.println("총점:"+ total);
	}

}
