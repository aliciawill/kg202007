package ������;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ������3�������� extends JFrame {
	JLabel count, img, now;

	// ������ ��ġ�� ����� �� �ִ� �����̱� ������ ��� ������ �����ؼ�
	// ����Ϸ��� ���������� �����ؾ��Ѵ�.
	public ������3��������() {
		// static �޼��忡�� ��� ���� ó���ϱ⿡�� ���������
		// ��� static�Ǿ���ϱ� ������ static���� �޼��带 ����ϸ� ����.
		setTitle("������ 3�� ������");
		setSize(1000, 300);
		count = new JLabel("ī��Ʈ: 500");
		img = new JLabel();
		ImageIcon icon = new ImageIcon("1.png");
		img.setIcon(icon);
		now = new JLabel("3");
		Date date = new Date();
		now.setText(date + "");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("�ü�", Font.BOLD, 50);
		count.setFont(font);
		img.setFont(font);
		now.setFont(font);

		add(count);
		add(img);
		add(now);

		Counter counter = new Counter();
		counter.start();

		Timer timer = new Timer();
		timer.start();

		Image image = new Image();
		image.start();

		setVisible(true);

	}

	public static void main(String[] args) {
		������3�������� name = new ������3��������();
	}

	// ����Ŭ����(inner class)
	public class Counter extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("ī��Ʈ: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public class Timer extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();
				now.setText("����: " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public class Image extends Thread {
		String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				img.setIcon(icon);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				if (i == 4) {
					i = -1;
				}
			}
		}
	}

}// class
