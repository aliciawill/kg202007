package �÷���;

import java.util.HashSet;
import java.util.Random;

public class �ζ��ߺ�����22 {

	public static void main(String[] args) {
		//�ߺ��� �ذ� �� ����
		Random r = new Random(); //�ƹ����ڳ� �������
		HashSet set = new HashSet();
		while (set.size() < 6) {
			int data = r.nextInt(45) + 1;
			System.out.println("���� ��: " + data);
			set.add(data);//1~45
		}
		System.out.println(set);
	}
}
