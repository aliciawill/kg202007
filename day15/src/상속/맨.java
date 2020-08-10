package 상속;

public class 맨 extends 사람 {
	//멤버변수2(name, age), 멤버메소드2(eat())
	int power;
	
	public void run() {
		eat();
		System.out.println(name + "이 빨리 달리다.");
	}
}
