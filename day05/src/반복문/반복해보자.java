package �ݺ���;

public class �ݺ��غ��� {
	//% ������ �����ִ� ������.
	public static void main(String[] args) {
		//3�� ����� ����Ʈ!
//		for (int i = 1; i <= 1000; i++) {
//			if ( i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
		int count = 0;
		//������Ű�� ������ �ݺ����ȿ� ���� ������,
		//�ʱ�ȭ�� �ǹ����⶧���� ������ ���ش�.!
		for (int i = 1; i <= 1000; i++) {
			if ( i % 3 == 0) {
				continue; //�ǳʶڴ�.skip
			}
			System.out.println(i);
			count++;
		}
		System.out.println(count);
	}
}



