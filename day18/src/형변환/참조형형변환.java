package ����ȯ;

public class ����������ȯ {

	public static void main(String[] args) {
		// Ŭ������ ��Ӱ��迡 ���� ���� ����ȯ ����
		// Truck�� Dog�� �ȵ�
		// Truck�� Car�� ��
		Car car = new Car();
		Truck truck = new Truck();
		car = truck; //car(ū)<-truck(����)
				//�θ�, ����Ŭ����(ū)<-�ڽ�, ����Ŭ����(����)
				//�ڵ�����ȯ, ��ĳ����
		Truck truck2 = (Truck)car;//truck(��)<-car(ū)
				//��������ȯ, �ٿ�ĳ����

	}

}
