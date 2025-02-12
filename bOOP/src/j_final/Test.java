package j_final;

/*
 	final : 변경불가
 		- class : 부모클래스안됨
 		- field : 값변경 (=>상수)
 		- method : overriding 안됨
 		
 */

class Parent{
	final String field = "부모님꺼";
	public final void jib() {
		System.out.println("부모님이 만드신거");
	}
}

class Child extends Parent{
	Child(){
		//field = "내꺼";
	}
//	public void jib() {
//		System.out.println("부모님꺼 물러받아 탕진");
//	}
}

public class Test {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
	}
}
