package ���̳���;

public class ���� {

	public static void main(String[] args) {
		Tv myTv = new Tv(7, 9, true);
		System.out.println("tv��ü ����: " + myTv.count +"��");
		Tv yourTv = new Tv(9, 12, true);
		System.out.println("tv��ü ����: " + yourTv.count +"��");
		Tv ourTv = new Tv(6, 10, false);
		System.out.println("tv��ü ����: " + yourTv.count +"��");
		System.out.println(myTv);
		System.out.println(yourTv);
	}

}




