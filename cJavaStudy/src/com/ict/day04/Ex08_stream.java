package com.ict.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

/*
	스트림 : 데이터를 원하는 목적지까지 입/출력하는 방법
	종류 : 바이트스트림, 문자스트림, 결합스트림, 오브젝트스트림
	1. 바이트 스트림 : 모든 처리 1byte 처리 
	        대상  : 바이트로 이울어진 모든 파일(사진, 동영상, 소리)
	   최상위 클래스 : InputStream(입력), OuputStream(출력)
	2. 문자 스트림  : 모든 처리 2byte 처리 
	        대상  : 세계 모든 문자로 구성된 파일
	   최상위 클래스 : Reader(입력), Writer(출력)
	3. 결합 스트림 : 바이트스트림 <==>결합스트림<==> 문자스트림           
	            기계를 통한 입/출력된 정보 사람이 알아볼수 있도록 입/출력 한다.
	   최상위 클래스 :  InputStreamReader(입력), OuputStreamWriter(출력)
	4. 오브젝트 스트림 : 객체 직렬화 후 객체 단위로 입/출력
	         대상 : 객체
	   최상위 클래스 : ObjectInputStream(readObject() => 역직렬화)
	              ObjectOutputStream(writeObject() => 직렬화)                       
 */

public class Ex08_stream {
	public static void main(String[] args) {
		// 파일 바이트 출력 스트림 ; OutputSteram 자식 클래스인 FileOutputStream 사용
		// FileOutputStream 은 해당 파일에 내용을 1byte씩 출력(쓰기) 
		// 주요 메서드
		//  1. write(int b): int 숫자(아스키코드(0-255), 한 글자
		//                   아스키 코드 -> 숫자(0-9), 영어 대/소문자, 일부특수문자만 가능
		//  2. write(byte[] b) : 배열 b에 존재하는 아스키 코드 출력(쓰기)
		//                       String 클래스에 getBytes()를 이용해서 byte[]를 만들수 있다.
		//  3. flush() : 출력 버퍼 용량이 다 차지 않아도 바로 출력하게 만드는 메서드
		//  4. close() : 출력 스트림 닫기
		
		// 파일 만들어서 경로 지정
		String path = Paths.get("D:", "workspaces","0213.txt").toString();

		File file = new File(path);

		// 파일이 없으면 만들어진다. 있으면 덮어쓰기 가 된다.
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			// 사진,동영상,음악파일을 쓰기 할때는 반드시 write(int b)사용
			// 만약,글자로 이루어진 파일을 쓸때는 String에 getBytes()를 사용 
			
			// 아스키코드 97일 출력 된다
			fos.write(97);
			fos.write(65);
			fos.write(13); // 줄변경
			
			fos.write('B');
			fos.write('o');
			fos.write('y');
			fos.write('s');
			fos.write(13); // 줄변경
			
			// 영어를 제외한 글자들은 제대로 나오지 않습니다.
			byte[] b = {'h','i',(byte)('강'),'0','9'};
			fos.write(b);
			fos.write(13); // 줄변경
			
			String msg = "Hi~~\n안녕\n123456\n大韓\nBye~~~";
			byte[] b2 = msg.getBytes();
			fos.write(b2);
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}










