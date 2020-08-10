package 클래스만들기;

import javax.swing.JOptionPane;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("컴퓨터 이름을 입력");
		JOptionPane.showMessageDialog(null, "컴퓨터 닉네임은 " + name);
		모니터 m = new 모니터(); //객체 생성
		m.color = "검정색";
		m.shape = "네모";
		m.켜지다();
		m.꺼지다();
		System.out.println("m의 저장정보: " + m);
		
		//키보드 개수 : 43개
		//사려고 하는 사람 : 5명
		계산기 cal = new 계산기();
		cal.div(43, 5);
		
		
		
		
		
		
		
		
		
	}

}
