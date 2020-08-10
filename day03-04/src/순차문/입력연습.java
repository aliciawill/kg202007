package 순차문;

import javax.swing.JOptionPane;

public class 입력연습 {

	public static void main(String[] args) {
		//순차문: 입력->처리->출력
		//입력: 다이얼로그 창을 띄워보자.
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		
		//처리:
		String result = "당신의 이름은 " + name;
		
		//출력: 
		//System.out.println("당신의 이름은 " + name);
		JOptionPane.showMessageDialog(null, result);
	}

}
