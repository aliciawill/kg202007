package ������;

import javax.swing.JOptionPane;

public class �簢������ {

	public static void main(String[] args) {
//		�Է�:
//			����: 22.2 
//			����: 33.3
		String data1 = JOptionPane.showInputDialog("����");
		String data2 = JOptionPane.showInputDialog("����");
		//System.out.println(data1 * data2);
		//String�� ��Ģ���� �Ұ�
//
//		ó��: 
//			���� x ����(Double.parseDouble())
		double x = Double.parseDouble(data1); //22.0
		double y = Double.parseDouble(data2); //33.0
		double result = x * y;
//
//		���:
//			���̾�α׷� ���������.
		JOptionPane.showMessageDialog(null, "�簢�� ������ " + result);
	}

}
