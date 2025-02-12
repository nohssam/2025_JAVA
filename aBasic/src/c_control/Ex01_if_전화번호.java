package c_control;

/*
 * 02-222-2222
 * 032-333-3333
 * 055551-555-5555
 */
public class Ex01_if_전화번호 {

	public static void main(String[] args) {

		String tel = "02-222-2222";
		int idx = tel.indexOf('-'); // idx=2
		//System.out.println(idx);

		String localNum = tel.substring(0, idx); // 0부터 idx-1까지
		System.out.println(localNum);

		String local = "";

		// 지역번호(localNum)가 02이라면 local변수에 "서울"을 지정
		// 그렇지않다면 지역번호가 032이라면 "인천"을 지정
		// 나머지는 "한국"을 지정
		if(  localNum.equals("02")  ) {
			local = "서울";
		}


		System.out.println("해당 번호는 "+ local+"지역입니다");
	}

}
