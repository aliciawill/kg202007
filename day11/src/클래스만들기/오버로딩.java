package Ŭ���������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class �����ε� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		JButton b1 = new JButton();
		b1.setText("������ȣ��");
		f.add(b1);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		ImageIcon icon = new ImageIcon("��ȣ��.jpg");
		
		JButton b2 = new JButton();
		b2.setIcon(icon);
		f.add(b2);
		f.setVisible(true);
	}

}


