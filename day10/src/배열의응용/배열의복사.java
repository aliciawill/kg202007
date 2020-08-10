package 배열의응용;

public class 배열의복사 {

	public static void main(String[] args) {
		// 기본형의 복사(정수, 실수, 문자, 논리)
		int x = 100;
		int y = x; // 기본형의 복사
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		x = 200;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("========");
		// 참조형의 복사
		int[] a = { 1, 2, 3 };
		//int[] b = a; //주소만 복사(얕은 복사)
		int[] b = a.clone();//배열 값들 복사(깊은 복사)
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





