package e_static_singleton;

public class DBConnect {

	private DBConnect(){
		System.out.println("실제로 디비 연결");
	}
	
	private static DBConnect  con = null;
	
	public static DBConnect getInstance() {
		if( con == null) con = new DBConnect();
		return con;
	}
}
