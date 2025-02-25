package k_interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {

	JFrame f;
	JButton btn;
	
	Test(){
		f 	= new JFrame("우리의 첫 예제");
		btn = new JButton("오케이");
		
		f.add(btn);
		f.setBounds(200, 200, 700, 500);
		f.setVisible(true);
		
		BtnHandler bHdlr = new BtnHandler();
		btn.addActionListener(bHdlr);
	}
	
	// 부모클래스 : extends 
	// 부모인터페이스 : implments
	class BtnHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "짜짜~~~잔");
			System.out.println("이벤트");
		}		
	}
	
	void abc() {
		JOptionPane.showMessageDialog(null, "짜짜~~~잔");
	}
	
	public static void main(String[] args) {
		Test t = new Test();

	}

}
