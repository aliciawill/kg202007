package 조건문;

import java.util.Date;

public class 집에갈시간 {

	public static void main(String[] args) {
		//21시 전이면, 집에 갈 시간이 많이 남았군요. time < 21
		//아니면, 집에 갈 시간이 조금 남았군요.
		Date date = new Date(); //f2, 날짜,시간을 구해주는 class
		int hour = date.getHours();//21
		if (hour < 21) {
			System.out.println("아직 멀었음.");
		} else {
			System.out.println("조금 남았음.");
		}
		
		int min = date.getMinutes(); //분
		int sec = date.getSeconds(); //초
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println(year + "년 " + month + "월 " + today + "일");
		
		//시각이 11시 전이면, 굿모닝
		//시각이 16시 전이면, 굿애프터눈
		//시각이 20시 전이면, 굿이브닝
		//아무것도 아니면, 굿나잇
		if(hour < 11) {
			System.out.println("굿모닝");
		}else if(hour < 16) {
			System.out.println("굿애프터눈");
		}else if(hour < 20) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
		//해당 조건이 충족되면, 조건을 더이상 체크하지 않는다.
		if (month >= 3  && month <= 5) {
			System.out.println("봄!!!");
		}else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름!!!");
		}else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을!!!");
		}else {
			System.out.println("겨울!!!");
		}
		
		//요일(0:일요일~)
		int day = date.getDay();
		System.out.println(day);
	}
}




