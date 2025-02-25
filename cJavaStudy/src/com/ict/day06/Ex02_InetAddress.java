package com.ict.day06;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex02_InetAddress {
	public static void main(String[] args) {
		// InetAddress : 자바에서 IP 주소를 표현하는 클래스
		//               생성자가 있지만 new 연산자를 사용해서 생성할 수 없다.
		//               static 메서드를 이용해서 생성한다.
		//               localhost : 현재 내가 사용하고 있는 컴퓨터를 뜻한다.
		//                           보통은 127.0.0.1 과 같은 의미
		
		// InetAddress 생성
		 try {
			 InetAddress  addr = InetAddress.getLocalHost();
			 System.out.println("이름 : " + addr.getHostName());
			 System.out.println("주소 : " + addr.getHostAddress());
			 System.out.println("toString : " + addr.toString());
			 System.out.println();
			 
			 // 구글
			 addr = InetAddress.getByName("www.google.com");
			 System.out.println("이름 : " + addr.getHostName());
			 System.out.println("주소 : " + addr.getHostAddress());
			 System.out.println("toString : " + addr.toString());
			 System.out.println();
			 
			 // 네이버
			 addr = InetAddress.getByName("www.daum.net");
			 System.out.println("이름 : " + addr.getHostName());
			 System.out.println("주소 : " + addr.getHostAddress());
			 System.out.println("toString : " + addr.toString());
			 System.out.println();
			 
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
