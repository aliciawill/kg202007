package Ŭ���������;

public class ���� {
	
//���ϱ�, ����, ���ϱ�, ������ ����� �ʿ�=> �޼ҵ�
	public void ���ϱ�(int x, int y) {
				//�޼ҵ� �ȿ��� ��������� ������
				//�� �����ȿ����� ��밡���ϴ�.
				//��������(local,���ú���)
				//�Ű�����, parameter(�Ķ����)
		int result = x + y;
		System.out.println("���ϱ� ó���ϴ�.");
		System.out.println("���� ���� " + result);
	}
	public void ����() {
		System.out.println("���� ó���ϴ�.");
	}
	public void ���ϱ�(int x, int y, int z) { 
		System.out.println("���ϱ� ó���ϴ�.");
		int result = x * y * z;
		System.out.println("���� ������� " + result);
	}
	public void ������() {
		System.out.println("������ ó���ϴ�.");
	}
	
}
