package d_review;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("데이타갯수->");
		int su = input.nextInt();
		
		int [] data = new int[su];
		
		System.out.println("점수입력 (예시)10,20,30 ->");
		String str = input.next();
		StringTokenizer st = new StringTokenizer(str,",");
		for(int i=0; i< data.length; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		GradeExpr  grade = new GradeExpr(data);
		System.out.println("총점:" + grade.getTotal());
		System.out.printf("평균:%.2f", grade.getAverage());
	}

}
