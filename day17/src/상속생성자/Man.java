package ��ӻ�����;

public class Man extends Object {
	int power;
	
	public Man(int power) {
		super(); //Object()
		this.power = power;
	}

	public void run() {
		System.out.println("�޸���.");
	}

	@Override
	public String toString() {
		return "Man [power=" + power + "]";
	}
	
	
}
