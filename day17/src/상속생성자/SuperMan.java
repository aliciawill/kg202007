package ��ӻ�����;

public class SuperMan extends Man {
	int fly; //������� 2��
	
	public SuperMan(int power, int fly) {
		super(power);
		this.fly = fly;
	}

	public void space() {
		System.out.println("���ָ� ����.");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + "]";
	}
	
	
	
	
	
	
	
	
	
}
