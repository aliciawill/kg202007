package �迭;

import java.util.Scanner;

public class �ݺ��Է�2 {

	public static void main(String[] args) {
		//�Է¹޾Ƽ� ���� �������� �����ξ��.
		int[] num = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("�����Է�>> ");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 33) {
				System.out.println(i + "�ε����� ����.");
			}
		}
	}
}


