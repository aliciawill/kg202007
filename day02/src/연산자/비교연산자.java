package ������;

public class �񱳿����� {

	public static void main(String[] args) {
		//�񱳿�����: �Ȱ�����(==), �Ȱ���������(!=)
		//! => not
		
		//�� �����ڸ� ���� ���� �� ����.
		//String�� �⺻�����Ͱ� �ƴϹǷ�, �� ������ ��� �Ұ�.
		//String�� ��ǰ(class)
		//String id = "root";
		
		//�񱳿������� ����� �׻�!!! ����(boolean, true/false)
		int id = 1111; //ȸ�����Խ� ���� id
		int id2 = 2222; //���� �α����Ϸ��� ���� id
		System.out.println(id == id2);
		System.out.println(id != id2);
		if (id == id2) { //true�̸�
			System.out.println("�α��� �����Դϴ�.");
			System.out.println("����Ʈ�� �����̱���.!");
		} else { //false�̸�
			System.out.println("�ٽ� �α������ּ���.");
		}
	}
}
