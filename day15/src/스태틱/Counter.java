package ����ƽ;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame("���� ī���� ���α׷�");
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JButton plus = new JButton("1���ϱ�");
		JButton zero = new JButton("0���� �ʱ�ȭ");
		JButton minus = new JButton("1 �� ��");
		JLabel number = new JLabel("0");
		// �����ڰ� �ϳ��� ������ �Ķ���;��� �����ڰ� �ڵ����� ���������.
		// Dog(), �⺻������(default constructor)
		Font font = new Font("�ü�", Font.BOLD, 150);
		number.setFont(font);
		f.add(plus);
		f.add(zero);
		f.add(minus);
		f.add(number);
		plus.setBackground(Color.green);
		zero.setBackground(Color.blue);
		zero.setForeground(Color.white);
		minus.setBackground(Color.green);
		number.setForeground(Color.red);
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
				// number.setText(String.valueOf(count));
			}
		});
		zero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
			}
		});

		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");
			}
		});

		f.setVisible(true);
	}
}
