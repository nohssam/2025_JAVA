package a_datatype;

import java.util.Calendar;

public class Ex10_만나이 {

	public static void main(String[] args) {
		
		String id = "800128-1234567";
		
		//  int형 birthYear, birthMonth, birthDay 
		String str_birthYear = "19" + id.substring(0 , 2); // "80"
		int birthYear = Integer.parseInt(str_birthYear);
		
		String str_birthMonth = id.substring(2 , 4);// "12"		
		int birthMonth = Integer.parseInt(str_birthMonth);
		
		String str_birthDay  = id.substring(4 , 6); // "02"
		int birthDay = Integer.parseInt(str_birthDay);
		
		System.out.println(birthYear+"/" +birthMonth + "/"+ birthDay);
		
		
		//  오늘 날짜의 년/월/일 
		Calendar c = Calendar.getInstance();
		int cYear 	= c.get(Calendar.YEAR);
		int cMonth 	= c.get(Calendar.MONTH) + 1; //*****
		int cDay	= c.get(Calendar.DAY_OF_MONTH);
		System.out.println(cYear+"/"+cMonth+"/"+cDay);
		
		// 만나이 구하기
		int age = cYear - birthYear;
		
		// 1 * 100 + 26 => 126
		// 1 * 100 + 27 => 127
		if( birthMonth*100 + birthDay > cMonth*100+cDay ) {
			age--;
		}
		
		System.out.println(age);
	}

}
