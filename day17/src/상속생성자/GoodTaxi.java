package ��ӻ�����;

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
	
	
	//Taxi�� CoodTaxi�� �ϼ��ؼ� GoodTexiUser���� ���!
}
