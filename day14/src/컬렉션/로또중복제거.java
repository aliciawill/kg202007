package 컬렉션;

import java.util.Random;

public class 로또중복제거 {

	public static void main(String[] args) {
		//아직 중복이 해결 안된 상태
		Random r = new Random(); //아무숫자나 만들어줌
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(45) + 1;//1~45
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
	}

}
