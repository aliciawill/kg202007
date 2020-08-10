package 상속;

public class ManagerUser {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name = "홍매니저";
		m.address = "강남구";
		m.salary =100;
		m.rrn = 880101;
		m.bonus = 50;
		System.out.println(m);
		m.test();
	}

}
