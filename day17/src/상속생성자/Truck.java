package ��ӻ�����;

public class Truck extends Car {
	int weight;

	public Truck(int speed, int weight) {
		super(speed);
		this.weight = weight;
	}
	

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", speed=" + speed + "]";
	}


	public void move() {
		System.out.println("������ ������.");
	}
}
