package ������;

import javax.swing.JOptionPane;

public class �Է¿��� {

	public static void main(String[] args) {
		//������: �Է�->ó��->���
		//�Է�: ���̾�α� â�� �������.
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
		
		//ó��:
		String result = "����� �̸��� " + name;
		
		//���: 
		//System.out.println("����� �̸��� " + name);
		JOptionPane.showMessageDialog(null, result);
	}

}
