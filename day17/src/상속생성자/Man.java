package 상속생성자;

public class Man extends Object {
	int power;
	
	public Man(int power) {
		super(); //Object()
		this.power = power;
	}

	public void run() {
		System.out.println("달리다.");
	}

	@Override
	public String toString() {
		return "Man [power=" + power + "]";
	}
	
	
}
