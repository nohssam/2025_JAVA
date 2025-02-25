package com.ict.day05;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

// ObjectInputStream : 객체 입력 스트림
// readObject()  : 역 직렬화 (바이트 -> 객체)
public class Ex13_ObjectStream_input {
	public static void main(String[] args) {
		// 1. 읽어올 파일의 위치 지정
		String path = Paths.get("D:", "workspaces","0217-1.txt").toString();
		File file = new File(path);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			List<Ex13_VO> list = (List<Ex13_VO>) ois.readObject();
			Iterator<Ex13_VO> it =list.iterator();
			while (it.hasNext()) {
				Ex13_VO k = (Ex13_VO) it.next();
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getWeight()+"\t");
				System.out.print(k.isGender()+"\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
