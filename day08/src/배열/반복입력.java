package �迭;

import java.util.Scanner;

public class �ݺ��Է� {

	public static void main(String[] args) {
		// 5�� �Է�
		// �Է��ϱ����ؼ� Scanner�ʿ�
		Scanner sc = new Scanner(System.in);
		//Ű����� �Է��� �� �ִ� ��ǰ�� �����.
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("������ �Է��Ͻÿ�>> ");
			 num[i] = sc.nextInt();//String->int
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		int sum = num[1] + num[3];
		System.out.println("�ι�°�� �׹�°�� ���� " + sum);
		int sum2 = 0;//��ü ���ؼ� ����
		for (int i = 0; i < num.length; i++) {
			sum2 = sum2 + num[i]; 
		}
		System.out.println("��ü ���� " + sum2);
		System.out.println("��ü ������ " + num.length + "��");
		System.out.println("��ü ����� " + sum2/num.length);
	}

}
