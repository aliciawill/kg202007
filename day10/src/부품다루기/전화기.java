package 부품다루기;

public class 전화기 {
//	전화기 부품(class)
//	----------------
//	- 전화기가 가지는 특징을 가지고 부품을 만들어야 한다.
//	- 특징: 
//		1) 상태 : 모양, 버튼 => 변수로 만든다.(멤버변수)
	String shape;
	boolean button;
//		2) 기능 : 전화하다, 문자하다=> 멤버메서드(==함수)
	public void 전화하다() {
		System.out.println("전화하다.");
	}
	public void 문자하다() {
		System.out.println("폴더를 열고, ");
		System.out.println("문자하다.");
	}
}
