package 메소드연습;

import java.util.Scanner;

import 클래스만들기.계산기; //.=>접근연산자

public class 커피숍 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		Scanner sc = new Scanner(System.in);
		System.out.print("커피값: ");
		int price = sc.nextInt();
		System.out.print("인원수: ");
		int count = sc.nextInt();
//		커피값: 5000
//		인원수: 10
//		==============
//		원래 결제 금액은 50000원
//		최종 결제 금액은 45000원
//		int price = 3500;
//		int count = 5;
		// 결제할 금액을 계산해서
		int result = cal.mul(price, count);
		// 메서드를 사용(call,부른다, 호출한다)한 곳
		// 20000원이상이면, 5000원을 할인
		System.out.println("곱한 결제 원래 값은 " +  result);
		if (result >= 20000) {
			System.out.println(result - 5000 + "원");
		} else {
			System.out.println(result + "원");
		}
	}
}
