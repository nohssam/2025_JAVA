package e_static_singleton;

public class TabA {

	DBConnect con;
	
	TabA(){
		//con = new DBConnect();
		con = DBConnect.getInstance();
	}
	
	void show() {
		System.out.println("화면 A 출력");
	}
}
