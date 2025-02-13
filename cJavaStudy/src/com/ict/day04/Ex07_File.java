package com.ict.day04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Ex07_File {
	public static void main(String[] args) {
		String pathName = Paths.get("D:", "workspaces","util","test01.txt").toString();
		File file = new File(pathName);
		
		String pathName2 = Paths.get("D:", "workspaces","util","study","java").toString();
		File file2 = new File(pathName2);
		
		try {
			boolean b1 = file.createNewFile();
			if(b1) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
			System.out.println();
		
			
			// 중간에 디렉토리가 없으면 생성 불가능 => mkdir
			boolean b2 = file2.mkdir();
			
			// 중간에 디렉토리가 없어도 생성 가능 => mkdirs
			b2 = file2.mkdirs();
			
			if(b2) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패");
			}
		
			System.out.println();
			
			// 파일 삭제 
			boolean b3 = file.delete();
			if(b3) {
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}
			
			// 디렉토리 삭제 : 비어있지 않으면 삭제 실패 
			//            나중에 Files.walkFileTree() 사용
			String pathName3 = Paths.get("D:", "workspaces","util","study").toString();
			File file3 = new File(pathName3);
			
			boolean b4 = file3.delete();
			if(b4) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
