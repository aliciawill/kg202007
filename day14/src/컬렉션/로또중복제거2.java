package �÷���;

import java.util.HashSet;
import java.util.Random;

public class �ζ��ߺ�����2 {

	public static void main(String[] args) {
		//�ߺ��� �ذ� �� ����
		Random r = new Random(); //�ƹ����ڳ� �������
		HashSet set = new HashSet();
		while (true) {
			System.out.println("set�� ����: " + set.size());
			if(set.size() == 6) {
				break;
			}
			int data = r.nextInt(45) + 1;
			System.out.println("������: " + data);
			set.add(data);
		}
		System.out.println(set);
	}

}
