package ���Ȯ�ι���;

import java.util.Random;

public class �ζ� {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int number = r.nextInt(46);//0~45
			System.out.println(number);
		}
	}

}
