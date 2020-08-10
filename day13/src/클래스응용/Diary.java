package 클래스응용;

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
//		라벨 3: l1, l2, l3
//		텍스트필드 3: t1, t2, t3
//		버튼 1: b
//
//		JFrame, Font, FlowLayout
		JLabel l1 = new JLabel("오늘의 날짜");
		JLabel l2 = new JLabel("오늘의 제목");
		JLabel l3 = new JLabel("오늘이 내용");
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextArea t3 = new JTextArea(3, 10);
		JButton b = new JButton("파일에 일기 저장");
		JFrame f = new JFrame("나의 일기장");
		Font font = new Font("궁서", 1, 45);
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
		//버튼을 누르면, t1,t2,t3에 입력한 값들을 콘솔에 프린트
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				System.out.println("날짜는: " + day);
				System.out.println("제목은: " + title);
				System.out.println("내용은: " + content);
				try {
					FileWriter f = new FileWriter(day + ".txt");
					f.write(day + "\n");
					f.write(title + "\n");
					f.write(content + "\n");
					f.close();
				} catch (IOException e1) {
					System.out.println("파일 쓰는 중 에러발생..!!");
				}
			}
		});
		t1.setBackground(Color.GREEN);//배경색
		t1.setForeground(Color.blue);//글자색
		t2.setBackground(Color.GREEN);//배경색
		t2.setForeground(Color.blue);//글자색
		t3.setBackground(Color.GREEN);//배경색
		t3.setForeground(Color.blue);//글자색
		b.setBackground(Color.red);//배경색
		b.setForeground(Color.WHITE);//글자색
		f.getContentPane().setBackground(Color.yellow);
		
		f.setVisible(true);
	}

}





