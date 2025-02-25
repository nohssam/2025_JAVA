package i_inherit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Item i = null;

		System.out.println("등록할 상품(1.책 2.CD 3.DVD ) ->");
		Scanner input  = new Scanner(System.in);
		int sel = input.nextInt();
		
		switch(sel) {
		case 1 : i = new Book("1000","자바","javassem","ICT"); break;
		case 2 : i = new CD();  break;
		case 3 : i = new DVD(); break;
		}
		
		i.output(); // 다형성
		
//		switch(sel) {
//		case 1 : b.output(); break;
//		case 2 : c.output(); break;
//		case 3 : d.output(); break;
//		}
	}

}
