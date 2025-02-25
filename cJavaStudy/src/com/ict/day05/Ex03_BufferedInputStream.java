package com.ict.day05;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Paths;

public class Ex03_BufferedInputStream {
	public static void main(String[] args) {
		// 스트림은 지연 될 수 있으므로 Buffer 이용해서 지연 현상을 해결한다.
		// BufferedInputStream, BufferedOutputStream // 혼자서는 사용안함
		
		String path = Paths.get("D:", "workspaces","0214.txt").toString();
		File file = new File(path);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)file.length()];
			bis.read(b);
			
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
