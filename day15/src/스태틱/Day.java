package ����ƽ;

public class Day {
	String doing = null;
	int time = 0;
	String location = null;
	static int count = 0;//������ ��ġ�� ������ ����� �� �ִ� ����
	static int total;
	//��������, �ڵ��ʱ�ȭ(�⺻��: 0, ������: null)
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
