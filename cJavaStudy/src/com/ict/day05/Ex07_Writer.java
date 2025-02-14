package com.ict.day05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Ex07_Writer {
	public static void main(String[] args) {
		// Writer : 문자 출력 스트림의 최상위 추상 클래스
		//          2byte 처리
		//          전세계 모든 언어로 구성된 파일을 출력하기에 적합
		//  - write(int c)      : 2byte 하나 출력
		//  - write(char[] c)   : char배열 b를 출력 
		//  - write(String str) : String str  출력
		
		String path = Paths.get("D:", "workspaces","0214-4.txt").toString();
		File file = new File(path);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			String str = "안녕하세요\nHello\n123456\n";
			fw.write(str);
			fw.flush();
		} catch (Exception e) {
		
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
