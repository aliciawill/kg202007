package �ݺ���;

public class �ݺ����� {

	public static void main(String[] args) {
		//2���� 668���� 5�� ����� ������ ����Ʈ
		int count = 0;
		for (int i = 2; i <= 666668; i++) {
			if (i % 5 == 0) { 
				//5�� ����������, �������� ���� ���(5�� ���)	
				count++;
			}
		}
		System.out.println(count);
		int count2 = 0;
		for (int i = 2; i <= 666668; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				count2++;
			}
		}
		System.out.println(count2);

	}

}
