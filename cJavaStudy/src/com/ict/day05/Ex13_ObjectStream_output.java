package com.ict.day05;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// ObjectOutputStream : 객체 출력 스트림
// writeObject() : 객체 직렬화 (객체 -> 바이트)
public class Ex13_ObjectStream_output {
	public static void main(String[] args) {
		// 1. vo를 객체로 만들자 
		Ex13_VO vo1 = new Ex13_VO("고길동", 34, 71.4, true);
		Ex13_VO vo2 = new Ex13_VO("둘리", 14, 30.4, true);
		Ex13_VO vo3 = new Ex13_VO("공실이", 13, 26.7, false);
		Ex13_VO vo4 = new Ex13_VO("마이콜", 24, 68.1, true);
		Ex13_VO vo5 = new Ex13_VO("도우너", 18, 47.4, false);
		
		// 2. 파일 저장 위치 지정
		String path = Paths.get("D:", "workspaces","0217-1.txt").toString();
		File file = new File(path);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 3. 여러개의 객체를 하나로 모아서 관리(컬렉션)
			List<Ex13_VO> list = new ArrayList<>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			// 4. 객체 직렬화하자 
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}









