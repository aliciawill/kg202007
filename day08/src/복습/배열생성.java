package ����;

public class �迭���� {

	public static void main(String[] args) {
		//���� ���� �����͸� �ٷ� ��=>�迭�� ���
		//�迭�� ����� ���� 
		//ó���� ���� �˰� �ִ� ���, �迭 ������ �ٷ� ����.
		//ó���� ���� �𸣰� �ִ� ���, �迭 �����ϰ� ���� ���߿� ����.
		int[] jumsu1 = {100, 90, 88, 77}; //1�б� ����
		System.out.print("1�б�: ");
		for (int i = 0; i < jumsu1.length; i++) {
			System.out.print(jumsu1[i] + " ");
		}
		System.out.println();
		for (int x : jumsu1) {
			System.out.println(x);
		}
		int[] jumsu2 = new int[4]; //2�б� ����
		jumsu2[0] = 99;//��������
		jumsu2[1] = 88;//����
		jumsu2[2] = 77;//��ǻ��
		jumsu2[3] = 100;//ü��
		System.out.print("2�б�: ");
		//i�� ������ ��ġ��(index)
		for (int i = 0; i < jumsu2.length; i++) {
			System.out.print(jumsu2[i] + " ");
		}
		//for-each: ó������ �ϳ��� �ݺ���.
		for (int x : jumsu2) { //i�� ������ int�� �������
			//10, 20, 30, 40(x�� �ϳ��� �������� ���� �ӽú���)
			System.out.println(x);
		}
		
	}

}
