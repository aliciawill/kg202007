package �÷���;

import java.util.Random;

public class �ζ��ߺ����� {

	public static void main(String[] args) {
		//���� �ߺ��� �ذ� �ȵ� ����
		Random r = new Random(); //�ƹ����ڳ� �������
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(45) + 1;//1~45
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
	}

}
