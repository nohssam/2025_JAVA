package i_sample;

import java.awt.Button;
import java.awt.Frame;

public class Temp {

	Frame f;
	Button b;
	
	Temp(){
		f = new Frame("나의 첫번째 화면");
		b = new Button("OK");
		
		f.add(b);
		
		f.setBounds(100, 100, 400, 350);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Temp t = new Temp();

	}

}
