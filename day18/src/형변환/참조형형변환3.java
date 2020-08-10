package 형변환;

import java.util.ArrayList;

public class 참조형형변환3 {

	public static void main(String[] args) {
		//Generic프로그래밍(제너릭 프로그래밍)
		//클래스 만들 때 타입을 지정하지 않음.
		//클래스를 이용하여 객체생성시 타입을 결정할 수 있음.
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("박길동");
		list.add("송길동");
		list.add("정길동");
		System.out.println(list);
	}

}
