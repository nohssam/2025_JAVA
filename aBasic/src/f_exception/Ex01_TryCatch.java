package f_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		
		String []str = {"맛점","즐기기","멍때리기"};
		
		try {
			for(int i=0; i<3; i++) {
				System.out.println(str[i]);
			}
			System.out.println("예외가 발생할 여지가 있는 구문");	
			return;
		}catch(Exception ex) {
			System.out.println("예외발생:" + ex.getMessage());
			//ex.printStackTrace();
		}finally {
			System.out.println("예외발생여부 관련없이 무조건 수행");
		}
		
		System.out.println("프로그램 정상 종료");
	}

}
