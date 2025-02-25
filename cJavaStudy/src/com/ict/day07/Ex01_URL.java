package com.ict.day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Paths;

// URLConnection 클래스 : 원격지 서버 자원의 결과와 원격지 서버의 헤더 정보를 가져올수 있다.
public class Ex01_URL {
	public static void main(String[] args) {
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String path = Paths.get("d:", "workspaces","0218-1.txt").toString();
		File file = new File(path);
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				// 받은 msg를 계속 추가 시키자
				sb.append(msg+"\n");
			}
			// 화면에 출력
			// System.out.println(sb.toString());
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
			   br.close();
			   isr.close();
			   is.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}







