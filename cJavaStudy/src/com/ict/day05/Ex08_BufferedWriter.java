package com.ict.day05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;

public class Ex08_BufferedWriter {
	public static void main(String[] args) {
		String path = Paths.get("D:", "workspaces","0214-5.txt").toString();
		File file = new File(path);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write("Hello");
			bw.newLine();// 줄 변경
			bw.write("안녕하세요 , 환영합니다.");
			bw.newLine();
			bw.write("12321313");
			
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
