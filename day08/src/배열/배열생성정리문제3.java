package �迭;

import java.util.Scanner;

public class �迭������������3 {

	public static void main(String[] args) {
		//�ݺ� �Է��ؼ� ���� �ٸ� ������ �־�η���, �迭�� ���
		double[] w = new double[3];//0,1,2
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < w.length; i++) {
			System.out.print("���� ������: ");
			w[i] = sc.nextDouble();
		}
		System.out.println("���� ���� ������ �����Դ� " + w[0]);
		System.out.println("���� ���� ������ �����Դ� " + w[2]);
		double sum = 0;
		for (int i = 0; i < w.length; i++) {
			sum = sum + w[i];
		}
		System.out.println("�������� ���� " + sum);
		System.out.println("�������� ����� " + sum/w.length);
	}
}





