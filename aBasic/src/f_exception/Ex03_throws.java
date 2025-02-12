package f_exception;

import java.io.FileInputStream;

public class Ex03_throws {

	public static void main(String[] args) {
		try {
			readFile();
			System.out.println("문제없음");
		}catch(Exception ex) {
			System.out.println("실패:" + ex.getMessage());
		}
		
	}
	
	static void readFile() throws Exception{
		FileInputStream fis= new FileInputStream("zyx.txt");
		System.out.println("파일연결성공");
	}

}
