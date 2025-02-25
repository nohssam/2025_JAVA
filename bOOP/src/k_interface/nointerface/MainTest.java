package k_interface.nointerface;

public class MainTest {

	public static void main(String[] args) {
		
		// 1. 오라클 디비에 연결하고 사용한다면?
		OracleDriver driver = new OracleDriver();
		driver.connectOracle();
		driver.insertOracle();
		
		// 2. 오라클 디비에서 마리아 디비로 변경한다면?
		MariadbDriver driver2 = new MariadbDriver();
		driver2.connectDB();
		driver2.insertDB();
	}

}
