package c_control;

import java.util.Scanner;

public class Ex04_for중첩 {

	public static void main(String[] args) {
		
/*		for(int i=0 ;i<4 ;i++ ) {
			
			for(int j=0; j<5 ;j++ ) {
				System.out.print('*');
			} // end of for-j
			
			System.out.println();
			
		}// end of for-i
*/		
		/*
		 문제) 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.	
						
				입력 
				3  4			
				
				****
				****
				****
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("행과 열을 입력->");
		int row = input.nextInt();
		int col = input.nextInt();
		
		int sutja = 1;		
		for(int i=0 ;i< row ;i++ ) {			
			for(int j=0; j<col ; j++,sutja++ ) {
				System.out.print( sutja + " " );
				// sutja++;
			}			
			System.out.println();			
		}

/*
 문제) 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.	
			
	입력 
	3  4			
	
	출력
	1 2 3 4
	5 6 7 8
	9 10 11 12
 */
		

	}

}
