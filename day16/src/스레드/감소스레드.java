package ������;

public class ���ҽ����� extends Thread {
	@Override //������, �������̵�
	public void run() {
		for (int i = 1000; i >= 0; i--) {
			System.out.println(i + ": ����");
		}
	}
}
