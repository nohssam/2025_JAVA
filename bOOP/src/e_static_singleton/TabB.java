package e_static_singleton;

public class TabB {

	DBConnect con;
	
	TabB(){
		//con = new DBConnect();
		con = DBConnect.getInstance();
	}
	
	void show() {
		System.out.println("화면 B 출력");
	}
}
