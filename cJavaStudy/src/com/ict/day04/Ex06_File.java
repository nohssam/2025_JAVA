package com.ict.day04;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
  File 클래스 : 특정 위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
    - 주요 생성자 : File(String 경로), File(String 상위경로, String 하위경로)
                               , File(File 상위경로, String 하위경로)
    - 주요 메서드 : createNewFile() : 파일 생성                                   
                mkdir(), mkdirs() : 디렉토리 생성
                delete()          : 삭제
                isFile()          : 파일이면 true
                isDirectory()     : 디렉토리이면 true
                exists()          : 있으면 true
                getName()         : 이름 반환
                length()          : 파일의 크기를 byte로 변환(디렉토리는 크기 없음)
                list()            : 특정위치의 내용을 String[]로 만들어서 반환
                getAbsolutePath() : 절대주소 => 무조건 /(루트)로 시작
                getPath()         : 상대주소 => / 이외로 시작하는 주소 

 */

public class Ex06_File {
	public static void main(String[] args) {
		
		String pathName = "D:\\workspaces\\util" ; // 윈도우
		String pathName2 = "D:/workspaces/util" ; // 리눅스나 맥
		
		// 운영체제와 상관없이 경로 표시
		String pathName3 = "D:" + File.separator + "workspaces" 
								+ File.separator +"util";
		
		Path path  = Paths.get("D:", "workspaces","util");
		String pathName4 = path.toString();
		
		// pathName들의 위치에 있는 파일과 디렉토리 화면 출력
		File file = new File(pathName4);
		
		// file  위치 안에 있는 디렉토리와 파일을 String 배열 담자 
		String[] arr = file.list();
		
		// 배열 담은 내용 출력
		for (String k : arr) {
			// System.out.println(k);
			
			File file2 = new File(pathName4, k);
			// System.out.println(file2);
			
			if(file2.isDirectory()) {
				System.out.println("디랙토리 : " + k);
			}else {
				System.out.println("파일 : " + k + ", " + k.length() + "Byte");
				System.out.println("파일 : " + k + ", " + k.length()/1024 + "KB");
				// System.out.println("파일 : " + k + ", " + (k.length()/1024)/1024 + "MB");
			}
			
		}
		
		
		
		
		
	}
}






