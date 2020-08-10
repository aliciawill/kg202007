package 배열;

public class 숫자배열 {

	public static void main(String[] args) {
//	1)int배열 5개를 만들어, 10, 20, 30, 40, 50을 넣어, 프린트
		int[] s = new int[5];
		s[0] = 10;
		s[1] = 20;
		s[2] = 30;
		s[3] = 40;
		s[4] = 50;
		
//		System.out.println(s[0]);
//		System.out.println(s[1]);
//		System.out.println(s[2]);
//		System.out.println(s[3]);
//		System.out.println(s[4]);
		//i는 배열의 위치 인덱스
		for (int i = 0; i < s.length; i++) { 
			System.out.println(s[i]);
		}
//	2)위 배열의 개수는? 프린트
		System.out.println(s.length + "개");
//	3)첫번째 자리에 100을 넣어보고, 프린트
		s[0] = 100;
		System.out.println(s[0]);
//	4)3번째 자리에 200을 넣어보고, 프린트
		s[2] = 200;
		System.out.println(s[2]);
//	5)첫번째와 3번째를 더해서 프린트
		System.out.println(s[0] + s[2]);
//	=> 배열과 반복문(for)은 짝꿍이다.!!
	}

}
