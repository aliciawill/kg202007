package �迭������;

public class �������迭 {

	public static void main(String[] args) {
		// 2���� �迭: 1�����迭�� ������ ����� ��.
		int[] n1 = { 1, 2, 3 };//3
		int[] n2 = { 4, 5, 6, 7 };//4
		int[][] n3 = new int[2][];
		n3[0] = n1; 
		n3[1] = n2;
		//2���� �迭�� ���̴� ��(������, row)�� ����
		System.out.println(n3.length); //���� ����
		System.out.println(n3[0].length); //���� ����
		System.out.println(n3[1].length); //���� ����
		for (int i = 0; i < n3[0].length; i++) {
			System.out.println(n3[0][i]);
		}
		for (int i = 0; i < n3[1].length; i++) {
			System.out.println(n3[1][i]);
		}
	}

}
