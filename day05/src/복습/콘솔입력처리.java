package ����;

import java.util.Scanner;

public class �ܼ��Է�ó�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ��ΰ���?");
		double temp = sc.nextDouble(); //String("22.5")-->double(22.5)
		System.out.println("����! " + temp + "������.!");
		//30�� �̻��̸�, �ʹ� ������!
		//28�� �̻��̸�, ���� ������!
		//25�� �̻��̸�, �����̿���!
		//�װ͵� �ƴϸ�, �� �����ƿ�. ��������.
		if (temp >= 30) {
			System.out.println("�ʹ� ������.");
		}else if (temp >= 28) {
			System.out.println("���� ������.");
		}else if (temp >= 25) {
			System.out.println("�����̿���.");
		}else {
			System.out.println("��������.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
