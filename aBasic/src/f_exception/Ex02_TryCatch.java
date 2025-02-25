package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("abc.txt");
			System.out.println("파일연결");
			fis.read();
			
			// 예외를 종류별로 예외처리 가능
			// 구체적인 예외를 먼저 기술	
		}catch(FileNotFoundException ex) {
			System.out.println("파일이 존재하지 않는 예외:" + ex.getMessage());
		}catch(IOException ex) {
			System.out.println("파일 읽기 예외:" + ex.getMessage());
		}catch(Exception ex) {
			System.out.println("그 외 예외:" + ex.getMessage());
		}finally {
			try {
				fis.close(); 
			} catch(Exception ex) {}
		}
	}

}
