package 복습;

import java.util.Scanner;

public class 콘솔입력처리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘은 몇도인가요?");
		double temp = sc.nextDouble(); //String("22.5")-->double(22.5)
		System.out.println("아하! " + temp + "도군요.!");
		//30도 이상이면, 너무 더워요!
		//28도 이상이면, 조금 더워요!
		//25도 이상이면, 보통이예요!
		//그것도 아니면, 뭐 괜찮아요. 상관없어요.
		if (temp >= 30) {
			System.out.println("너무 더워요.");
		}else if (temp >= 28) {
			System.out.println("조금 더워요.");
		}else if (temp >= 25) {
			System.out.println("보통이예요.");
		}else {
			System.out.println("상관없어요.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
