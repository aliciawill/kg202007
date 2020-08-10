package 惑加积己磊;

public class Man extends Object {
	int power;
	
	public Man(int power) {
		super(); //Object()
		this.power = power;
	}

	public void run() {
		System.out.println("崔府促.");
	}

	@Override
	public String toString() {
		return "Man [power=" + power + "]";
	}
	
	
}
