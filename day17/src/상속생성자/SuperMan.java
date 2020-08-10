package 상속생성자;

public class SuperMan extends Man {
	int fly; //멤버변수 2개
	
	public SuperMan(int power, int fly) {
		super(power);
		this.fly = fly;
	}

	public void space() {
		System.out.println("우주를 날다.");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + "]";
	}
	
	
	
	
	
	
	
	
	
}
