package 제어문확인문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100); //0~99
		Scanner sc = new Scanner(System.in);
		int count = 0;//몇 번 했는가?
		while (true) {
			System.out.print("생각한 값 입력>> ");
			int data = sc.nextInt();
			count++;
			if (data == target) { //맞추면
				System.out.println("시도횟수 : " + count + "회" );
				System.out.println("축하합니다.정답입니다.");
				break;
			}else { //못맞추면
				System.out.println("정답이 아닙니다.다시 하세요.");
				if (data > target) {
					System.out.println("너무 큽니다.");
				}else {
					System.out.println("너무 작습니다.");
				}
			}
		}
	}

}
