package �޼ҵ忬��;

import Ŭ���������.����;

public class ��ȯ������ { //��ȯ�����.java���� ��� �޼��带 ����غ�����.
	//int, int������ ������ int, public ������ return�Ǵ� ������
	//Ÿ���� ���־���ϹǷ� int�� ���־�� �Ѵ�.
	public int add(int x, int y) {
		return x + y;
	}
	//�ϳ��� double�̸� ������ double�� ���
	public double add(double x, int y) {
		return x + y;
	}
	//String���� +�����ڴ� ������ �ǹ�
	public String add(String x, String y) {
		return x + y;
	}
	//+�����ڸ� ����ϴ� �����߿� �ϳ��� String�� ������,
	//+�����ڴ� ���տ������� ������ ����, ���� ���Ÿ�Ե� String
	public String add(int x, String y) {
		return x + y;
	}
	//x�� Ÿ���� int[]�̹Ƿ�, public ������ int[]�� ���ش�.
	public int[] add() {
		int[] x = {1,2,3};
		return x;
	}
	//��ȯ�ؾ��� ���� ��ǰ�ϼ��� �ִ�.
	public ���� add(int x) {
		���� cal = new ����();
		return cal;
	}
	
	
	
	
	
	
	
}
