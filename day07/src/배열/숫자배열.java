package �迭;

public class ���ڹ迭 {

	public static void main(String[] args) {
//	1)int�迭 5���� �����, 10, 20, 30, 40, 50�� �־�, ����Ʈ
		int[] s = new int[5];
		s[0] = 10;
		s[1] = 20;
		s[2] = 30;
		s[3] = 40;
		s[4] = 50;
		
//		System.out.println(s[0]);
//		System.out.println(s[1]);
//		System.out.println(s[2]);
//		System.out.println(s[3]);
//		System.out.println(s[4]);
		//i�� �迭�� ��ġ �ε���
		for (int i = 0; i < s.length; i++) { 
			System.out.println(s[i]);
		}
//	2)�� �迭�� ������? ����Ʈ
		System.out.println(s.length + "��");
//	3)ù��° �ڸ��� 100�� �־��, ����Ʈ
		s[0] = 100;
		System.out.println(s[0]);
//	4)3��° �ڸ��� 200�� �־��, ����Ʈ
		s[2] = 200;
		System.out.println(s[2]);
//	5)ù��°�� 3��°�� ���ؼ� ����Ʈ
		System.out.println(s[0] + s[2]);
//	=> �迭�� �ݺ���(for)�� ¦���̴�.!!
	}

}
