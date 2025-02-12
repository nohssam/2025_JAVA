package k_interface.yesinterface;

public class MainTest {

	public static void main(String[] args) {
		
		// 1. 오라클 디비에 연결하고 사용한다면?
		//DBDriver driver = new OracleDriver();		
		// 2. 오라클 디비에서 마리아 디비로 변경한다면?
		DBDriver driver = new MariadbDriver();		
		
		driver.connect();
		driver.insert();
		
		

	}

}
