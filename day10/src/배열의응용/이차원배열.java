package �迭������;

public class �������迭 {

	public static void main(String[] args) {
		// {0, 0, 0, 0}
		// {0, 0, 0, 0}
		int[][] num = new int[2][4];
		num[1][3] = 900;
		num[0][1] = 800;
		System.out.println(num.length);// ���� ����, 1��������
		System.out.println(num[0].length);// 0���� ����
		System.out.println(num[1].length);// 1���� ����

		for (int i = 0; i < num.length; i++) { // ���� ����
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}
}
