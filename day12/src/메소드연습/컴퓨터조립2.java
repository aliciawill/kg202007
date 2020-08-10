package 메소드연습;

public class 컴퓨터조립2 {

	public static void main(String[] args) {
		//생성자를 이용해서 멤버변수값을 자동으로 넣어줌.
		//멤버변수 초기화
		키보드 key = new 키보드("빨강", 30);
		//멤버변수 출력=> toString()이용
		System.out.println(key);
	}

}
