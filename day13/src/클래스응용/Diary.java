package Ŭ��������;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Diary {

	public void window() {
//		�� 3: l1, l2, l3
//		�ؽ�Ʈ�ʵ� 3: t1, t2, t3
//		��ư 1: b
//
//		JFrame, Font, FlowLayout
		JLabel l1 = new JLabel("������ ��¥");
		JLabel l2 = new JLabel("������ ����");
		JLabel l3 = new JLabel("������ ����");
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextArea t3 = new JTextArea(3, 10);
		JButton b = new JButton("���Ͽ� �ϱ� ����");
		JFrame f = new JFrame("���� �ϱ���");
		Font font = new Font("�ü�", 1, 45);
		FlowLayout flow = new FlowLayout();
		f.setSize(500, 600);
		f.setLayout(flow);
		f.add(l1); f.add(t1);
		f.add(l2); f.add(t2);
		f.add(l3); f.add(t3);
		f.add(b);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		b.setFont(font);
		//��ư�� ������, t1,t2,t3�� �Է��� ������ �ֿܼ� ����Ʈ
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				System.out.println("��¥��: " + day);
				System.out.println("������: " + title);
				System.out.println("������: " + content);
				try {
					FileWriter f = new FileWriter(day + ".txt");
					f.write(day + "\n");
					f.write(title + "\n");
					f.write(content + "\n");
					f.close();
				} catch (IOException e1) {
					System.out.println("���� ���� �� �����߻�..!!");
				}
			}
		});
		t1.setBackground(Color.GREEN);//����
		t1.setForeground(Color.blue);//���ڻ�
		t2.setBackground(Color.GREEN);//����
		t2.setForeground(Color.blue);//���ڻ�
		t3.setBackground(Color.GREEN);//����
		t3.setForeground(Color.blue);//���ڻ�
		b.setBackground(Color.red);//����
		b.setForeground(Color.WHITE);//���ڻ�
		f.getContentPane().setBackground(Color.yellow);
		
		f.setVisible(true);
	}

}





