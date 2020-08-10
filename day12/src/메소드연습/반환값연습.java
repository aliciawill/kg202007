package 메소드연습;

import 클래스만들기.계산기;

public class 반환값연습 { //반환값사용.java에서 모든 메서드를 사용해보세요.
	//int, int연산은 무조건 int, public 옆에는 return되는 값들의
	//타입을 써주어야하므로 int로 써주어야 한다.
	public int add(int x, int y) {
		return x + y;
	}
	//하나라도 double이면 무조건 double의 결과
	public double add(double x, int y) {
		return x + y;
	}
	//String간의 +연산자는 결합의 의미
	public String add(String x, String y) {
		return x + y;
	}
	//+연산자를 사용하는 연산중에 하나라도 String이 있으면,
	//+연산자는 결합연산자의 역할을 수행, 최종 결과타입도 String
	public String add(int x, String y) {
		return x + y;
	}
	//x의 타입은 int[]이므로, public 옆에는 int[]을 써준다.
	public int[] add() {
		int[] x = {1,2,3};
		return x;
	}
	//반환해야할 값이 부품일수도 있다.
	public 계산기 add(int x) {
		계산기 cal = new 계산기();
		return cal;
	}
	
	
	
	
	
	
	
}
