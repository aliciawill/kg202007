package �迭������;

public class �迭�Ǻ��� {

	public static void main(String[] args) {
		// �⺻���� ����(����, �Ǽ�, ����, ��)
		int x = 100;
		int y = x; // �⺻���� ����
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		x = 200;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("========");
		// �������� ����
		int[] a = { 1, 2, 3 };
		//int[] b = a; //�ּҸ� ����(���� ����)
		int[] b = a.clone();//�迭 ���� ����(���� ����)
		a[0] = 9;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}
}





