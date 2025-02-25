package com.ict.day06;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// 직렬화 : 객체을 바이트스트림을 이용해서 파일 저장 
public class Ex01_ObjectSteram_output {
	public static void main(String[] args) {
		// 1. VO을 이용해서 객체 만들자 
		Ex01_VO vo1 = new Ex01_VO("손흥민", 32, 72.4, true);
		Ex01_VO vo2 = new Ex01_VO("지소연", 22, 57.2, false);
		Ex01_VO vo3 = new Ex01_VO("김민제", 29, 78.3, true);
		Ex01_VO vo4 = new Ex01_VO("최유리", 25, 53.4, false);
		Ex01_VO vo5 = new Ex01_VO("황희찬", 27, 72.6, true);
		
		// 2. 파일 저장위치
		String path = Paths.get("D:", "workspaces","0217-2.txt").toString();
		File file = new File(path);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 여러 개의 객체를 하나로 묶어서 저장 및 관리 => 컬렉션
			List<Ex01_VO> list = new ArrayList<>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			// 객체 직렬화
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			System.out.println("잘못 했네요2");
			System.out.println(e);
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}
}
