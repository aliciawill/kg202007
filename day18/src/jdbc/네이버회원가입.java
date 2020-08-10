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

public class 네이버회원가입 extends JFrame{

	public 네이버회원가입() {
		setTitle("나의 네이버 회원가입");
		setSize(500, 700);
		
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel("아 이 디:");
		JLabel l3 = new JLabel("패스워드:");
		JLabel l4 = new JLabel("가입이름:");
		JLabel l5 = new JLabel("전화번호:");
		ImageIcon icon = new ImageIcon("003.PNG");
		l1.setIcon(icon);
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JButton b1 = new JButton("회원가입 완료");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("굴림", Font.BOLD, 40);
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
		
		//b1을 클릭했을 때, t1~t4에 입력한 값을 가져다가 mySQL에 넣음.
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//b1을 클릭했을 때 처리할 내용을 이부분에 넣어주면 됨.
				//1)t1~t4에 입력한 값을 가져다가 
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//2)mySQL에 넣음.=> DAO를 이용할 예정
				DAO dao = new DAO();
				//  DAO에 내가 입력한 값들을 전달
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
		네이버회원가입 naver = new 네이버회원가입();
	}

}
