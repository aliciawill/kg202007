package �޼ҵ忬��;

import java.util.Scanner;

import Ŭ���������.����; //.=>���ٿ�����

public class Ŀ�Ǽ� {

	public static void main(String[] args) {
		���� cal = new ����();
		Scanner sc = new Scanner(System.in);
		System.out.print("Ŀ�ǰ�: ");
		int price = sc.nextInt();
		System.out.print("�ο���: ");
		int count = sc.nextInt();
//		Ŀ�ǰ�: 5000
//		�ο���: 10
//		==============
//		���� ���� �ݾ��� 50000��
//		���� ���� �ݾ��� 45000��
//		int price = 3500;
//		int count = 5;
		// ������ �ݾ��� ����ؼ�
		int result = cal.mul(price, count);
		// �޼��带 ���(call,�θ���, ȣ���Ѵ�)�� ��
		// 20000���̻��̸�, 5000���� ����
		System.out.println("���� ���� ���� ���� " +  result);
		if (result >= 20000) {
			System.out.println(result - 5000 + "��");
		} else {
			System.out.println(result + "��");
		}
	}
}
