package ����ȯ;

import java.util.ArrayList;

public class ����������ȯ2 {

	public static void main(String[] args) {
		//�迭�� ���� ������ ����� ���� �� ���
		//�ƹ�Ÿ���̳� ���� �� �ְ�, ������ ���� ����
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");//Object<-String
		list.add(100);
		//Object<--��ĳ����---Integer<--����ڽ�--int
		int x = (Integer)list.get(1);
		//int<--�����ڽ�--Integer<--�ٿ�ĳ����--Object
		list.add(11.11);//Object<-Double<-double
		double y = (double)list.get(2);
		list.add(true);//Object<-Boolean<-boolean
		boolean z = (boolean)list.get(3);
		list.add('��');//Object<-Character<-char
		Car car = new Car();//Object<-Car
		list.add(car);
		System.out.println(list);
	}
}






