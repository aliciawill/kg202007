package �÷���;

import java.util.HashSet;
import java.util.Scanner;

public class �Է��ߺ�üũ {

	public static void main(String[] args) {
		//�ߺ��� üũ�ؾ��� ���� set�� ����Ͽ� �����������.
		//�ڵ����� set�� �ߺ�üũ����.
//		�Է°��� �޴µ�, �����ϴ� ���� 5���� ��������.
//		�ߺ��� �Ǹ� �ȵ�.
//		����غ�����.
		Scanner sc = new Scanner(System.in);
		HashSet set = new HashSet();
		while (true) {
			if (set.size() == 5) {
				break;
			}
			System.out.print("�����ϴ� ����>> ");
			String data = sc.next();
			System.out.println("�Էµ�����: " + data);
			set.add(data);
		}
		System.out.println("�����ϴ� ���ϵ�: " + set);
		set.toArray();//set�� �迭�� ���� ����.
	}
}





