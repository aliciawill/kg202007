package 복습;

import java.util.Scanner;

public class 순차처리2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//파일, 인터넷, 콘솔
		//Scanner의 장점은? String->int바로 바꿔주는 기능이 있음.
		System.out.print("현재 인원을 입력>> ");
		int count = sc.nextInt();//"23"->23
		//25명 이상이면, 초과인원이예요.
		//22명 이상이면, 적정인원이예요.
		//20명 이상이면, 조금 모자라요.
		//그것도 아니면, 아주 조금이예요.
		if (count >= 25) {
			System.out.println("초과인원이예요.");
		}else if (count >= 22) {
			System.out.println("적정인원이예요.");
		}else if (count >= 20) {
			System.out.println("조금 모자라요.");
		}else {
			System.out.println("아주 조금이예요.");
		}
		
		
		
		//23번 반복을 해보자.(입력한 만큼)
		//i의 역할: 반복횟수 지정용
		for (int i = 0; i < count; i++) {
			System.out.println("반갑습니다.");
		}
		//i의 역할: 계산의 대상
		int sum = 0;
		for (int i = 1; i <= 3; i++) { //1, 2, 3
			sum = sum + i; 
			//해당 i까지의 덧셈의 결과가 sum에 쌓여야 한다.			
//			1 = 0 + 1;
//			3 = 1 + 2;
//			6 = 3 + 3;
		}
		System.out.println(sum);
	}
}




