package 클래스만들기;

public class 모니터 {
//	모니터: 	상태-색, 네모=> 멤버변수(전역변수의 성격)
	String color;
	String shape;
//	동작-켜지다, 꺼지다=> 멤버메서드
	public void 켜지다() {
		System.out.println("모니터를 on!");
	}
	public void 꺼지다() {
		System.out.println("모니터를 off!");
	}
	
	@Override //오버라이드(재정의)
	//기본형변수면 값, 참조형변수면 주소.
	public String toString() {
		return "색:" + color + ", 모양:" + shape;
	}
	
	//모니터로 만들어진 객체를 프린트하면 주소가 프린트된다.
	//객체를 프린트할 때 그 주소가 가르키는 값들을 프린트
	
}
