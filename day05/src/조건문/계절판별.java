package ���ǹ�;

import java.util.Date;

public class �����Ǻ� {

	public static void main(String[] args) {
		Date date = new Date(); // ��¥, �ð�
		int month = date.getMonth() + 1;
		System.out.println("���� " + month + "��");
		// ��Ʈ�� + ����Ʈ + f: �ڵ� �ڵ� ����(format)
		switch (month) { //int, char, String(�Ǽ�x)
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("�ܿ�");
			break;
		}

		switch (month) {
		case 2:
			System.out.println("28�ϱ���");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30�ϱ���");
			break;
		default: //���� ���� ���ǵ��� default!!!
			System.out.println("31�ϱ���");
			break;
		}
		
	}
}
