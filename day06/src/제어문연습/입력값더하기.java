package �������;

import java.util.Scanner;

public class �Է°����ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// ����, ���ͳ�, �ܼ�
		//��������
		for (int i = 0; i < 3; i++) {
			System.out.print("����1 �Է�>> ");
			int n1 = sc.nextInt();// 1
			System.out.print("����2 �Է�>> ");
			int n2 = sc.nextInt();// 3
			int sum = 0;// ������Ű�� ����
			for (int j = n1; j <= n2; j++) {
				sum = sum + j;
			}
			System.out.println(sum);
		}
	}
}
