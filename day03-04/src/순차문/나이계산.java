package ������;

import javax.swing.JOptionPane;

public class ���̰�� {

	public static void main(String[] args) {
		//100
		//int age = 100;
		//�Է�: �ܺο��� �Է��� ���� �� ���ڸ� �Է��ϴ� ���
		//��ǻ�ʹ� ������ String(���ڿ�)
		String data = JOptionPane.showInputDialog("���� �Է�");
		//��Ʈ������ ��� ����, ������ �ٲپ ������ 
		//���α׷��Ӱ� �����Ѵ�.
		int age = Integer.parseInt(data);//"100"-->100
		          //Double.parseDouble(data);
		System.out.println("���� ���̴� " + (age + 1) + "��");
		
		
		//�� ����� �¾ ������? 
		//ó��: 2020 - ���� + 1
		int year = 2020 - age + 1;
		
		//���
		System.out.println("�¾ ������ " + year + "��");
		
	}
}





