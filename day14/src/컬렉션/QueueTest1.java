package 컬렉션;

import java.util.LinkedList;

public class QueueTest1 {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("어제먹을 우유");
		milk.add("오늘먹을 우유");
		milk.add("내일먹을 우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}

}




