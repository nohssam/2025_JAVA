package a_datatype;

import java.util.Calendar;

public class Ex10_나이구하기 {

	public static void main(String[] args) {
		
		String id = "201212-3234567";
		
		// [1] 한국나이
		char gender = id.charAt(7);
		
		String str_birthYear = "19";
		if( gender == '1' || gender == '2') {			
			str_birthYear = "19" + id.substring(0, 2); // 0번째부터 2번째 앞에까지  : "80"

		}else if( gender =='3' || gender == '4') {
			str_birthYear = "20" + id.substring(0, 2);
		}		
		
		// String -> int형으로 변환(변경)
		// int birthYear = (int) str_birthYear;
		int birthYear = Integer.parseInt(str_birthYear); // wrapper 클래스 이용
			// str_birthYear : "1980"
			// birthYear : 1980
		
		Calendar c = Calendar.getInstance();
		int cYear 	= c.get(Calendar.YEAR);
		
		int age = cYear - birthYear + 1;
		
		System.out.println("당신의 한국나이는 " + age +"세입니다");

	}

}
