package ���̳���;

public class Tv {
	int ch;
	int vol;
	boolean onOff;
	static int count;
	
	//������� �Է¿�: ������ �޼���
	public Tv(int ch, int vol, boolean onOff) {
		count++;
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	public void tvOn() {
		System.out.println("TV�� �Ѵ�.");
	}
	public void tvOff() {
		System.out.println("TV�� ����.");
	}
	
	//������� ��¿�: toString() ������
	@Override
	public String toString() {
		return "��ü[ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	
	
	
	
	
	
	
	
}
