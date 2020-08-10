package 조건문;

import java.util.Scanner;

public class 뭐먹을까선택 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("뭐 먹을까요(짜장면,우동,라면,커피)>> ");
		String food = sc.next();
		switch(food) {
			case "짜장면": 
				System.out.println("중국집으로 가요.!!"); break;
			case "우동": 
				System.out.println("일식집으로 가요.!!"); break;
			case "라면": 
				System.out.println("분식집으로 가요.!!"); break;
			case "커피": 
				System.out.println("카페로 가요.!!"); break;
			default: 
				System.out.println("아무것도 안먹어요!!");
		}
	}
}





