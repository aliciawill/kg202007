package �迭������;

public class ������ȭ {

	public static void main(String[] args) {
//		term1 = {88, 99, 77, 66}; //1�б�
//		2�б��� ������ �ι�° ������ 100, �׹�° ������ 55���� �����.
//
//		�� �б��� ������ ������ �ִ� ������� ���ϼ���.
		int[] term1 = {88, 99, 77, 66};
		int[] term2 = term1.clone(); //{88,100,77,55};
		term2[1] = 100;
		term2[3] = 55;
		System.out.println("term1:term2");
		for (int i = 0; i < term2.length; i++) {
			System.out.println("  " + term1[i] + " : " + term2[i]);
		}
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] != term2[i]) {
				count++;
			}
		}
		System.out.println("----------------");
		System.out.println("���� ������� " + count);
	}

}
