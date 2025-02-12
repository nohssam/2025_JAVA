package a_datatype;

import java.util.Calendar;

public class Ex11_날짜구하기 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();

		int cYear 	= c.get(Calendar.YEAR);
		int cMonth 	= c.get(Calendar.MONTH) + 1; //*****
		//int cDay	= c.get(Calendar.DATE);
		int cDay	= c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(cYear+"/"+cMonth+"/"+cDay);
		
	}

}
