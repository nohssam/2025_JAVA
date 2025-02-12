package c_control;

public class Ex02_switch_평균 {

	public static void main(String[] args) {
		
		int kor=100, eng=100, math=100;
		int total = kor + eng + math;
		int avg = total/3;
		
		char score = '\u0000'; 
		
		/*
		 * 90이상이면 'A'
		 * 80이상이면 'B'
		 * 70대이면 'C'
		 * 나머지 'F'
		 */
		switch( avg/10 ) {
		case 10,9: score='A'; break;
		case 8: score='B'; break;
		case 7: score='C'; break;
		default: score='F'; break;
		}
		
		System.out.println(score +"학점입니다");
	}

}
