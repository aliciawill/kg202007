package ������;

import javax.swing.JOptionPane;

public class �Է¿���2 {

	public static void main(String[] args) {
//	1)�Է�				2)ó��			3)���
//	����� ��̴�? �		�Ͽ��Ͽ� ��� �Ͻô±���
//	�����Ͻó���? �Ͽ���

		String hobby = JOptionPane.showInputDialog("����� ��̴�?");
		String when = JOptionPane.showInputDialog("�����Ͻó���?");
		
		String result = when + "�� " + hobby + "�� �Ͻô±���";
		
		System.out.println(result);
		
		
	}

}
