package Ŭ���������;

//class=Ʋ����, ���� ���� �ʴ´�.
public class Tv {
	//����: �������, ��������
	int ch;
	int vol;
	boolean onOff;
	
	//��ü����: Ŭ������ Ʋ�� ������, ������ ����(��ü)�� ������ ��.
	//��ü������ Ŭ�����̸��� ������ �޼ҵ尡 ������ �ڵ�ȣ��
	//������ �޼���, ������, constructor
	public Tv(int ch, int vol, boolean onOff) {
		//�������� ǥ�õ� Tv�����ڸ޼ҵ� �ȿ��� ������� ����: ��������
		//this=>�ش� Ŭ������ �ǹ�
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	//����: ����� ����, ����޼ҵ�(==�Լ�)
	public void tvOn() {
		System.out.println("TV�� �Ѵ�.");
	}
	public void tvOff() {
		System.out.println("TV�� ����.");
	}
	
	//������� ����� �� Ȯ�ο� �޼ҵ带 ������
	@Override
	public String toString() {
		return "����Ű�� ���� " + ch + " " + vol + " " + onOff;
	}
}
