package c_control;

public class Ex09_369게임 {

	public static void main(String[] args) {
		/*
		 	1부터 50까지의 순서대로 숫자를 확인하여
		 	3,6,9 숫자를 포함하면 그 갯수만큼 "짝" 글자를 출력하고
		 	3,6,9 숫자를 하나도 포함하지 않으면 그 숫자를 출력
		 */
		
		int count = 0;
		
		for( int i=1; i<=50; i++) {
			int su = i;
			boolean su369 = false;
			
			// su=32
			while( su != 0) {
				int na = su % 10;
				if(na==3 || na==6 || na==9) {
					System.out.print("짝");
					su369 = true;
				}
				su=su/10;
			}
			
			if( !su369 )System.out.println(i);
			else System.out.println();
		}
		
	}

}
