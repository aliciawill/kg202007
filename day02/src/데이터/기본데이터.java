package 데이터;

import javax.swing.JOptionPane;

public class 기본데이터 {

	public static void main(String[] args) {
		//한줄 삭제 ctrl + d
		//저장공간이 언제 RAM에 만들어지는가? 
		//선언! int temp;
		//저장공간 => 변수(variable), 변수는 이름을 가지고 있음.
		//저장공간의 이름 => 변수명
		int temp = 22; //"090201", 정수
		double move = 0.5; //실수
		boolean open = false; //true, 논리
		char color = 'w'; //문자 1글자
		//자동완성 ctrl + space
		System.out.println("오늘은 화요일 입니다.");
		//실행 ctrl + f11
		//한줄 복사 ctrl + alt + 화살표 아래
		//한줄 이동 alt + 화살표방향
		String room = "406";
		
		JOptionPane.showMessageDialog(null, "오늘의 날씨는 " + temp);
		JOptionPane.showMessageDialog(null, "나의 움직임은 " + move);
		JOptionPane.showMessageDialog(null, "문이 열려있나요 " + open);
		JOptionPane.showMessageDialog(null, "벽 색은 " + color);
		JOptionPane.showMessageDialog(null, "우리 호실은 " + room);
		
		//기본형은 아닌데, 기본형처럼 일부 기능을 사용할 수 있게 해놓음.
		//문자들 여러개 붙여쓸 때(문자열, 스트링, 실)
		
		
		
		
		
		
		
		
	}
}
