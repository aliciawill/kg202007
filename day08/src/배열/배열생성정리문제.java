package �迭;

public class �迭������������ {

	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		int sum = num[0] + num[1];
		System.out.println("���� " + sum);
		int sum2 = 0;//������Ű�� ����
		for (int i = 0; i < num.length; i++) {
			sum2 = sum2 + num[i];
		}
		System.out.println("��ü ���� " + sum2);
		
		//for-each�� ��ü�� ���غ�����.
		int sum3 = 0;
		for (int x : num) { //{10, 20, 30, 40, 50}
			sum3 = sum3 + x;
		}
		System.out.println("��ü ���� " + sum3);
	}
}



