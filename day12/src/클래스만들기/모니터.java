package Ŭ���������;

public class ����� {
//	�����: 	����-��, �׸�=> �������(���������� ����)
	String color;
	String shape;
//	����-������, ������=> ����޼���
	public void ������() {
		System.out.println("����͸� on!");
	}
	public void ������() {
		System.out.println("����͸� off!");
	}
	
	@Override //�������̵�(������)
	//�⺻�������� ��, ������������ �ּ�.
	public String toString() {
		return "��:" + color + ", ���:" + shape;
	}
	
	//����ͷ� ������� ��ü�� ����Ʈ�ϸ� �ּҰ� ����Ʈ�ȴ�.
	//��ü�� ����Ʈ�� �� �� �ּҰ� ����Ű�� ������ ����Ʈ
	
}
