package i_inherit;

// 상속관계 : extends
public class Adul extends Appa{

	public Adul() {
		System.out.println("아들 생성");
	}
	
	public void gene() {
		System.out.println("자식은 자식이다");
	}
	
	public void study() {
		System.out.println("아들은 학생");
	}
}
