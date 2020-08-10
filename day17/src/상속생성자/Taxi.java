package 상속생성자;

public class Taxi extends Car {
	int money;
	
	public Taxi() {
		super();
	}
	
	public Taxi(int speed, int money) {
		super(speed);
		this.money = money;
	}

	@Override
	public String toString() {
		return "Taxi [money=" + money + ", speed=" + speed + "]";
	}
	
	
	
}
