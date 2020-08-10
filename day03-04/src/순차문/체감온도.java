package 순차문;

import javax.swing.JOptionPane;

public class 체감온도 {

	public static void main(String[] args) {
		//입력: 현재 온도를 입력
		//자바는 반드시 변수명앞에 어떤 데이터가 저장될 지 꼭 써주어야한다.!
		String temp = JOptionPane.showInputDialog("현재 온도는");
		
		//숫자가 아니면 연산을 할 수 없다.
		double temp2 = Double.parseDouble(temp);
		//데이터의 변하는 않는 이런 명령어: 비파괴 함수 <-->파괴 함수
		
		//처리: 현재 온도 - 2 처리
		double result = temp2 - 2;
		
		//출력: 조정된 온도를 출력
		System.out.println("한 시간 뒤 온도는 " + result);
	}

}
