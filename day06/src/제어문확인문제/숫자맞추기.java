package ���Ȯ�ι���;

import java.util.Random;
import java.util.Scanner;

public class ���ڸ��߱� {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100); //0~99
		Scanner sc = new Scanner(System.in);
		int count = 0;//�� �� �ߴ°�?
		while (true) {
			System.out.print("������ �� �Է�>> ");
			int data = sc.nextInt();
			count++;
			if (data == target) { //���߸�
				System.out.println("�õ�Ƚ�� : " + count + "ȸ" );
				System.out.println("�����մϴ�.�����Դϴ�.");
				break;
			}else { //�����߸�
				System.out.println("������ �ƴմϴ�.�ٽ� �ϼ���.");
				if (data > target) {
					System.out.println("�ʹ� Ů�ϴ�.");
				}else {
					System.out.println("�ʹ� �۽��ϴ�.");
				}
			}
		}
	}

}
