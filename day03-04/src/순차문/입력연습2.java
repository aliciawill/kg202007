package 순차문;

import javax.swing.JOptionPane;

public class 입력연습2 {

	public static void main(String[] args) {
//	1)입력				2)처리			3)출력
//	당신의 취미는? 운동		일요일에 운동을 하시는군요
//	언제하시나요? 일요일

		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제하시나요?");
		
		String result = when + "에 " + hobby + "을 하시는군요";
		
		System.out.println(result);
		
		
	}

}
