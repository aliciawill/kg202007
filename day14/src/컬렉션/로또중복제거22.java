package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또중복제거22 {

	public static void main(String[] args) {
		//중복이 해결 된 상태
		Random r = new Random(); //아무숫자나 만들어줌
		HashSet set = new HashSet();
		while (set.size() < 6) {
			int data = r.nextInt(45) + 1;
			System.out.println("랜덤 값: " + data);
			set.add(data);//1~45
		}
		System.out.println(set);
	}
}
