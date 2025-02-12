package e_method;

import java.util.Scanner;

public class Ex09_연습2 {

	public static void main(String[] args) {
		char[][] arr = input();
		output(arr);
	}
	
	// 두 정수와 알파벳 문자 하나를 입력받음
	// [예] 3 4 F
	static char[][] input() {
		Scanner input = new Scanner(System.in);
		System.out.println("입력 [예] 3 4 F =>");
		int first = input.nextInt();
		int second = input.nextInt();
		char ch = input.next().charAt(0);
		
		char[][] arr = makeSquare(first, second, ch);
		return arr;
	}
	
	/* 입력받은 두 정수와 알파벳 문자를 받아서
	   첫번째 정수만큼의 행과 두번째 정수만큼의 열의 문자 배열을 만들어서
	   입력받은 문자로 시작하는 배열을 만들기
	 
	 	[예] 3 4 F
	 	
	 	F G H I
	 	J K L M
	 	N O P Q
	  	
	 */
	static char[][] makeSquare(int a, int b, char c) {
		char[][] arr = new char[a][b];
		for(int i=0; i< a; i++) {
			for(int j=0; j<b; j++ ) {
				arr[i][j]=c;
				c++;
			}
		}
		return arr;
	}
	
	// 2차원 문자변수를 받아서 출력
	static void output(char[][] arr) {
		
	}
}
