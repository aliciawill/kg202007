package �迭������;

public class ä������ {

	public static void main(String[] args) {
		int[] ���� = {1, 4, 2, 1, 3, 2, 4, 1, 2, 3};
		int[] ���� = {3, 2, 1, 1, 3, 1, 4, 2, 2, 3};
		//�ϳ��� 10����
		//������ ����غ�����.
		int count = 0;
		for (int i = 0; i < ����.length; i++) {
			char ox = 'x';
			if (����[i] == ����[i]) {
				count = count + 10;
				ox = 'o'; //���� ���� o�� �������� ����.
			}
			System.out.println(i + ": " + ����[i] + " <-> " + ����[i] + "=> " + ox);
		}
		System.out.println("���������� " + count + "��");
		
		
	}

}
