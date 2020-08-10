package 클래스만들기;

//public:아무곳에서나 접근 가능
//       같은 패키지내, 다른 패키지내에서도 가능
//default:같은 패키지내에서만 접근 가능
//	      (키워드를 아무것도 안씀.)
public class 계산기 {
	// 기능 중심
	public void add(int x, int y) {
		int result = x + y;
	}

	public void minus(int x, int y) {
		int result = x - y;
	}

	public int mul(int x, int y) {
		int result = x * y; // 자바는 int,int연산은 무조건 int
		// double result2 = x * y;
		return result;
	}

	public void div(int x, int y) {
		int result = x / y;
		System.out.println("나눈 값은 " + result);
	}
}
