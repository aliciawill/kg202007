package ����ƽ;

public class ������� {
	static int imsi = 100;
	
	public static void main(String[] args) {
		System.out.println(imsi + 1);
		���� worker1 = new ����("ȫ�浿", '��', 25);
		���� worker2 = new ����("��浿", '��', 22);
		���� worker3 = new ����("�۱浿", '��', 24);
		System.out.println("��ü ������: " + ����.count + "��");
		System.out.println("��ճ���: " + ����.getAvg() + "��");
//		System.out.println("��ճ���: " + ����.total/����.count + "��");
		System.out.println(worker1);
		System.out.println(worker2);
		System.out.println(worker3);
	}

}




