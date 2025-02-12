package c_control;

public class Ex02_switch_주민번호 {

	public static void main(String[] args) {
		
		String id = "801212-1234567";
		
		char chul = id.charAt(8);
		
		String jumin = "123456";
		String xx = jumin.substring(1, 3);
		
		String home = "";
		
		switch( chul ) {
		case '0': home="서울"; 	break;
		case '1': home="인천/부산";break;
		case '2': home="경기"; 	break;
		}
		
		
		
		System.out.println(home+"태생입니다");
	}

}
