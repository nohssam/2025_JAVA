package b_operator;

/*
 *  증가/감소 연산자 ( ++ / -- )
 * 
 */
public class Ex01_IncDec {

	public static void main(String[] args) {

		// [0]
		int a = 7;
		int b = 5;
		
		// [참고] String + int => String
//		System.out.println("A="+a +", B=" + b);
//		System.out.println("A="+a+1 +", B=" + b+1); // [주의]
//		System.out.println("A="+(a+1) +", B=" + (b+1));
		
		// [1]
		a = a + 1;
		b = b - 1;
		System.out.println("A="+a +", B=" + b);
		
		// [2]
		a++;  // a = a + 1;
		b--;  // b = b - 1;
		System.out.println("A="+a +", B=" + b);
		
		++a;  // a = a + 1;
		--b;  // b = b - 1;
		System.out.println("A="+a +", B=" + b);
		
		
		// [3]
		int su = 10;
		int result = su++;
		System.out.println("result:" + result + ", su=" + su);
		
		int su2 = 10;
		int result2 = ++su2;
		System.out.println("result:" + result2 + ", su=" + su2);
		
		// [4]
		System.out.println("============================");
		int x = 10, y = 10;
		System.out.println("X="+  ++x + ", Y="+  --y); // X=?, Y=?
		System.out.println("X="+  x++ + ", Y="+  y--); // X=?, Y=?
		System.out.println("X="+  x + ", Y="+  y);     // X=?, Y=?
		
		
		
	}

}
