package 제어문확인문제;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
//		인기투표 1)아이유 2)유재석 3)BTS 4)종료
		// 투표할 때마다 누적시켜야함=> 누적시키는 변수 필요
		int iu = 0;
		int you = 0;
		int bts = 0;
		Scanner sc = new Scanner(System.in);
		int count = 0; //변수 할당. 쓰레기 값을 초기화
		while (true) {
			System.out.println("인기투표 1)아이유 2)유재석 3)BTS 4)종료");
			System.out.print("선택 번호>> ");
			count++;
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("인기투표를 종료합니다.");
				System.out.println("전체 투표 횟수는 " + count + "표");
				System.out.println("아이유: " + iu + "표");
				System.out.println("유재석: " + you + "표");
				System.out.println("BTS: " + bts + "표");
				break;// break를 포함하고 있는 반복문을 끝내줌.
			}

			// 코드자동정리: ctrl + shift + f
			if (choice == 1) {
				iu++; // iu = iu + 1; 증감연산자
			} else if (choice == 2) {
				you++;
			} else if (choice == 3) {
				bts++;
			} else {
				System.out.println("없는 번호입니다.");
				System.out.println("다시 선택해주세요.");
			}
		}
	}

}
