package �޼ҵ忬��;

import Ŭ���������.����;

public class ��ȯ����� {

	public static void main(String[] args) {
		��ȯ������ re = new ��ȯ������();
		int result = re.add(100, 200);
		System.out.println(result);
		double result2 = re.add(22.2, 100);
		System.out.println(result2);
		String result3 = re.add("�ȳ�", "�ڹپ�");
		System.out.println(result3);
		String result4 = re.add(100, "���Դϴ�.");
		System.out.println(result4);
		int[] result5 = re.add();
		for (int x : result5) {
			System.out.print(x + " ");
		}
		���� cal = re.add(1000);
		cal.div(500, 100);
	}

}
