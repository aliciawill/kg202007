package �׷������α׷�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class �����׷��� {

	public static void main(String[] args) {
		//�ʿ��� ��ǰ �� RAM�� ����� �� �ֵ��� ������ ����.
//		Ʋ���� ��ǰ �ʿ�
		JFrame	f = new JFrame(); //�⺻ ���� �Ⱥ������� ����.
		f.setSize(1000, 800);
		
//		��ư ��ǰ 2�� �ʿ�
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		b1.setText("��");
		b2.setText("����");
		
//		��ġ ���ִ� ��ǰ �ʿ�
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
//		���� Ű���ִ� ��ǰ �ʿ�
		Font font = new Font("�ü�", 1, 150); //1�� ���ϰ�
		b1.setFont(font);
		b2.setFont(font);
		
		f.setTitle("���� ���� �׷��� ���α׷�");
		
		f.add(b1);//jframe�� b1�� �÷��ַ�.
		f.add(b2);
		
		b1.setBackground(Color.yellow); //����
		b2.setBackground(Color.pink);
		b1.setForeground(Color.blue); //���ڻ�
		b2.setForeground(Color.green);
		
		JButton img = new JButton();
		ImageIcon icon = new ImageIcon("car.jpg");
		img.setIcon(icon);
		f.add(img);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1�� ������ ��, �̺κ��� �����.
				JOptionPane.showMessageDialog(f, "b1�� Ŭ������");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2�� Ŭ������.");
			}
		});
		
		
		
		
		
		
		f.setVisible(true);
	}
}



