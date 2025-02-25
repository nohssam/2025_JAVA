package c_array;

/*
 * 캡슐화
 * 	  (기본적) 권한관리하자
 * 	
 * 	` 멤버변수는 접근금지 : private
 *  ` 멤버메소드는 접근허용 : public 
 */

public class Student {

	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	public int calcTotal() {
		total = kor + eng + math;
		return total;
	}
	

	public double calcAvg() {
		avg = (double)total / 3;
		return avg;
	}

	// setter, getter
	public String getName() {
		return name;
	}



	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	
}

/*
 	배열: 동일한 데이타타입의 값들을 하나로 묶음
 	클래스: 서로다른 데이타타입의 값들을 하나로 묶음
 		- 멤버변수들 (member fields)
 		- 멤버함수들 (member methods)
*/
