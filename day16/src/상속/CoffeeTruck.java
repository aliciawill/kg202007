package ���;

public class CoffeeTruck extends Truck {
	//������� 4��, ����޼��� 4��
	int price = 1000;

	public void sale() {
		System.out.println("Ŀ�Ǹ� " + price + "���� �ȴ�.");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [price=" + price + ", weight=" + weight + ", color=" + color + ", company=" + company + "]";
	}
	
}
