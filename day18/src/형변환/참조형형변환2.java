package 형변환;

import java.util.ArrayList;

public class 참조형형변환2 {

	public static void main(String[] args) {
		//배열과 같이 순서가 목록을 만들 때 사용
		//아무타입이나 넣을 수 있고, 개수도 조절 가능
		ArrayList list = new ArrayList();
		list.add("홍길동");//Object<-String
		list.add(100);
		//Object<--업캐스팅---Integer<--오토박싱--int
		int x = (Integer)list.get(1);
		//int<--오토언박싱--Integer<--다운캐스팅--Object
		list.add(11.11);//Object<-Double<-double
		double y = (double)list.get(2);
		list.add(true);//Object<-Boolean<-boolean
		boolean z = (boolean)list.get(3);
		list.add('남');//Object<-Character<-char
		Car car = new Car();//Object<-Car
		list.add(car);
		System.out.println(list);
	}
}






