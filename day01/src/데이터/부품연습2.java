package ������;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ǰ����2 {

	public static void main(String[] args) {
		//��Ʈ��+�����̽���(�ڵ��ϼ�)
		//��Ʈ�� +f11(����)
		JFrame f = new JFrame();
		JButton b = new JButton();
		f.setSize(500, 500);
		
		b.setText("���� ������");
		f.add(b);		
		
		JButton b2 = new JButton();
		b2.setText("���� ������");
		f.add(b2);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.setVisible(true);
		
	}

}
