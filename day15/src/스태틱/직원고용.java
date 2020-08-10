package 스태틱;

public class 직원고용 {
	static int imsi = 100;
	
	public static void main(String[] args) {
		System.out.println(imsi + 1);
		직원 worker1 = new 직원("홍길동", '남', 25);
		직원 worker2 = new 직원("김길동", '여', 22);
		직원 worker3 = new 직원("송길동", '남', 24);
		System.out.println("전체 직원수: " + 직원.count + "명");
		System.out.println("평균나이: " + 직원.getAvg() + "세");
//		System.out.println("평균나이: " + 직원.total/직원.count + "세");
		System.out.println(worker1);
		System.out.println(worker2);
		System.out.println(worker3);
	}

}




