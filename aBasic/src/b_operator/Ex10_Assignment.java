package b_operator;

public class Ex10_Assignment {

	public static void main(String[] args) {
		
		 int a = 10,  b = 7;
		 
		 //a = a + b;
		 a += b;
		 System.out.println(a);

		 a -= b; // a = a - b
		 System.out.println(a);

		 a *= b; // a = a * b
		 System.out.println(a);

		 a %= b; // a = a % b
		 System.out.println(a);

		 a /= b; // a = a / b
		 System.out.println(a);

		 
		 /*
		  *  축약대입연산자
		  *  	- 산술		+=  -=  *=  /= %=
		  *  
		  *  	- 이진논리		|=  &=  ^=
		  *  	- 쉬프트		<<= >>=
		  */
		 
	}

}
