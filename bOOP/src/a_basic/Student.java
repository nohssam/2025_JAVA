package a_basic;

public class Student {

	String name;
	int kor, eng, math;
	int total;
	double avg;
	
	int calcTotal() {
		total = kor + eng + math;
		return total;
	}
	
	double calcAvg() {
		avg = (double)total / 3;
		return avg;
	}
}

/*
 	배열: 동일한 데이타타입의 값들을 하나로 묶음
 	클래스: 서로다른 데이타타입의 값들을 하나로 묶음
 		- 멤버변수들 (member fields)
 		- 멤버함수들 (member methods)
*/
