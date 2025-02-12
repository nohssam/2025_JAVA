package e_review;

public class Goods {

	private int no;
	private String gname;
	private String desc;
	
	private static int count;
	
	public static int getCount() {
		return count;
	}
	
	public Goods(){
		this(1000,"상품","우리상품");
	}

	public Goods(int no, String gname) {
//		this.no = no;
//		this.gname = gname;
		this(no, gname, "");
	}
	
	public Goods(int  no, String  gname, String desc ){
		this.no = no;
		this.gname = gname;
		this.desc = desc;
		count++;
	}
	
	
	public void output() {
		System.out.println("번호:" + no +"/상품명:" + gname 
					+ "/상품설명:"+ desc);
	}
}
