package 제어문;

import javax.swing.JOptionPane;

public class 입력연습 { //input, 들어온다 뜻.

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름은");
		System.out.println(name + "님 안녕히가세요.!!!");
	}
}