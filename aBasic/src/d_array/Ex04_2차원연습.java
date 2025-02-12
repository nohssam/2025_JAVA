package d_array;

public class Ex04_2차원연습 {

	public static void main(String[] args) {
		
		int [][] a = {
						{3, -5, 12},
						{-2, 11, 2, -7},
						{21, -21, 3, 9, -27, -11},
						{9, 14, 21, -100}
					};
	
		
		// [문제] 각 행의 값들의 합을 출력
		int [] hap = new int[a.length];
		
		// 합산
		for(int i=0; i< a.length ; i++) {
			for(int j=0; j<a[i].length; j++) {
				hap[i] += a[i][j];
				// hap[i] = hap[i] + a[i][j];
			}
		}
		
		// 출력
		for(int i=0; i< hap.length; i++) {
			System.out.println(i+"번째 줄의 합산:" + hap[i]);
		}
		
//
//int  arr [] [] = {  
//					{ 1, 2, 3, 4, 5}, 
//					{ 6, 7, 8 }, 
//					{ 9 } , 
//					{ 7, 7, 7, 7 }  
//				};
//System.out.println(arr.length);
//System.out.println(arr[2].length);

	}

}

// 출력
//for(int i=0; i< a.length; i++) {
//	for(int j=0; j< a[i].length ; j++) {
//		System.out.print( a[i][j] +"/");
//	}
//	System.out.println();
//}

// a배열의 모든 값의 합을 구해서 출력
//int sum = 0;
//for(int i=0; i< a.length; i++) {
//	for(int j=0; j< a[i].length ; j++) {
//		sum += a[i][j];
//	}
//}
//System.out.println("총합:" + sum);
