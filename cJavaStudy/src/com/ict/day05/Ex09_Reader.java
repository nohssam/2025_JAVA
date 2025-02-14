package com.ict.day05;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;

public class Ex09_Reader {
	public static void main(String[] args) {
		// Reader : 2byte  읽기, 한 글자만 , 전 세계 문자로 저장된 파일 읽기
		//  - read() => 숫자 (유니코드=>전세계문자표현코드)
		//              문자로 보기 위해서는 char 형변환
		//              더 이상 읽을 수 없을 때 -1
		
		String path = Paths.get("D:", "workspaces","0214-4.txt").toString();
		File file = new File(path);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
//			int k = fr.read();
//			System.out.println(k);
//			System.out.println((char)(k));
			
//			int k = 0 ;
//			while(true) {
//			  k = fr.read();
//			  if(k == -1) break;
//			  System.out.print((char)(k));
//			}
    
			int k = 0 ;
			while((k=fr.read()) != -1) {
				 System.out.print((char)(k));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
