package ������;

import javax.swing.JOptionPane;

public class ü���µ� {

	public static void main(String[] args) {
		//�Է�: ���� �µ��� �Է�
		//�ڹٴ� �ݵ�� ������տ� � �����Ͱ� ����� �� �� ���־���Ѵ�.!
		String temp = JOptionPane.showInputDialog("���� �µ���");
		
		//���ڰ� �ƴϸ� ������ �� �� ����.
		double temp2 = Double.parseDouble(temp);
		//�������� ���ϴ� �ʴ� �̷� ��ɾ�: ���ı� �Լ� <-->�ı� �Լ�
		
		//ó��: ���� �µ� - 2 ó��
		double result = temp2 - 2;
		
		//���: ������ �µ��� ���
		System.out.println("�� �ð� �� �µ��� " + result);
	}

}
