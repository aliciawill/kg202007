package 스레드;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드3개돌리기 extends JFrame {
	JLabel count, img, now;

	// 선언의 위치가 사용할 수 있는 범위이기 때문에 모든 곳에서 접근해서
	// 사용하려면 전역변수로 설정해야한다.
	public 스레드3개돌리기() {
		// static 메서드에서 모든 것을 처리하기에는 멤버변수가
		// 모두 static되어야하기 때문에 static없는 메서드를 사용하면 좋다.
		setTitle("스레드 3개 돌리기");
		setSize(1000, 300);
		count = new JLabel("카운트: 500");
		img = new JLabel();
		ImageIcon icon = new ImageIcon("1.png");
		img.setIcon(icon);
		now = new JLabel("3");
		Date date = new Date();
		now.setText(date + "");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("궁서", Font.BOLD, 50);
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
		스레드3개돌리기 name = new 스레드3개돌리기();
	}

	// 내부클래스(inner class)
	public class Counter extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트: " + i);
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
				now.setText("현재: " + date);
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
