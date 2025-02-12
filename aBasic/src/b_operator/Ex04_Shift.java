package b_operator;

public class Ex04_Shift {

	public static void main(String[] args) {
		
		/*
		 *  shift : 모든 비트의 값을 이동하는 연산자
		 * 
		 */
		
		int a = 4;	// 00000000 00000000 00000000 00000100
		int left = a << 1;
					// 00000000 00000000 00000000 00001000
		
		System.out.println("a=" + a);
		System.out.println("right=" + left);

		int right = a >> 1;
		System.out.println("left=" + right);
		// 4  00000000 00000000 00000000 00000100
		//	  00000000 00000000 00000000 00000010
		
	}

}
