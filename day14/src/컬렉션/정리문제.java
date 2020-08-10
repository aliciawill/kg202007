package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 정리문제 {

	public static void main(String[] args) {
		ArrayList run = new ArrayList();
		run.add("박소정");
		run.add("김정민");
		run.add("소지현");
		run.add("김개념");
		System.out.println(run);
		run.remove(1);
		for (int i = 0; i < run.size(); i++) {
			System.out.println(i + 1 + "등: " + run.get(i));
		}
		
		HashMap customer = new HashMap();
		customer.put(100, "김데이");
		customer.put(200, "김사전");
		customer.put(300, "김구조");
		customer.put(400, "김자료");
		System.out.println(customer);
		customer.remove(200);
		customer.put(300, "김충성");
		System.out.println(customer);
		
		HashSet tour = new HashSet();
		tour.add("유럽");
		tour.add("필리핀");
		tour.add("캐나다");
		tour.add("일본");
		tour.add("유럽");
		System.out.println(tour);
		
		
		
		
		
	}

}
