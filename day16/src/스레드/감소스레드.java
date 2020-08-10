package 스레드;

public class 감소스레드 extends Thread {
	@Override //재정의, 오버라이드
	public void run() {
		for (int i = 1000; i >= 0; i--) {
			System.out.println(i + ": 감소");
		}
	}
}
