package com.ict.day05;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

public class Ex01_Stream {
	public static void main(String[] args) {
		// 스트림은 지연 될 수 있으므로 Buffer 이용해서 지연 현상을 해결한다.
		// BufferedInputStream, BufferedOutputStream // 혼자서는 사용안함
		String path = Paths.get("D:", "workspaces","0214.txt").toString();
		File file = new File(path);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "Hello Stram\n123456\n대한민국\n";
			byte[] b = msg.getBytes();
			
			bos.write(b);
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
