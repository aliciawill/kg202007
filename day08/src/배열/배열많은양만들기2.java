package �迭;

import java.util.Random;

public class �迭�����縸���2 {

	public static void main(String[] args) {
//		0~50������ ������ �� 999���� ���� 
//		1. �� �� 0�� ��ġ�� ����Ʈ�غ�����.
//		2. ������ ����Ʈ�غ�����.
		int[] num = new int[99999];//0~998
		Random r = new Random(42);//42�� seed��
		for (int i = 0; i < num.length; i++) {//999�� �ݺ�
			num[i] = r.nextInt(51);//0~50
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ":" + num[i]);
		}
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("0�� ������ " + count);
		
	}

}





