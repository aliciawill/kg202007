package 제어문확인문제;

import java.util.Random;

public class 랜덤값더하기 {

	public static void main(String[] args) {
		//0~100중에서 아무거나 10개를 더해보세요.
		//아무거나 => random
		Random r = new Random();
		int x = 0;
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(100);//0~99
			x = x + move;
			System.out.println("이동한 X축 위치는>> " + x);
		}
	}
}




