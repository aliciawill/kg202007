package 스태틱;

import java.awt.Color;

import javax.swing.JButton;

public class Me {

	public static void main(String[] args) {
//		JButton b = new JButton();
//		b.setBackground(Color.red);//red가 static변수
		//클래스의 인스턴스(객체)
		//new를 이용해서 객체를 생성
		//생성자는 객체생성시 클래스이름과 동일한 메서드
		//생성자는 객체생성시 자동 호출
		//객체생성시 객체마다 따로따로 복사되는 멤버변수
		//인스턴스 변수
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count + "일차");
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count + "일차");
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count + "일차");
		System.out.println("총시간: " + Day.total + "시간");
		System.out.println("평균시간: " + Day.total/Day.count + "시간");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
	}

}
