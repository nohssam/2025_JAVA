package i_inherit;

public class Item {
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
	
	public void output() {
		System.out.println("번호:" + no +"/ 제목 :" + title);
	}
}
