package �迭������;

public class �ּҰ�ã�� {

	public static void main(String[] args) {
		int[] num = {90, 80, 20, 60, 70};
		int min = num[0];//0�� ������ ������ �߻��� ����!
		//�ּҰ��� ã�� ���� ���Ƿ� ���� 0�� �ּҰ�
		//�ִ밪�� ã�� ���� ���Ƿ� ���� 0�� �ִ밪(������ �� ����)
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("�ּҰ��� " + min);
	}

}
