package ����;

import javax.swing.JOptionPane;

public class ����ó�� {

	public static void main(String[] args) {
		//�Է�->ó��->���
		//�Է�: ���̾�α�, Scanner
		//ó��: ���
		//���: ���̾�α�, sysout
		
		String hour = JOptionPane.showInputDialog("���� ���?"); //19
		int hour2 = Integer.parseInt(hour);//"19"->19
		//�� �����ڴ� �⺻ �����͸� ����!
		if (hour2 > 18) {
			JOptionPane.showMessageDialog(null, "��� �ð��� ��������.");
		} else {
			JOptionPane.showMessageDialog(null, "��� �ð��� ���� �ȵǾ�����.");
		}
	}

}
