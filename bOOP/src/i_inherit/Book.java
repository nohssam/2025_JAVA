package i_inherit;

public class Book extends Item{
	private String writer;
	private String publisher;
	
	public Book(){
		System.out.println("Book 기본 생성자");
	}
	
	public Book(String no, String title, String writer, String publisher){
		//super.no = no;
		//super.title = title;
		super(no, title);
		
		this.writer = writer;
		this.publisher = publisher;
		System.out.println("Book 인자 생성자");
	}
	
	public void ouput() {
		System.out.println("번호:" + no +"/ 제목 :" + title 
						+ " / 저자:"+ writer + "/ 출판사" + publisher);
	}
}
