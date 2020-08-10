package 상속생성자;

public class GoodTaxiUser {

	public static void main(String[] args) {
		GoodTaxi  good = new GoodTaxi(100, 10000, "검정");
		System.out.println(good);
		
		Taxi taxi = new Taxi(200, 5000);
		System.out.println(taxi);
	}

}
