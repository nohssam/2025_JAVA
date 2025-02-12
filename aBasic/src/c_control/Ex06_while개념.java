package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 	[참고]
  
  	StringTokenizer 수업으로 문장을 입력받아 단어를 출력하기
		   	
	[1]
   	while( st.hasMoreToken() )
   
   	[2]
   	int count = st.countToken();
   	for(  ) 가능 	
 	
 */
public class Ex06_while개념 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("당신의 각 과목 점수를 입력(예시. 90/80/70) ");
		// String strScore = input.next();
		String strScore = input.nextLine();
		//System.out.println(strScore);
		
		StringTokenizer st = new StringTokenizer(strScore);
		
		int total = 0;
		while(st.hasMoreTokens()) { //
			String token = st.nextToken();
			//System.out.println("점수:" + token);
			
			total +=  Integer.parseInt(token);
		}
		
		System.out.println("총점:" + total);
		
	}

}
