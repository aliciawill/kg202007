package ����;

import java.util.Scanner;

public class �ܺ��Է�����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];//ũ�Ⱑ ����! 
		//�迭�� �ڵ��ʱ�ȭ Ȯ��! {0,0,0,0,0} //0~4
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.print("�����Է�>> ");
			num[i] = sc.nextInt();
		}
		//�Է��ߴ� ���� �迭�� �� ����ֳ� Ȯ��
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}





