package ������;

import javax.swing.JOptionPane;

public class �������������� {

	public static void main(String[] args) {
//		������ �������� String.format("%.2f", pie)
//		---------------------------------------
//		1. BMI����= ������(kg) �� (����(m) �� ����(m))
//		������ �Է�:
//		���� �Է�:
		String data1 = JOptionPane.showInputDialog("������");
		String data2 = JOptionPane.showInputDialog("����");
//
//		bmi�� ���غ�����.
		double w = Double.parseDouble(data1);
		double h = Double.parseDouble(data2);
		double bmi = w / (h * h);
		
		System.out.printf("bmi����� %.3f", bmi);
		String bmi2 = String.format("%.3f", bmi);
		JOptionPane.showMessageDialog(null, "bmi����� " + bmi2);
//
//		2. ����Ʈ ����
//		��������� ���� ����Ʈ: 3000
//		�߰� ����Ʈ: 33.3
//		���� ����Ʈ�� 3033.3
		String data3 = JOptionPane.showInputDialog("��������� ���� ����Ʈ:");
		String data4 = JOptionPane.showInputDialog("�߰� ����Ʈ:");
		int now = Integer.parseInt(data3);
		double add = Double.parseDouble(data4);
		
		double result = now + add;
		
		System.out.printf("���� ����Ʈ�� %.3f" , result);
	}
}




