package 클래스만들기;

//class=틀역할, 값을 넣지 않는다.
public class Tv {
	//상태: 멤버변수, 전역변수
	int ch;
	int vol;
	boolean onOff;
	
	//객체생성: 클래스인 틀을 가지고, 실제로 물건(객체)을 만들어내는 것.
	//객체생성시 클래스이름과 동일한 메소드가 있으면 자동호출
	//생성자 메서드, 생성자, constructor
	public Tv(int ch, int vol, boolean onOff) {
		//갈색으로 표시된 Tv생성자메소드 안에서 만들어진 변수: 지역변수
		//this=>해당 클래스를 의미
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	//동작: 기능을 정의, 멤버메소드(==함수)
	public void tvOn() {
		System.out.println("TV를 켜다.");
	}
	public void tvOff() {
		System.out.println("TV를 끄다.");
	}
	
	//멤버변수 저장된 값 확인용 메소드를 재정의
	@Override
	public String toString() {
		return "가르키는 값들 " + ch + " " + vol + " " + onOff;
	}
}
