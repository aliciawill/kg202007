package �迭������;

import java.util.Arrays;

public class �迭�������� {

	public static void main(String[] args) {
//	1) n1: �迭�� 0, 10, 20, 30, 40, 50���� for������ ��������.
		int[] n1 = new int[6];
		for (int i = 0; i < n1.length; i++) {
			n1[i] = i * 10;
		}
		for (int x : n1) {
			System.out.print(x + " ");
		}
//	2) �� �迭���� 30���� ū ���� ������ ã�ƺ�����.
		int count = 0;
		for (int x : n1) {
			if(x > 30) {
				count++;
			}
		}
		System.out.println();
		System.out.println("30���� ū ���� ������ " + count);
//	3) n2: �� �迭�� �����Ͽ�, ù��°���� 60���� ����
		int[] n2 = n1.clone();//���� ����
		n2[0] = 60;
		for (int x : n2) {
			System.out.print(x + " ");
		}
		System.out.println();
//	4) n1�� n2�� ���� �� ������ ���� ã�Ƽ�, �� ���� ����Ʈ
		for (int i = 0; i < n2.length; i++) {
			if(n1[i] == n2[i]) {
				System.out.print(n1[i]  +" ");
			}
		}
		System.out.println();
		//������ �����ϴ� ���: �ı��Լ�
		Arrays.sort(n2);//������������ ����
		for (int x : n2) {
			System.out.print(x + " ");
		}
		int temp = n2[0];//1. �ӽú���<-ù��°�ڸ�
		n2[0] = n2[5]; //2. ù��°�ڸ�<-�������ڸ�
		n2[5] = temp; //3. �������ڸ�<-�ӽú���
	}
}




