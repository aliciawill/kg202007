package 메소드연습;

import 클래스만들기.계산기;

public class 반환값사용 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		int result = re.add(100, 200);
		System.out.println(result);
		double result2 = re.add(22.2, 100);
		System.out.println(result2);
		String result3 = re.add("안녕", "자바야");
		System.out.println(result3);
		String result4 = re.add(100, "점입니다.");
		System.out.println(result4);
		int[] result5 = re.add();
		for (int x : result5) {
			System.out.print(x + " ");
		}
		계산기 cal = re.add(1000);
		cal.div(500, 100);
	}

}
