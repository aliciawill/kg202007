package �迭������;

public class �������迭2 {

	public static void main(String[] args) {
		int[] n1 = {1, 2, 3};
		int[] n2 = {4, 5, 6, 7};
		int[][] n3 = new int[2][];
		n3[0] = n1;//2���� �迭�� ù��°�� 1���� �迭 �ϳ��� �����־���.
		n3[1] = n2;
		for (int i = 0; i < n3.length; i++) {//���� ����.
			for (int j = 0; j < n3[i].length; j++) {
				System.out.print(n3[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
