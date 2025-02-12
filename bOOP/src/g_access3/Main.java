package g_access3;

import g_access2.sub.Access;

// 상속관계 - 부모 자식 관계
//		 Access(부모) / Main(자식)
public class Main extends Access{

	public static void main(String[] args) {
		Main me = new Main();
		//me.a = "프라이빗 변경";
		//me.b = "디폴트 변경";
		me.c = "프로텍티트 변경";
		me.d = "퍼블릭 변경";
		
		me.output();
	}

}
