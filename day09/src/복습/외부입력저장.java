package ����;

import javax.swing.JOptionPane;

public class �ܺ��Է����� {

	public static void main(String[] args) {
		//�����͸� 3���� �Է��� �������� ��.
		String[] data = new String[3]; //{null, null, null}
		for (int i = 0; i < 3; i++) { //100, 200, 300
			 data[i] = JOptionPane.showInputDialog("�����Է�");
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
