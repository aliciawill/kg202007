package 스레드;

public class 반복스레드 {

	public static void main(String[] args) {
		반복1 t1 = new 반복1();
		반복2 t2 = new 반복2();
		t1.start(); //cpu에 실행하라고 등록
		t2.start();
	}

}
