package ������;

import javax.swing.JOptionPane;

public class ���̹��α��� {

	public static void main(String[] args) {
		//ctrl + alt + ȭ��ǥ�Ʒ�(���� ����)
		//�Է�
		String id = JOptionPane.showInputDialog("���̵� �Է�"); 
		String pw = JOptionPane.showInputDialog("�н����� �Է�");
		
		//ó��
		//���Խ� ����
		String id2 = "root";
		String pw2 = "pass"; 
		//�ڵ� �ּ�: ctrl + /
		//������ �ڵ� �ּ�: ctrl + shift + / 
		System.out.println(id.equals(id2));
		System.out.println(pw.equals(pw2));
		
		//������ ������ �ִ� ���, �������� �Ǵ��� ��,
		//���ǵ��� ��� �Ǿ�� �ϴ°�? �� ������
		//������ ��� �¾ƾ� �ϴ� ���, and����(&&)
		//������ �ϳ��� �¾Ƶ� �Ǵ� ���, or����(||)

		//ó�� �κ�..������ ������´� �����Ⱚ����
		//�����Ŀ� �����ϰ� ����ְų�, ������ �־��־�� �Ѵ�.
		//�ʱ�ȭ
		//������ �ʱ�ȭ�� �� ����� �� �ִ�.
		String result = null;//�����Ⱚ �� �ִ� ����
		//�´� ���, ���� ���� ���(���ǹ�)
		if (id.equals(id2) && pw.equals(pw2)) {
			result = "�α��� ok";
		} else {
			result = "�α��� not";
		}
		
		//������
		System.out.println(result); 
		//�����Ⱚ ����ִ� ���´� ����, ó�� �Ұ�
		
	}

}
