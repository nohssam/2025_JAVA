package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_baseball {

	public static void main(String[] args) {

		//--------------------------
		// [1] 서로 다른 임의의 수 3개를 baseball 변수 지정
		int [] baseball = new int[3];

		for(int i=0; i<baseball.length; i++) {
			baseball[i] = (int)(Math.random()*10);
			for(int k=0; k<i; k++) {
				if(baseball[k] == baseball[i]) {
					i--;
					break;
				}
			}
		}		

		// baseball값 출력-> 추후에 지움
		for(int i=0; i< baseball.length; i++) {
			System.out.print(baseball[i]+"/");
		}

		for(int z=0; z<5; z++) {
			//----------------------------------
			// 2. 사용자의 입력값 answer 에 숫자로 저장
			//	  [입력예] 1 2 3 
			int[] answer = new int[3];

			Scanner input = new Scanner(System.in);
			System.out.println("숫자입력 [입력예] 1 2 3 ->");
			String str = input.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			for(int i=0; i<answer.length; i++) {
				answer[i] = Integer.parseInt( st.nextToken() );
			}

			//------------------------------
			// 3. 값 비교하여 결과 출력
			int strike = 0, ball = 0;
			for(int i=0; i<baseball.length; i++) {
				for(int j=0; j<answer.length; j++) {
					if(baseball[i] == answer[j]) {
						if( i==j) strike++;
						else ball++;
					}
				}
			}		
			System.out.println("스크라이크:"+strike +"/볼:" + ball);

			if( strike == 3) break;
			
		}
		

	}

}
