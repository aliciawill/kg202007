package 스레드;

public class 증가감소스레드 {

	public static void main(String[] args) {
		증가스레드 plus = new 증가스레드();
		감소스레드 minus = new 감소스레드();
		plus.start();
		minus.start();
	}

}
