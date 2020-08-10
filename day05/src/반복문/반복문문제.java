package 반복문;

public class 반복문문제 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print("커피");
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.print("커피");
			System.out.print("*");
			System.out.println("우유");
		}
		
		//start값 0으로 셋팅!
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + ": 짱");
		}
	}
}
