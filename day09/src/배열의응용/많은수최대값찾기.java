package �迭������;

import java.util.Random;

public class �������ִ밪ã�� {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[1000];
		//1. 0���� 1000�̸��� ���� �迭�� �־,��ġ�� �Բ� �� ���
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
			System.out.println(i + ": " + num[i]);
		}
		//2. �ִ밪�� ã�ƺ�����.
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("�ִ밪�� " + max);
		//3. �ִ밪�� �� ���ΰ�?
		//4. �ִ밪�� ��ġ�� ã�ƺ�����.
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i] == max) {
				count++;
				System.out.println("�ִ밪�� ��ġ�� " + i);
			}
		}
		System.out.println("�ִ밪�� ������ " + count + "��");
		//5. ����� ���غ�����.
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		double avg = (double)sum / num.length;
		System.out.println("����� " + avg);
		//6. ��պ��� ���� ������ �� ���ΰ���?
		int count2 = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > avg) {
				count2++;
			}
		}
		System.out.println("��պ��� ���� ������  " + count2);
	}
}




