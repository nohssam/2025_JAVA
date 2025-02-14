package com.ict.day05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class Ex11_PrintWriter {
	public static void main(String[] args) {
		// PrintStream : 모두 데이터 출력 가능, 자동 flush 기능 (바이트 출력)
		//               콘솔 출력에 적합(System.out)
		
		// PrintWriter : 모두 데이터 출력 가능, 자동 flush 기능 
		//               (바이트 출력과 문자 출력 둘 가 가능)
		//               파일출력, 네트워크 전송에 주로 사용
		
		String path = Paths.get("D:", "workspaces","0214-6.txt").toString();
		File file = new File(path);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.print("Hi~~~~~~~");
			pw.println("^^ 방가 방가");
			pw.println(3.124);
			pw.println('A');
			pw.println(true);
			pw.println(1324);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
