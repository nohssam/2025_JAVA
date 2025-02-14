package com.ict.day05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Paths;

// DataOutputStream, DataInputStream
//  기본자료형을 읽고, 쓸 수 있는 스트림 
//  반드시 입력순서와 출력순서를 맞춰야 한다.
//  이진 데이터 형식(바이너리 형식)으로 파일 또는 네트워크 스크림에 기록할 때 사용
public class Ex05_DataStream {
	public static void main(String[] args) {
		String path = Paths.get("D:", "workspaces","0214-2.txt").toString();
		File file = new File(path);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			// writeXXX(데이터) => XXX는 자료형을 뜻한다.
			dos.writeInt(123);
			dos.writeBoolean(true);
			dos.writeDouble(124.789);
			dos.writeChar('d');
			dos.writeInt(124754);
			dos.flush();
			
			// 읽기
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			// readXXX() => XXX 자료형을 뜻한다.(반드시 출력 순서 맞게)
			int k1 = dis.readInt();
			boolean k2 = dis.readBoolean();
			double k3 =  dis.readDouble();
			char k4 = dis.readChar();
			int k5 = dis.readInt();
			
			System.out.println(k1);
			System.out.println(k2);
			System.out.println(k3);
			System.out.println(k4);
			System.out.println(k5);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				dis.close();
				bis.close();
				fis.close();
				dos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
