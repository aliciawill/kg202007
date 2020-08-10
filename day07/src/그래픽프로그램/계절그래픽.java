package 그래픽프로그램;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 계절그래픽 {

	public static void main(String[] args) {
		//필요한 부품 다 RAM에 사용할 수 있도록 복사해 놓자.
//		틀역할 부품 필요
		JFrame	f = new JFrame(); //기본 값이 안보임으로 설정.
		f.setSize(1000, 800);
		
//		버튼 부품 2개 필요
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		b1.setText("봄");
		b2.setText("여름");
		
//		배치 해주는 부품 필요
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
//		글자 키워주는 부품 필요
		Font font = new Font("궁서", 1, 150); //1은 진하게
		b1.setFont(font);
		b2.setFont(font);
		
		f.setTitle("나의 계절 그래픽 프로그램");
		
		f.add(b1);//jframe에 b1을 올려주렴.
		f.add(b2);
		
		b1.setBackground(Color.yellow); //배경색
		b2.setBackground(Color.pink);
		b1.setForeground(Color.blue); //글자색
		b2.setForeground(Color.green);
		
		JButton img = new JButton();
		ImageIcon icon = new ImageIcon("car.jpg");
		img.setIcon(icon);
		f.add(img);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 눌렀을 때, 이부분이 실행됨.
				JOptionPane.showMessageDialog(f, "b1을 클릭했음");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2를 클릭했음.");
			}
		});
		
		
		
		
		
		
		f.setVisible(true);
	}
}



