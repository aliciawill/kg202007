package 스레드;

public class 반복1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("나는 첫번째 스레드=======");
		}
	}
}
