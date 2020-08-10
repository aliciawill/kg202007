package 순차문;

import java.util.Scanner;

public class 나의정보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름은? ");
		String name = sc.next();
		System.out.print("키는? ");
		//String->double : sc.nextDouble()
		double h = sc.nextDouble();
		System.out.print("몸무게는? ");
		double w = sc.nextDouble();
		System.out.print("나는 저녁을 먹었나요? ");
		boolean food = sc.nextBoolean();
		System.out.print("나의 좌우명은? ");
		sc.nextLine();//true하고 엔터친 것을 입력으로 받아서, 그냥 버림.
		String life = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println("내 이름은 " + name);
		System.out.println("내 내년 키는 " + (h + 10));
		System.out.println("내 내년 몸무게는 " + (w - 10));
		System.out.println("나는 저녁을 " + food);
		System.out.println("나의 좌우명은 " + life);
		System.out.println("---------------------");
		
		if (food) {//true, 조건문, 분기문
			System.out.println("물을 마시자!");
		} else {//false
			System.out.println("삼각김밥을 먹자!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



