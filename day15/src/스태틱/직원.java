package ����ƽ;

public class ���� {
	String name;
	char gender;
	int age;
	static int count;//������ ����
	static int total;//���� ����
	
	public ����(String name, char gender, int age) {
		count++;
		total = total + age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//�Ϲݸ޼���� ������ ��ü�� �ּҷ� �����Ͽ� ����� �� �ִ�.
	public static int getAvg() {
		return total/count; 
		//static�޼��峻�� ���Ǵ� ������ �ݵ�� static
		//static�� ��ü������ ������� Ŭ�����̸����� ������ ����!
		//static�� ���� ����ϴ� �޼���/������ ������
		//��ü������������ ����ϵ����ϴ� ���� Ư¡.
	}
	
	@Override
	public String toString() {
		return "���� [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
