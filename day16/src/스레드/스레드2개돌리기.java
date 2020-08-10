package 스레드;

public class 스레드2개돌리기 {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Timer timer = new Timer();
		counter.start();
		timer.start();
	}

}
