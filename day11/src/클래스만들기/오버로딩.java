package 클래스만들기;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 오버로딩 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		JButton b1 = new JButton();
		b1.setText("빨간신호등");
		f.add(b1);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		ImageIcon icon = new ImageIcon("신호등.jpg");
		
		JButton b2 = new JButton();
		b2.setIcon(icon);
		f.add(b2);
		f.setVisible(true);
	}

}


