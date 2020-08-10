package 상속생성자;

public class GoodTaxi extends Taxi {
	String color;

	public GoodTaxi() {
		//super();
	}
	
	public GoodTaxi(int speed, int money, String color) {
		super(speed, money);
		this.color = color;
	}

	@Override
	public String toString() {
		return "GoodTaxi [color=" + color + ", money=" + money + ", speed=" + speed + "]";
	}
	
	
	//Taxi와 CoodTaxi를 완성해서 GoodTexiUser에서 사용!
}
