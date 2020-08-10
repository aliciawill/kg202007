package 인터페이스추상클래스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우프로그램2{
	static JButton b1, b2;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		Font font = new Font("궁서", Font.BOLD, 50);
		b1 = new JButton("나를 눌러요");
		b2 = new JButton("나도 눌러요");
		b1.setFont(font);
		b2.setFont(font);
		f.setSize(350, 200);
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		
		//안드로이드에서는 인터페이스의 
		//불완전한 메서드를 구현한 이름없는 클래스의 객체생성
		//익명클래스
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b1을 클릭함.");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2를 클릭함.");
			}
		});
		f.setVisible(true);
	}
}
