package Ŭ��������;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class �α��� {

	public static void main(String[] args) {
		//�ʿ��� ��ü�� �����ؼ� ������ ����.
		//jframe 1, jlabel 3, jtextfield 2, jbutton 2
		JFrame f = new JFrame("���� �ϱ��� �α��� ȭ��");
		f.setSize(550,650);
		//��ġ���ִ� ��ü ����
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//JLabel: ���ڿ�
		JLabel top = new JLabel();//�̹��� ������ �������.
		ImageIcon icon = new ImageIcon("top.png");
		top.setIcon(icon);
		JLabel id = new JLabel("id: ");
		JLabel pw = new JLabel("pw: ");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JButton b1 = new JButton();
		ImageIcon icon2 = new ImageIcon("login.png");
		b1.setIcon(icon2);
		JButton b2 = new JButton();
		ImageIcon icon3 = new ImageIcon("reset.png");
		b2.setIcon(icon3);
		//�ѹ� ����� �� �ڵ忡�� ������ ������ �� �ִ�.
		Font font = new Font("�ü�", 1, 45);
		id.setFont(font);
		pw.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		
		f.add(top);
		f.add(id); f.add(t1);
		f.add(pw); f.add(t2);
		f.add(b1); f.add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ư�� Ŭ������ �� ó���� ������ ���
				System.out.println("b1 ��ư�� ������.");
				String getId = t1.getText();
				String getPw = t2.getText();
				String saveId = "root";
				String savePw = "1234";
				//������ �񱳴� Ŭ�������� �����ϴ� �޼ҵ带 ���
				if ( getId.equals(saveId) && getPw.equals(savePw) ) {
					System.out.println("�α��� ����.!!");
					Diary diary = new Diary();
					diary.window();
				} else {
					JOptionPane.showMessageDialog(f, "�α��� ����.!! �ٽ� �Է��ϼ���.!!");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ư�� Ŭ������ �� ó���� ������ ���
				System.out.println("b2 ��ư�� ������.");
				t1.setText("");
				t2.setText("");
			}
		});
		
		f.setVisible(true);
	}

}




