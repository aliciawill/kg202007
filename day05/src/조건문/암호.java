package 조건문;

import java.util.Scanner;

public class 암호 {

	public static void main(String[] args) {
		// 암호를 대시오>> pass(equals())
		// pass:들어오세요, hi:네 안녕하세요.
		// bye: 안녕히가세요, 그것도 아니면:나가세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("암호를 대시오>> ");
		String data = sc.next(); //pass
		//기본형이 아니면, 클래스에서 제공하는 명령어를 써야한다.
		if (data.equals("pass")) { 
			System.out.println("들어오세요");
		}else if (data.equals("hi")) {
			System.out.println("네 안녕하세요.");
		}else if (data.equals("bye")) {
			System.out.println("안녕히가세요");
		}else {
			System.out.println("나가세요.");
		}
		
		// 당신의 컴퓨터 점수는>> 88
		// 90점 이상이면 A학점입니다.
		// 80점 이상이면 B학점입니다.
		// 70점 이상이면 C학점입니다.
		// 60점 이상이면 D학점입니다.
		// 그것도 아니면 F학점입니다.
		System.out.print("당신의 컴퓨터 점수는>> ");
		int data2 = sc.nextInt();
		if (data2 >= 90) {
			System.out.println("A학점");
		}else if (data2 >= 80) {
			System.out.println("B학점");
		}else if (data2 >= 70) {
			System.out.println("C학점");
		}else if (data2 >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		
		
		
		
		
	}

}
