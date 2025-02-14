package com.ict.day05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Paths;

public class Ex04_FileCopy {
	public static void main(String[] args) {
		// 파일 입력
		String input = Paths.get("D:", "이미지1.jpg").toString();
		File in_file = new File(input);
		
		// 파일 출력
		String output = Paths.get("D:", "workspaces","util","이미지1.jpg").toString();
		File out_file = new File(output);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while((b=bis.read()) != -1) {
				bos.write(b);
			}
 			bos.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
