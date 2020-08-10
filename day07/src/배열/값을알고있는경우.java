package 배열;

public class 값을알고있는경우 {

	public static void main(String[] args) {
		//999, 999
		//배열(array), 진열하다, 늘어놓다.
		int[] ages = {55, 52, 26, 20};
		//i는 인덱스(위치값)
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		//가족의 이름배열, 출력
		String[] names = {"홍길동", "김길동", "홍길순", "홍길자"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//가족의 몸무게배열, 출력
		double[] weights = {99.9, 88.8, 77.7, 66.6};
		for (int i = 0; i < weights.length; i++) {
			System.out.println(weights[i]);
		}
		//가족이 저녁을 먹었는지 여부 배열, 출력
		boolean[] foods = {true, false, false, true};
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
		//가족의 성별(한글자) 배열, 출력
		char[] genders = {'남', '여', '남', '남'};
		for (int i = 0; i < genders.length; i++) {
			System.out.println(genders[i]);
		}
		
	}

}
