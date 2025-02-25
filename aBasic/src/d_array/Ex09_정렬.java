package d_array;

public class Ex09_정렬 {

	public static void main(String[] args) {

		int[] lotto = { 45, 2, 15, 27, 10, 41 };

		// 버블정렬 하기
		for (int i = 0; i < lotto.length - 1; i++) {
		    for (int j = 0; j < lotto.length - 1 - i; j++) {
		        if (lotto[j] > lotto[j + 1]) {
		            // 요소 교환
		            int temp = lotto[j];
		            lotto[j] = lotto[j + 1];
		            lotto[j + 1] = temp;
		        }
		    }
		}
		// [선택] 선택정렬, 삽입정렬

		// 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
