package �迭������;

import java.util.Scanner;

public class ���忹�� {

	public static void main(String[] args) {
		//�¼��� ��Ÿ���� 10���� ������ �ʿ�
		int[] seat = new int[10];//{0,0,0,....}
		Scanner sc = new Scanner(System.in);
		int count = 0;//���� �¼� ����
		final int PRICE = 10000; //�������� ������ �ʰ� ������ �� ����.
		//�׻� �Ȱ��� ���� ���� ����: ���(final, �������� ��� �빮�ڷ�!)
		while (true) {
			System.out.println("-------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n-------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.print("\n�¼� ����(���� -1)>> ");
			int choice = sc.nextInt();//�¼� ��ȣ �Է�
			if (choice == -1) {
				//���α׷� ����
				//�ݺ����ȿ� �ִٸ�, �ݺ����� ����
				System.out.println("����ý����� �����մϴ�.");
				System.out.println("�����¼� ������ " + count);
				System.out.println("����ݾ��� " + count* PRICE + "��");
				break;//�ݺ����� ����
			} 
			//����ó��.0�� �Է�
			//����ó���ϱ� ���� �ش� ��ȣ �¼��� �̹� ������ �Ǿ����� üũ��
			//�ʿ� ����. ����ȵ� ��츸 ����ó��
			if (seat[choice] != 1) {
				seat[choice] = 1;
				count++;
				System.out.println(choice + "�� ����Ϸ�");
			}else {
				System.out.println("�̹� ����� �¼��Դϴ�.");
				System.out.println("�ٸ� �¼���ȣ�� �Է����ּ���.");
			}
		}
	}
}





