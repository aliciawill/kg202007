package jdbc;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ���̹�ȸ������ extends JFrame{

	public ���̹�ȸ������() {
		setTitle("���� ���̹� ȸ������");
		setSize(500, 700);
		
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel("�� �� ��:");
		JLabel l3 = new JLabel("�н�����:");
		JLabel l4 = new JLabel("�����̸�:");
		JLabel l5 = new JLabel("��ȭ��ȣ:");
		ImageIcon icon = new ImageIcon("003.PNG");
		l1.setIcon(icon);
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JButton b1 = new JButton("ȸ������ �Ϸ�");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("����", Font.BOLD, 40);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		b1.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		
		add(l1);
		add(l2); add(t1);
		add(l3); add(t2);
		add(l4); add(t3);
		add(l5); add(t4);
		add(b1);
		
		//b1�� Ŭ������ ��, t1~t4�� �Է��� ���� �����ٰ� mySQL�� ����.
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//b1�� Ŭ������ �� ó���� ������ �̺κп� �־��ָ� ��.
				//1)t1~t4�� �Է��� ���� �����ٰ� 
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//2)mySQL�� ����.=> DAO�� �̿��� ����
				DAO dao = new DAO();
				//  DAO�� ���� �Է��� ������ ����
				try {
					dao.db(id, pw, name, tel);
				} catch (Exception e1) {
				}
			}
		});
		
		getContentPane().setBackground(Color.green);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		���̹�ȸ������ naver = new ���̹�ȸ������();
	}

}
