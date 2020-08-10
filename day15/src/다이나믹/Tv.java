package 다이나믹;

public class Tv {
	int ch;
	int vol;
	boolean onOff;
	static int count;
	
	//멤버변수 입력용: 생성자 메서드
	public Tv(int ch, int vol, boolean onOff) {
		count++;
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	public void tvOn() {
		System.out.println("TV를 켜다.");
	}
	public void tvOff() {
		System.out.println("TV를 끄다.");
	}
	
	//멤버변수 출력용: toString() 재정의
	@Override
	public String toString() {
		return "객체[ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	
	
	
	
	
	
	
	
}
