package 컬렉션;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		//배열과 유사하나, 크기조절가능, 다른 타입도 넣을 수 있음.
		//순서가 있는 목록들!
		ArrayList list = new ArrayList();
		//list는 참조형변수(주소)
		//목록에 넣기.
		list.add("임아무개");
		list.add(100);
		list.add(185.6);
		list.add(true);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list);
		//중간에 끼워넣기
		list.add(1, '남');
		System.out.println(list);
		//값을 변경하기
		list.set(2, 200);
		System.out.println(list);
		//값을 삭제하기
		list.remove(1);
		System.out.println(list);
		
	}

}








