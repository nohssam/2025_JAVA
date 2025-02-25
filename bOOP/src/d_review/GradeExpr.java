package d_review;

public class GradeExpr {

	int[] jumsu;
	
	//GradeExpr(){}
	
	GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
	}
	
	double getAverage() {
		
		double avg = (double)getTotal() / 3;
		
		return avg;
	}
	
	int getTotal() {
		int total = 0;
		for(int i=0; i<jumsu.length; i++) {
			total += jumsu[i];
		}
		return total;
	}	
	
}
