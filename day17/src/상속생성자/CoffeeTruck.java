package 상속생성자;

public class CoffeeTruck extends Truck {

	int price; //커피값

	//super라는 키워드는 부모클래스, 수퍼클래스를 의미
	//super는 Truck클래스=> Truck(speed, weight)와 같음.
	public CoffeeTruck(int speed, int weight, int price) {
		super(speed, weight);
		this.price = price;
	}

	@Override
	public String toString() {
		return "CoffeeTruck [price=" + price + ", weight=" + weight + ", speed=" + speed + "]";
	}
	
	
}
