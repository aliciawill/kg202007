package Ŭ���������;

import javax.swing.JOptionPane;

public class ��ǻ������ {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("��ǻ�� �̸��� �Է�");
		JOptionPane.showMessageDialog(null, "��ǻ�� �г����� " + name);
		����� m = new �����(); //��ü ����
		m.color = "������";
		m.shape = "�׸�";
		m.������();
		m.������();
		System.out.println("m�� ��������: " + m);
		
		//Ű���� ���� : 43��
		//����� �ϴ� ��� : 5��
		���� cal = new ����();
		cal.div(43, 5);
		
		
		
		
		
		
		
		
		
	}

}
