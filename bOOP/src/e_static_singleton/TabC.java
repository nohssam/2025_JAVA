package e_static_singleton;

public class TabC {

	DBConnect con;
	
	TabC(){
		//con = new DBConnect();
		con = DBConnect.getInstance();
	}
	
	void show() {
		System.out.println("화면 C 출력");
	}
}
