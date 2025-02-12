package i_review;
					// 상속관계
public class Korean extends Language{
	
	// overriding
	public void greeting() {
		System.out.println("안녕하세요");
	}
	
	
	public void introduce() {
		System.out.println("저는 홍길동");
	}
	
	public void message() {
		System.out.println("짝꿍님 오늘도 화이팅");
	}
}
