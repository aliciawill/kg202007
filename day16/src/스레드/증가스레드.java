package 스레드;

public class 증가스레드 extends Thread {
	@Override //재정의, 오버라이드
	public void run() {
		for (int i = 0; i < 1001; i++) {
			System.out.println(i + ": 증가");
		}
	}
}
