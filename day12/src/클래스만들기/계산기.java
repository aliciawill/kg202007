package Ŭ���������;

//public:�ƹ��������� ���� ����
//       ���� ��Ű����, �ٸ� ��Ű���������� ����
//default:���� ��Ű���������� ���� ����
//	      (Ű���带 �ƹ��͵� �Ⱦ�.)
public class ���� {
	// ��� �߽�
	public void add(int x, int y) {
		int result = x + y;
	}

	public void minus(int x, int y) {
		int result = x - y;
	}

	public int mul(int x, int y) {
		int result = x * y; // �ڹٴ� int,int������ ������ int
		// double result2 = x * y;
		return result;
	}

	public void div(int x, int y) {
		int result = x / y;
		System.out.println("���� ���� " + result);
	}
}
