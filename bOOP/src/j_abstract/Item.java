package j_abstract;

/*
 	abstract(추상) : 미완성
 	 - method : overriding 강제성
 	 - class  : 객체생성못함
 	 			부모클래스 역할만 함
 */

public abstract class Item {
	protected String no;
	protected String title;
	
	public Item(){
		System.out.println("부모 기본 생성자");
	}
	
	public Item(String no, String title){
		this.no = no;
		this.title = title;
		System.out.println("부모 인자 생성자");
	}
	
	public abstract void output();
}
