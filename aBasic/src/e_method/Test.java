package e_method;

class Test {
	
	static int method( int i, int j) {
		 int sum = i + j;
		 System.out.println("sum = " +  sum );
		 return sum;
	}
	
	public static void main ( String  [] args ) {
		 int i = 4,  j = 2;
		 int sum = 0;
		 method( i, j );
		 System.out.println("sum = " +  sum );
	}
}
