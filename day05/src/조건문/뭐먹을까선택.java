package ���ǹ�;

import java.util.Scanner;

public class ��������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �������(¥���,�쵿,���,Ŀ��)>> ");
		String food = sc.next();
		switch(food) {
			case "¥���": 
				System.out.println("�߱������� ����.!!"); break;
			case "�쵿": 
				System.out.println("�Ͻ������� ����.!!"); break;
			case "���": 
				System.out.println("�н������� ����.!!"); break;
			case "Ŀ��": 
				System.out.println("ī��� ����.!!"); break;
			default: 
				System.out.println("�ƹ��͵� �ȸԾ��!!");
		}
	}
}





