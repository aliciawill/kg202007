package ��ӻ�����;

public class Car extends Object{
	int speed;
	
	//�����ڰ� �ƹ��͵� ���� ���, �⺻ �����ڰ� �ڵ����� ���������.
	public Car() {
	}
	
	public Car(int speed) {
//		super();//����Ŭ������ �⺻�����ڸ� ������ ȣ��!
//super()��������� ���ִ� ��쿡�� ������ �����ٿ� ��ġ���Ѿ��Ѵ�.!
		//�ֳ��ϸ�, ����Ŭ������ ���� ���������, �Ʒ��� �ִ�
		//����Ŭ������ ������ �޼����� ���̴� �����̱� ����
		super();
		this.speed = speed;
	}
	
	public void start() {
		System.out.println("�ڵ����� ����ϴ�.");
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + "]";
	}
	
	
	

}
