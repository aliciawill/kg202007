package �迭������;

import java.util.Random;

public class ���͹��� {

	public static void main(String[] args) {
		//����� 999����
		//����Ǭ��� 999����
		int[] ����� = new int[999];
		int[] ����� = new int[999];
		Random r = new Random(17); //�ƹ��ų�, ���Ѱ�
		//���α׷� ������ ������ �ƹ��ų� ������ִ� ���� �޶����� �ʰ�
		//������ ������ ������ֹǷ� �ϰ����� ������ �׽�Ʈ�� �� �ִ�.
		for (int i = 0; i < 999; i++) {
			//1~4������ ������
			�����[i] = r.nextInt(4) + 1;//0���� ����->1���� ����
			//�ּҰ� 1~ �ִ밪4 �߻�
		}
		for (int i = 0; i < �����.length; i++) {
			�����[i] = r.nextInt(4) + 1;
		}
		for (int i = 0; i < 999; i++) {
			System.out.println(i + ": " + �����[i] + ", " + �����[i]);
		}
		int count = 0;//�� �� �¾Ҵ��� ����
		for (int i = 0; i < �����.length; i++) {
			if(�����[i] == �����[i]) {
				count++;
			}
		}
		System.out.println("�� ���� ������ " + count + "��");
		
	}
}







