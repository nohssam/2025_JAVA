package c_control;

public class Ex08_break_continue2 {

	/**
	 	중첩반복문을 한꺼번에 벗어날때 : break LABEL;
	 */
	
	public static void main(String[] args) {
		
		END:
		for( int i=0; i<2 ; i++) {
			
			for( int j=0; j<3; j++) {
				if( j==1) break END; 
				//if(j==1) continue END;
					
				System.out.printf("< %d, %d> \n", i, j);				
			}
			System.out.println("-------- 데이타 -------");
		}

	}

}
