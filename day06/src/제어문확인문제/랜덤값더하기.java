package ���Ȯ�ι���;

import java.util.Random;

public class ���������ϱ� {

	public static void main(String[] args) {
		//0~100�߿��� �ƹ��ų� 10���� ���غ�����.
		//�ƹ��ų� => random
		Random r = new Random();
		int x = 0;
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(100);//0~99
			x = x + move;
			System.out.println("�̵��� X�� ��ġ��>> " + x);
		}
	}
}




