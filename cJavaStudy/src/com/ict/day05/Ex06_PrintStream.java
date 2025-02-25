package com.ict.day05;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Paths;

public class Ex06_PrintStream {
	public static void main(String[] args) {
		// PrintStream은 주로 System.out, System.err 에 사용되며
		// 바이트기반 스트림 이지만, 데이터를 문자로 변환하여 출력할수 있는 기능 제공
		// 주요기능 : 자동 플러시 기능, 다양한 타입의 데이터를 출력 가능, 예외처리 하지 않아도 된다.
		
		String path = Paths.get("D:", "workspaces","0214-3.txt").toString();
		File file = new File(path);
		
		PrintStream ps = null;
		try {
			ps = new PrintStream(file);
			
			ps.print("Hello, World\n");
			ps.println(100);
			ps.print(true);
			ps.println('k');
			ps.print(123456.321);
			
		} catch (Exception e) {
		} finally {
			ps.close();
		}
	}
}
