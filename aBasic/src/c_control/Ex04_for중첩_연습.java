package c_control;

public class Ex04_for중첩_연습 {

	public static void main(String[] args) {
		
		//[0] 기본코드
		/*for(int i=0; i<26; i++) {
			for(char ch='A'; ch<='Z'; ch++) {
				System.out.print(ch);
			}
			System.out.println();	
		}*/	
		
		//[1]
		for(int i=0; i<26; i++) {
			for(char ch='A'; ch<='A'+i; ch++) {
				System.out.print(ch);
			}
			System.out.println();	
		}
		
		//[2]
		
		
		
	}

}
