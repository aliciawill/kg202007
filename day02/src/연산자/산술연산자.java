package ������;

public class ��������� {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		
		int result = x + y;
		System.out.println(result);
		
		//result�� 333�� ���ؼ�, ����غ�����.
		System.out.println(result + 333);
		
		//��Ģ����(+ - * /)
		System.out.println("���� " + (x + y));
		System.out.println("���� " + (x - y));
		System.out.println(x + " * " + y + "�� ���� " + (x * y));
		System.out.println("�������� " + (x / y));
		
		int sum = 344; //��
		int count = 3; //�ο���
		//����� ���ؼ�, ������ �־����.
		int avg = sum / count; 
		double avg2 = (double)sum / count;
		//������ ������ ����� ���� ���� �ִ��� ����� ����!
		//����� �ϳ��� �Ǽ��̸� ������ �Ǽ�!
		System.out.println("�� ���� ����� " + avg2);
		int rest = sum % count; //������ ������
		System.out.println("�� ���� �������� " + rest);
		
		//�������� Ÿ���� ��ȯ�� �� �ִ�.(Ÿ�Ժ�ȯ, ����ȯ, ��������ȯ)
		//��ȯ=>ĳ����, ����ĳ����(casting)
	}
}
