package 메소드연습;

public class 키보드 {
	String color; //키보드의 색
	int count; //키의 개수
	//멤버변수를 객체생성시 자동으로 입력
	//클래스이름과 동일한 이름을 가진 메소드를 만들어주면
	//new할 때 자동으로 호출됨
	//객체생성시 자동호출되는 메소드: 생성자 메서드
	//생성자 메서드는 클래스이름과 반드시 똑같아야 자동호출됨.
	//생성자 메서드는 멤버변수에 값을 넣고, 끝남. 
	//무조건 void라서 생략함. 쓰면 안됨.
	public 키보드(String c1, int c2) {
		color = c1;
		count = c2;
	}
	
	//멤버변수를 출력 toString()을 재정의
	@Override //생략가능.@annotation(표시,어노테이션) 
	public String toString() {
		return "키보드 [color=" + color + ", count=" + count + "]";
	}
	
	
}
