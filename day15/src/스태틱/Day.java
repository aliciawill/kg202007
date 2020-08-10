package 스태틱;

public class Day {
	String doing = null;
	int time = 0;
	String location = null;
	static int count = 0;//선언의 위치가 변수를 사용할 수 있는 범위
	static int total;
	//전역변수, 자동초기화(기본형: 0, 참조형: null)
	public Day(String doing, int time, String location) {
		total = total + time;
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
