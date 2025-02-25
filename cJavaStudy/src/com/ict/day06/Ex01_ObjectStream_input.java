package com.ict.day06;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Ex01_ObjectStream_input {
	public static void main(String[] args) {
		// 1. 읽어올 파일 지정
		String path = Paths.get("D:", "workspaces","0217-2.txt").toString();
		File file = new File(path);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역직렬화
			List<Ex01_VO> list = (List<Ex01_VO>) ois.readObject();
			Iterator<Ex01_VO> it = list.iterator();
			while (it.hasNext()) {
				Ex01_VO k = (Ex01_VO) it.next();
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getWeight()+"\t");
				if(k.isGender()) {
					System.out.println("남성");
				}else {
					System.out.println("여성");
				}
			}
			
		} catch (Exception e) {
			System.out.println("잘못했네요");
			System.out.println(e);
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
