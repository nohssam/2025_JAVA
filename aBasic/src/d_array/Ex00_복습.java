package d_array;

public class Ex00_복습 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			for(int k=0; k<i; k++) {
				if(lotto[k] == lotto[i]) {
					i--;
					break;
				}
			}
		}

		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "/");
		}
	}

}
