package ���ǹ�;

import java.util.Scanner;

public class ��ȣ {

	public static void main(String[] args) {
		// ��ȣ�� ��ÿ�>> pass(equals())
		// pass:��������, hi:�� �ȳ��ϼ���.
		// bye: �ȳ���������, �װ͵� �ƴϸ�:��������.
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ�� ��ÿ�>> ");
		String data = sc.next(); //pass
		//�⺻���� �ƴϸ�, Ŭ�������� �����ϴ� ��ɾ ����Ѵ�.
		if (data.equals("pass")) { 
			System.out.println("��������");
		}else if (data.equals("hi")) {
			System.out.println("�� �ȳ��ϼ���.");
		}else if (data.equals("bye")) {
			System.out.println("�ȳ���������");
		}else {
			System.out.println("��������.");
		}
		
		// ����� ��ǻ�� ������>> 88
		// 90�� �̻��̸� A�����Դϴ�.
		// 80�� �̻��̸� B�����Դϴ�.
		// 70�� �̻��̸� C�����Դϴ�.
		// 60�� �̻��̸� D�����Դϴ�.
		// �װ͵� �ƴϸ� F�����Դϴ�.
		System.out.print("����� ��ǻ�� ������>> ");
		int data2 = sc.nextInt();
		if (data2 >= 90) {
			System.out.println("A����");
		}else if (data2 >= 80) {
			System.out.println("B����");
		}else if (data2 >= 70) {
			System.out.println("C����");
		}else if (data2 >= 60) {
			System.out.println("D����");
		}else {
			System.out.println("F����");
		}
		
		
		
		
		
		
	}

}
