package ���ǹ�;

import java.util.Date;

public class �������ð� {

	public static void main(String[] args) {
		//21�� ���̸�, ���� �� �ð��� ���� ���ұ���. time < 21
		//�ƴϸ�, ���� �� �ð��� ���� ���ұ���.
		Date date = new Date(); //f2, ��¥,�ð��� �����ִ� class
		int hour = date.getHours();//21
		if (hour < 21) {
			System.out.println("���� �־���.");
		} else {
			System.out.println("���� ������.");
		}
		
		int min = date.getMinutes(); //��
		int sec = date.getSeconds(); //��
		System.out.println(hour + "�� " + min + "�� " + sec + "��");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println(year + "�� " + month + "�� " + today + "��");
		
		//�ð��� 11�� ���̸�, �¸��
		//�ð��� 16�� ���̸�, �¾����ʹ�
		//�ð��� 20�� ���̸�, ���̺��
		//�ƹ��͵� �ƴϸ�, �³���
		if(hour < 11) {
			System.out.println("�¸��");
		}else if(hour < 16) {
			System.out.println("�¾����ʹ�");
		}else if(hour < 20) {
			System.out.println("���̺��");
		}else {
			System.out.println("�³���");
		}
		//�ش� ������ �����Ǹ�, ������ ���̻� üũ���� �ʴ´�.
		if (month >= 3  && month <= 5) {
			System.out.println("��!!!");
		}else if (month == 6 || month == 7 || month == 8) {
			System.out.println("����!!!");
		}else if (month == 9 || month == 10 || month == 11) {
			System.out.println("����!!!");
		}else {
			System.out.println("�ܿ�!!!");
		}
		
		//����(0:�Ͽ���~)
		int day = date.getDay();
		System.out.println(day);
	}
}




