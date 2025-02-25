package com.ict.day05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// OutputStreamWriter : 문자 스트림을 바이트 스트림으로 변환
//                      즉 문자를 특정 인코딩을 사용하여 바이트로 변환하는 출력 스트림
// InputStreamReader : 바이트 스트림을 문자 스트림으로 변환

public class Ex12_OutputStreamWriter {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("원하는 문자 : ");
//		
//		String msg = scan.next();
//		System.out.print("받은 문자 : " + msg);
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("원하는 문자 : ");
			bw.flush();
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			bw.write("받는 문자 : " + msg);
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
