package c_control;

/*
 *  [예] 사이즈 결정 ( 1.small  2. medium  3. large )
 *  >>> 1 (입력)
 */

enum Size{
	SMALL,
	MEDIUM,
	LARGE
}
public class Ex09_복습2 {

	public static void main(String[] args) {
		
		// 화면에서 버튼이 눌렸다고 상상하기
		Size size = Size.SMALL;
		switch(size) {
		case SMALL: System.out.println("작은거"); break;
		case MEDIUM:System.out.println("중간거"); break;
		case LARGE:System.out.println("큰거");	break;
		}
		
	}

}
