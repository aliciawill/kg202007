package 조건문;

import java.util.Date;

public class 계절판별 {

	public static void main(String[] args) {
		Date date = new Date(); // 날짜, 시간
		int month = date.getMonth() + 1;
		System.out.println("현재 " + month + "월");
		// 컨트롤 + 쉬프트 + f: 자동 코드 정리(format)
		switch (month) { //int, char, String(실수x)
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}

		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default: //제일 많은 조건들은 default!!!
			System.out.println("31일까지");
			break;
		}
		
	}
}
