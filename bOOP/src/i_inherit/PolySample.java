package i_inherit;

public class PolySample {

	public static void main(String[] args) {
		
		Item [] result = method();
		// 출력
		for(int i=0; i<result.length; i++) {
			result[i].output();//*****
		}
		
	}
	
	static Item [] method() {
		Book b = new Book("001","파이썬","ICT","여기");
		CD   c = new CD();
		DVD  d = new DVD();
		
		Item [] obj = new Item[3];
		obj[0] = b;
		obj[1] = c;
		obj[2] = d;
		
		return obj;
	}

}
