package f_exception;

public class Ex04_throw {

	public static void main(String[] args) {
		try {
		  readArray();
		}catch(Exception ex) {
			//System.out.println("예외처리:" + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
	
	static void readArray() throws Exception {
		try {
			String [] msg = {"짝꿍님","오늘의","메뉴는"};
			for(int i=0; i<= msg.length; i++) {
				System.out.println(msg[i]);
			}
		}catch(Exception ex) {
			throw new MyException();
		}
	}

}
