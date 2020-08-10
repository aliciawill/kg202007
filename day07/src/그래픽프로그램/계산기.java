package 그래픽프로그램;

import java.awt.Color;
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

public class 계산기 {

	public static void main(String[] args) {
//		틀역할 부품 필요
		JFrame f = new JFrame();
		f.setSize(470, 550);
//		버튼 부품 1개 필요
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton mul = new JButton("x");
		JButton div = new JButton("/");
//		배치 해주는 부품 필요
		FlowLayout flow = new FlowLayout();
//		글자 키워주는 부품 필요
		Font font = new Font("궁서", 1, 50);
//
//		글자(숫자1, 숫자2, 이미지 들어갈 곳) 3개 라벨 부품 필요
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel("숫자1");
		JLabel l3 = new JLabel("숫자2");
		JLabel l4 = new JLabel("결과>> ");
//		입력란 2개 JTextField 부품 필요
		JTextField	t1 = new JTextField(5);
		JTextField	t2 = new JTextField(5);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(mul);
		f.add(div);
		f.add(l4);
		f.setLayout(flow);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		plus.setFont(font);
		minus.setFont(font);
		mul.setFont(font);
		div.setFont(font);
		l4.setFont(font);
		ImageIcon icon = new ImageIcon("cal.png");
		l1.setIcon(icon);
		//minus, mul, div button만들어서 껴보세요.
		t1.setBackground(Color.yellow);
		t2.setBackground(Color.yellow);
		t1.setForeground(Color.red);
		t2.setForeground(Color.red);
		plus.setBackground(Color.green);
		minus.setBackground(Color.green);
		mul.setBackground(Color.green);
		div.setBackground(Color.green);
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//입력: t1, t2에서 입력한 값 가지고 온다.
				String data1 = t1.getText();//"200"
				String data2 = t2.getText();//"100"
				//처리: 더하기 처리
				int n1 = Integer.parseInt(data1);
				int n2 = Integer.parseInt(data2);
				int result = n1 + n2;
				//출력: 결과를 출력
				//Integer.parseInt()
				//String result2 = String.valueOf(result);
				l4.setText(result + "");
				//JOptionPane.showMessageDialog(f, result);
			}
		});
		f.setVisible(true);
	}
}





