package 제어문연습;

import java.util.Scanner;

public class 입력값더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 파일, 인터넷, 콘솔
		//이중포문
		for (int i = 0; i < 3; i++) {
			System.out.print("숫자1 입력>> ");
			int n1 = sc.nextInt();// 1
			System.out.print("숫자2 입력>> ");
			int n2 = sc.nextInt();// 3
			int sum = 0;// 누적시키는 변수
			for (int j = n1; j <= n2; j++) {
				sum = sum + j;
			}
			System.out.println(sum);
		}
	}
}
