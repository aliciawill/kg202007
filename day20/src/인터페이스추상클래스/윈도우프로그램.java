package �������̽��߻�Ŭ����;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ���������α׷�  implements ActionListener{
	static JButton b1, b2;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		//FlowLayout flow = new FlowLayout();
		Font font = new Font("�ü�", Font.BOLD, 50);
		b1 = new JButton("���� ������");
		b2 = new JButton("���� ������");
		b1.setFont(font);
		b2.setFont(font);
		f.setSize(350, 200);
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		
		���������α׷� ó����ǰ = new ���������α׷�();
		b1.addActionListener(ó����ǰ);
		b2.addActionListener(ó����ǰ);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			System.out.println("b1��ư�� ������.");
		}else {
			System.out.println("b2��ư�� ������.");
		}
		
	}
}
