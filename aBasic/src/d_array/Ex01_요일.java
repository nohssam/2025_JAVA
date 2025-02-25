package d_array;

import java.util.Calendar;

public class Ex01_요일 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		int year 	= c.get(Calendar.YEAR);
		int month 	= c.get(Calendar.MONTH)+1;
		int day 	= c.get(Calendar.DATE); // DAY_OF_MONTH
		
		// 요일
		int yoil	= c.get(Calendar.DAY_OF_WEEK);
		// 일요일:1  ~ 금요일 :6
		String [] day_week = {"일","월","화","수","목","금","토"};
		
		System.out.println(year+"년" + month+"월" 
							+ day+"일" + day_week[yoil-1] +"요일" );

	}

}
