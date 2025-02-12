package c_control;

/*
 * [컴파일+실행] ctrl + F11 (무조건)
 * 
 * [디버깅] F11(의도적)
 */
public class Ex09_for_연습 {

	public static void main(String[] args) {
		
		// 1~100까지 홀수의 합과 짝수의 합을 구하기
		int odd=0, even=0;
		for(int i=1; i<=10; i+=2) {
			odd+=i;
			even+=(i+1);
		}
		System.out.println("홀수의 합:" + odd);
		System.out.println("짝수의 합:" + even);

	}

}
