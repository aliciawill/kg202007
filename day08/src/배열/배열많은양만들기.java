package �迭;

import java.util.Random;

public class �迭�����縸��� {

	public static void main(String[] args) {
		//num���� 1000���� "�ּ�"�� �� ����.������ ����
		int[] num = new int[1000];//0~999
		//System.out.println(num);
		Random	r = new Random(42); //�ƹ��ų� ����� �ִ� class(��ǰ)
		//42�� �ƹ� ���ڳ� �־��� ����.(���Ѱ�, seed��)
		//Random�ȿ� �ƹ� ���ڳ� �־�θ�, �׽�Ʈ�ϴ� ����
		//������ �������� ������ش�.
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(101); //0~100
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		//100���� ã�ƶ�.
		//�迭 ��ü�� �� ó������ ������ ã�ƾ� �Ѵ�.
		for (int i = 0; i < num.length; i++) {
			//�迭�� �� ��ġ�� �� �ִ� ���� 100������ üũ
			if (num[i] == 100) {
				//i���� ����Ʈ!
				System.out.println(i);
			}
		}
		
	}

}






