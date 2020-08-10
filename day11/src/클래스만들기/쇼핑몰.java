package 클래스만들기;

public class 쇼핑몰 {

	public static void main(String[] args) {
		//제품클래스를 가지고 찍어낸 p1, p2가
		//원래 사용하려고 했던 대상: object(객체)
		//클래스로 찍어낸 실제(인스턴스)가 p1, p2객체이다.
		//클래스의 인스턴스는 객체이다.
		제품 p1 = new 제품();
		p1.no = 1;
		p1.name = "구두";
		p1.price = 10000;
		p1.company = "빛나";
		p1.print();
		제품 p2 = new 제품();
		p2.no = 2;
		p2.name = "컴퓨터";
		p2.price = 20000;
		p2.company = "빨라";
		p2.print();
	}

}
