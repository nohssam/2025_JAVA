package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		/*
		
		int a = 3;
		if( a>3 && ++a>3) {
			System.out.println("조건만족");
		}
		System.out.println("A="+ a);
		
		if( a>1 || ++a>3) {
			System.out.println("조건만족2");
		}
		System.out.println("A=" + a);
		*/
		/*
		 *  short circuit logic
		 */
		
		
		int a = 3;
		if( a>3 & ++a>3) {
			System.out.println("조건만족");
		}
		System.out.println("A="+ a);
		
		if( a>1 | ++a>3) {
			System.out.println("조건만족2");
		}
		System.out.println("A=" + a);
	}

}
