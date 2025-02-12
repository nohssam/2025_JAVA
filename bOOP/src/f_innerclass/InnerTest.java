package f_innerclass;

public class InnerTest {
	public static void main(String[] args) {
		//Outer o = new Outer();
		//Outer.Inner in = o.new Inner();
		//in.najabara();
		
		//Outer.Inner in = new Outer.Inner();
		//in.najabara();
		
		Outer.Inner.najabara();
	}
}

class Outer{
	static class Inner {
		static void najabara() {
			System.out.println("잡아보슈~");
		}
	}
}

/*
class Outer{
	class Inner {
		void najabara() {
			System.out.println("잡아보슈~");
		}
	}
}*/