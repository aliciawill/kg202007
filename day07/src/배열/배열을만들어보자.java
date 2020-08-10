package 배열;

public class 배열을만들어보자 {

	public static void main(String[] args) {
		int[] s = new int[10]; //10=>개수
		//전체 변수는 s, length, int[10] => 12개가 생김.
		s[0] = 100;
		s[9] = 900;
		System.out.println(s.length + "개");
		System.out.println(s[0]);
		System.out.println(s[9]);
		System.out.println(s[1]);
		//배열은 자동초기화까지 시켜줌.
//		int x = 0;//쓰레기값 상태, 초기화가 안된 상태
//		//초기화하고 써야 함.
//		//프로그래머가 초기화해주어야 함.
//		//자동초기화가 안됨.
//		System.out.println(x);
	}

}
