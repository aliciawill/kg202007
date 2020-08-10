package 컬렉션;

import java.util.HashSet;

public class SetTest1 {

	public static void main(String[] args) {
		// 목록 중 중복된 값이 이미 있으면 안들어감.(필터링)
		HashSet bag = new HashSet();
		bag.add("볼펜");
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		System.out.println(bag);
		

	}

}
