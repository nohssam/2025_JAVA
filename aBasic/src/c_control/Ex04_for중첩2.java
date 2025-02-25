package c_control;

public class Ex04_for중첩2 {

	public static void main(String[] args) {
		
		/*
		//[1] 5행 5열 기본
		
		for( int i=0; i<5; i++) { // 행			
			for( int j=0; j<5; j++) { // 열
				System.out.print('*');
			}
			System.out.println();
		} 
		*/
		
		//[2]
		/*
				*****
				****
				***
				**
				*
		 */
//		for( int i=0; i<5; i++) { // 행			
//			for( int j=0; j<5-i; j++) { // 열
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		// [3]
		/*
			*
			**
			***
			****
			*****		 
		 */
		for( int i=0; i<5; i++) { // 행			
			for( int j=0; j<i+1; j++) { // 열
				System.out.print('*');
			}
			System.out.println();
		} 
	}

}
