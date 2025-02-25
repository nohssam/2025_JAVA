package com.ict.day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex10_BufferedReader {
	public static void main(String[] args) {
		// readLine() => 한 줄씩 읽는다. 
		//               더 이상 읽을 수가 없으면 null
		
		String path = Paths.get("D:", "workspaces","0214-5.txt").toString();
		File file = new File(path);
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
