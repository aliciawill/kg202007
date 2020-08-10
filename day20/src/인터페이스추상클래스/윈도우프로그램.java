package 인터페이스추상클래스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우프로그램  implements ActionListener{
	static JButton b1, b2;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		//FlowLayout flow = new FlowLayout();
		Font font = new Font("궁서", Font.BOLD, 50);
		b1 = new JButton("나를 눌러요");
		b2 = new JButton("나도 눌러요");
		b1.setFont(font);
		b2.setFont(font);
		f.setSize(350, 200);
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		
		윈도우프로그램 처리부품 = new 윈도우프로그램();
		b1.addActionListener(처리부품);
		b2.addActionListener(처리부품);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			System.out.println("b1버튼을 눌렀음.");
		}else {
			System.out.println("b2버튼을 눌렀음.");
		}
		
	}
}
