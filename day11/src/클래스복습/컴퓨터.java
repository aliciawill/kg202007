package 클래스복습;

public class 컴퓨터 {
	//특징(특성, 속성): 설계(모델링)
	//1)상태: 색, 모양=> "멤버변수"
	//2)동작: 켜다, 끄다, 인터넷하다 => "멤버메소드"
	//메소드 == 함수
	String color; //클래스 전체 영역에서 사용 가능(전역변수)
	String shape; //global(글로벌 변수)
	
	public void 켜다() {
		System.out.println("컴퓨터를 켜다.");
	}
	public void 끄다() {
		System.out.println("컴퓨터를 끄다.");
	}
	public void 인터넷하다() {
		System.out.println("컴퓨터로 인터넷하다.");
	}
	
}




