package e_method;

public class Ex01_리턴타입 {

	public static void main(String[] args) {
		// 데이타를 받아서 합산하고 결과처리
		int[] data = add();
		
		int hap = 0;
		for(int i=0; i<data.length; i++) {
			hap += data[i];
		}
		System.out.println("합산:" + hap);
	}

	static int[] add(){
		// 데이타
		int kor =99, eng =88, math=77;
		int[] data = {kor,eng,math};
		
		return data; // 리턴할 때 딱 1개만 가능
	}
}
