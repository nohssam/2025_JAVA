package e_static;

public class Sample2 {

	String general = "일반변수";
	static String staticVar = "static변수";
	
	public static void main(String[] args) {
		
		//--------------------
		//[1]
		//System.out.println(general);
		System.out.println(staticVar);
		
		//[2]
		Sample2 s = new Sample2();
		System.out.println(s.general);
	}

}
