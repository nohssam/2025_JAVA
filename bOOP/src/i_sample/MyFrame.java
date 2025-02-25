package i_sample;

import java.awt.Button;
import java.awt.Frame;

// 단일상속
public class MyFrame extends Frame{

	Button b;
	
	MyFrame(){
		super("두번째 화면");
		
		b = new Button("OK");
		
		add(b);
		
		setBounds(100, 100, 500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		MyFrame f  = new MyFrame();

	}

}
