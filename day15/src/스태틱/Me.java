package ����ƽ;

import java.awt.Color;

import javax.swing.JButton;

public class Me {

	public static void main(String[] args) {
//		JButton b = new JButton();
//		b.setBackground(Color.red);//red�� static����
		//Ŭ������ �ν��Ͻ�(��ü)
		//new�� �̿��ؼ� ��ü�� ����
		//�����ڴ� ��ü������ Ŭ�����̸��� ������ �޼���
		//�����ڴ� ��ü������ �ڵ� ȣ��
		//��ü������ ��ü���� ���ε��� ����Ǵ� �������
		//�ν��Ͻ� ����
		Day day1 = new Day("�ڹٰ���", 10, "����");
		System.out.println(Day.count + "����");
		Day day2 = new Day("����", 15, "������");
		System.out.println(Day.count + "����");
		Day day3 = new Day("�", 11, "��Ʈ�Ͻ�");
		System.out.println(Day.count + "����");
		System.out.println("�ѽð�: " + Day.total + "�ð�");
		System.out.println("��սð�: " + Day.total/Day.count + "�ð�");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
	}

}
