package �������̽��߻�Ŭ����;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ���������α׷�2{
	static JButton b1, b2;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		Font font = new Font("�ü�", Font.BOLD, 50);
		b1 = new JButton("���� ������");
		b2 = new JButton("���� ������");
		b1.setFont(font);
		b2.setFont(font);
		f.setSize(350, 200);
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		
		//�ȵ���̵忡���� �������̽��� 
		//�ҿ����� �޼��带 ������ �̸����� Ŭ������ ��ü����
		//�͸�Ŭ����
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b1�� Ŭ����.");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2�� Ŭ����.");
			}
		});
		f.setVisible(true);
	}
}
