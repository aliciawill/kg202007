package ���Ȯ�ι���;

import java.util.Scanner;

public class �α���ǥ {

	public static void main(String[] args) {
//		�α���ǥ 1)������ 2)���缮 3)BTS 4)����
		// ��ǥ�� ������ �������Ѿ���=> ������Ű�� ���� �ʿ�
		int iu = 0;
		int you = 0;
		int bts = 0;
		Scanner sc = new Scanner(System.in);
		int count = 0; //���� �Ҵ�. ������ ���� �ʱ�ȭ
		while (true) {
			System.out.println("�α���ǥ 1)������ 2)���缮 3)BTS 4)����");
			System.out.print("���� ��ȣ>> ");
			count++;
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("�α���ǥ�� �����մϴ�.");
				System.out.println("��ü ��ǥ Ƚ���� " + count + "ǥ");
				System.out.println("������: " + iu + "ǥ");
				System.out.println("���缮: " + you + "ǥ");
				System.out.println("BTS: " + bts + "ǥ");
				break;// break�� �����ϰ� �ִ� �ݺ����� ������.
			}

			// �ڵ��ڵ�����: ctrl + shift + f
			if (choice == 1) {
				iu++; // iu = iu + 1; ����������
			} else if (choice == 2) {
				you++;
			} else if (choice == 3) {
				bts++;
			} else {
				System.out.println("���� ��ȣ�Դϴ�.");
				System.out.println("�ٽ� �������ּ���.");
			}
		}
	}

}
