package a_datatype;

public class Ex09_문자열 {

	public static void main(String[] args) {
		
		//[1] String
		//	 * 유일하게 new 생략가능
		//	 * 유일하게 + 연산 가능
		//String str = new String("새해");
		String str = "새해";
		str += "복"; // str = str + "복"
		System.out.println(str);

		// [2] StringBuffer
		StringBuffer sb = new StringBuffer("올해도");
		sb.append("복");
		System.out.println(sb);
		
		// [3] StringBuilder ( no guarantee of synchronization )
		StringBuilder bb = new StringBuilder("2025년");
		bb.append("복");
		System.out.println(bb);
		
	}

}
