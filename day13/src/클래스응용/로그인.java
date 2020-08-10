package 클래스응용;

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

public class 로그인 {

	public static void main(String[] args) {
		//필요한 객체를 생성해서 가지고 오자.
		//jframe 1, jlabel 3, jtextfield 2, jbutton 2
		JFrame f = new JFrame("나의 일기장 로그인 화면");
		f.setSize(550,650);
		//배치해주는 객체 생성
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//JLabel: 글자용
		JLabel top = new JLabel();//이미지 끼려고 만들었음.
		ImageIcon icon = new ImageIcon("top.png");
		top.setIcon(icon);
		JLabel id = new JLabel("id: ");
		JLabel pw = new JLabel("pw: ");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JButton b1 = new JButton();
		ImageIcon icon2 = new ImageIcon("login.png");
		b1.setIcon(icon2);
		JButton b2 = new JButton();
		ImageIcon icon3 = new ImageIcon("reset.png");
		b2.setIcon(icon3);
		//한번 만들면 이 코드에서 여러번 지정할 수 있다.
		Font font = new Font("궁서", 1, 45);
		id.setFont(font);
		pw.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		
		f.add(top);
		f.add(id); f.add(t1);
		f.add(pw); f.add(t2);
		f.add(b1); f.add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 처리할 내용을 기술
				System.out.println("b1 버튼을 눌렀음.");
				String getId = t1.getText();
				String getPw = t2.getText();
				String saveId = "root";
				String savePw = "1234";
				//참조형 비교는 클래스에서 제공하는 메소드를 사용
				if ( getId.equals(saveId) && getPw.equals(savePw) ) {
					System.out.println("로그인 성공.!!");
					Diary diary = new Diary();
					diary.window();
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패.!! 다시 입력하세요.!!");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 처리할 내용을 기술
				System.out.println("b2 버튼을 눌렀음.");
				t1.setText("");
				t2.setText("");
			}
		});
		
		f.setVisible(true);
	}

}




