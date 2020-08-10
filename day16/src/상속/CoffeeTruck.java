package 상속;

public class CoffeeTruck extends Truck {
	//멤버변수 4개, 멤버메서드 4개
	int price = 1000;

	public void sale() {
		System.out.println("커피를 " + price + "원에 팔다.");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [price=" + price + ", weight=" + weight + ", color=" + color + ", company=" + company + "]";
	}
	
}
