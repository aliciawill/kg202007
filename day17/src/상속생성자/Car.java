package 상속생성자;

public class Car extends Object{
	int speed;
	
	//생성자가 아무것도 없는 경우, 기본 생성자가 자동으로 만들어진다.
	public Car() {
	}
	
	public Car(int speed) {
//		super();//상위클래스의 기본생성자를 무조건 호출!
//super()명시적으로 써주는 경우에는 무조건 맨윗줄에 위치시켜야한다.!
		//왜냐하면, 상위클래스가 먼저 만들어지고, 아래에 있는
		//하위클래스의 변수와 메서들을 붙이는 개념이기 때문
		super();
		this.speed = speed;
	}
	
	public void start() {
		System.out.println("자동차가 출발하다.");
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + "]";
	}
	
	
	

}
