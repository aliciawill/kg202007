package ��ӻ�����;

public class CoffeeTruck extends Truck {

	int price; //Ŀ�ǰ�

	//super��� Ű����� �θ�Ŭ����, ����Ŭ������ �ǹ�
	//super�� TruckŬ����=> Truck(speed, weight)�� ����.
	public CoffeeTruck(int speed, int weight, int price) {
		super(speed, weight);
		this.price = price;
	}

	@Override
	public String toString() {
		return "CoffeeTruck [price=" + price + ", weight=" + weight + ", speed=" + speed + "]";
	}
	
	
}
