package ����;

import java.util.Scanner;

public class ����ó��2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//����, ���ͳ�, �ܼ�
		//Scanner�� ������? String->int�ٷ� �ٲ��ִ� ����� ����.
		System.out.print("���� �ο��� �Է�>> ");
		int count = sc.nextInt();//"23"->23
		//25�� �̻��̸�, �ʰ��ο��̿���.
		//22�� �̻��̸�, �����ο��̿���.
		//20�� �̻��̸�, ���� ���ڶ��.
		//�װ͵� �ƴϸ�, ���� �����̿���.
		if (count >= 25) {
			System.out.println("�ʰ��ο��̿���.");
		}else if (count >= 22) {
			System.out.println("�����ο��̿���.");
		}else if (count >= 20) {
			System.out.println("���� ���ڶ��.");
		}else {
			System.out.println("���� �����̿���.");
		}
		
		
		
		//23�� �ݺ��� �غ���.(�Է��� ��ŭ)
		//i�� ����: �ݺ�Ƚ�� ������
		for (int i = 0; i < count; i++) {
			System.out.println("�ݰ����ϴ�.");
		}
		//i�� ����: ����� ���
		int sum = 0;
		for (int i = 1; i <= 3; i++) { //1, 2, 3
			sum = sum + i; 
			//�ش� i������ ������ ����� sum�� �׿��� �Ѵ�.			
//			1 = 0 + 1;
//			3 = 1 + 2;
//			6 = 3 + 3;
		}
		System.out.println(sum);
	}
}




