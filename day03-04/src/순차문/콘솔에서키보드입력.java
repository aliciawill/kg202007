package 순차문;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class 콘솔에서키보드입력 {

	public static void main(String[] args) {
		//new: 복사!
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은? ");
		String name = sc.next();
		
		System.out.print("당신의 나이는? ");
		//원래 외부에서 입력은 모두 String!!
		int age = sc.nextInt(); //String->int로 변환까지 해줌.
		
		System.out.print("당신의 취미는? ");
		String hobby = sc.next(); //입력한 단어 하나!
		
		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 내년 나이는 " + (age + 1));
		System.out.println("당신의 취미는 " + hobby);
	}
}




