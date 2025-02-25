package com.ict.day02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03_List {
	public static void main(String[] args) {
		// List 인터페이스 : 배열과 흡사한 구조
		//               삽입,삭제, 추가가 자유롭다.
		//               크기를 미리 지정하지 않아도 된다.
		//               중복 허용
		// List 구현한 클래스 : Stack, Vector, ArrayList
		// Stack는 LIFO(Last In First Out)
		// 마지막에 들어온 데이터가 먼저 나가는 구조
		
		// add, push, addElement => 추가
		// add(index, E) => 삽입
		// push : 추가
		// pop  : 스택에서 맨 위에 존재하는 객체 반환 후 삭제 O
		// peek : 스택에서 맨 위에 존재하는 객체 반환 후 삭제 X
		// contains(Element e) : boolean => 인자로 받은 객체를 포함하고 있으면 true
		
		// search(Object o) : int => 검색 (오른쪽 1부터)
		// **indexOf(object o): int => 검색 (왼쪽 0부터)=> 배열처리와 같음
		
		// elementAt(index) : 해당 위치에 있는 요소 반환
		// **get(index)     : 해당 위치에 있는 요소 반환
		
		// firstElement()   : 맨 처음 요소 반환   => get(0)
		// lastElement()    : 맨 마지막 요소 반환  => get(size-1)
		// setElement(Element, index) : 바꾸기(치환)
		
		
	}
}
