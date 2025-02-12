package e_method;

/*
    프로그램 흐름을 반환 : return
    
    return 할 때 딱 1개의 값을 반환
    
    void : 반환하는 값이 없다는 뜻
 */
public class Ex01_반환 {

	public static void main(String[] args) {
		
		int hap = add();
		System.out.println("합2=" + hap);
	}
	
	static int add() {
		// 데이타
		int a = 10, b = 20;
		int sum = a + b;
		return sum;
	}

}
