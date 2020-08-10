package 데이터;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품연습2 {

	public static void main(String[] args) {
		//컨트롤+스페이스바(자동완성)
		//컨트롤 +f11(실행)
		JFrame f = new JFrame();
		JButton b = new JButton();
		f.setSize(500, 500);
		
		b.setText("나를 눌러요");
		f.add(b);		
		
		JButton b2 = new JButton();
		b2.setText("나도 눌러요");
		f.add(b2);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.setVisible(true);
		
	}

}
