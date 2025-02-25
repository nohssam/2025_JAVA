package com.ict.day05;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex02_InputStream {
	public static void main(String[] args) {
		// 파일 입력 스트림 : InputStream 자식클래스인 FileInputStream 사용
		//  - FileInputStream 은 해당 파일에 내용을 1byte씩 입력(읽기)
		//  1. read(): int => 숫자(아스키코드(0-255)), 한 글자
		//                    숫자를 문자로 보기 위해서 char 형변환을 해야 한다.
		//                    더 이상 읽을 수 없을 때에는 -1이 나온다.
		//  2. read(byte[] b) : 읽어서 배열에 넣기  
		//                      String 생성자에 byte[] 받아서  
		//                      String 으로 만들어주는 생성자를 활용하자
		//  3. close() : 입력 스트림 닫기
		
		String path = Paths.get("D:","workspaces", "0214.txt").toString();
		File file = new File(path);
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// 1. read 읽기 => 한 글자
//			int k = fis.read();
//			System.out.println(k);
//			System.out.println((char)(k));
			
			// read()를 이용해서 다 읽기 (사진,동영상,음악등 1byte처리할때 사용)
//			while (true) {
//				int k = fis.read();				
//				if(k == -1) break;
//				System.out.println((char)(k)); // 숫자, 영어 대/소문자, 일부특수문자만 가능
//			}
			
//			int k=0;
//			while((k=fis.read())!= -1) {
//				System.out.println((char)(k));
//			}
			
			// 2. read(byte[] b)
			//  byte[] 먼저 만들기 크기?
//			byte[] b = new byte[(int) file.length()];
//			// 내용이 알아서 byte[]인 b에 들어간다.
//			fis.read(b);
			
			// 출력
//			for (byte k : b) {
//				System.out.print((char)(k));
//			}
			
			// 3. new String(byte[] b)
			byte[] b = new byte[(int) file.length()];
			fis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (Exception e) {
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}







