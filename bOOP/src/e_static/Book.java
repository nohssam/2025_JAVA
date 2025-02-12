package e_static;

/*  [ static ] 
 
 	 ` 공유 - 객체끼리의 공유
 	 ` 메모리에 단 1개만 생성
 	 ` 객체생성보다 먼저 생성  ==> 클래스명으로 접근
 	 
 	 -> static은 클래스명 접근
 */

public class Book {

	private static int count;
	
	public static int getCount() {
		return count;
	}
	
	public Book() {
		count++;
		System.out.println("책 한권 생성");
	}
}
