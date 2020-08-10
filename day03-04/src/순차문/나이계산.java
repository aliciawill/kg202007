package 순차문;

import javax.swing.JOptionPane;

public class 나이계산 {

	public static void main(String[] args) {
		//100
		//int age = 100;
		//입력: 외부에서 입력을 받을 때 숫자를 입력하는 경우
		//컴퓨터는 무조건 String(문자열)
		String data = JOptionPane.showInputDialog("나이 입력");
		//스트링으로 계속 쓸지, 정수로 바꾸어서 쓸지는 
		//프로그래머가 결정한다.
		int age = Integer.parseInt(data);//"100"-->100
		          //Double.parseDouble(data);
		System.out.println("내년 나이는 " + (age + 1) + "세");
		
		
		//이 사람이 태어난 연도는? 
		//처리: 2020 - 나이 + 1
		int year = 2020 - age + 1;
		
		//출력
		System.out.println("태어난 연도는 " + year + "년");
		
	}
}





