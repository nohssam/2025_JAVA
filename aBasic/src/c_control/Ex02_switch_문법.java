package c_control;

public class Ex02_switch_문법 {

	public static void main(String[] args) {
		
//		int a = 10;
//		
//		switch( a / 3 ){
//		case 1: System.out.println("일");	break;
//		case 2: System.out.println("이");	break;	
//		case 3: System.out.println("삼");	break;
//		case 4: System.out.println("사");	break;
//		}
		
		switch( 'A' ) { 
		case 'A' : break;
		case 'B' : break;
		}
		
		// j+=6    j=j+6
		
		int i=1, j=0;
		
		switch( i ) {
			case 2: j+=6;
			case 4: j+=1;
			default: j+=2;
			case 0: j+=4;
		}

		System.out.println(j); // 나의 답?
		
	}

}
