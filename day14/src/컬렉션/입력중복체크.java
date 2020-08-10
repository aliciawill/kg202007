package 컬렉션;

import java.util.HashSet;
import java.util.Scanner;

public class 입력중복체크 {

	public static void main(String[] args) {
		//중복을 체크해야할 때는 set을 사용하여 집어넣으세요.
		//자동으로 set이 중복체크해줌.
//		입력값을 받는데, 좋아하는 과일 5개를 받으세요.
//		중복이 되면 안됨.
//		출력해보세요.
		Scanner sc = new Scanner(System.in);
		HashSet set = new HashSet();
		while (true) {
			if (set.size() == 5) {
				break;
			}
			System.out.print("좋아하는 과일>> ");
			String data = sc.next();
			System.out.println("입력데이터: " + data);
			set.add(data);
		}
		System.out.println("좋아하는 과일들: " + set);
		set.toArray();//set을 배열로 변경 가능.
	}
}





