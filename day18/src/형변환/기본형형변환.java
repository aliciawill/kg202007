package ����ȯ;

public class �⺻������ȯ {

	public static void main(String[] args) {
		//�⺻�� ������ Ÿ��
		int a = 100;//-21��~21��(4����Ʈ)
		byte b = 100; //-128~127(1����Ʈ)
		long c = 100000000000L; //21�� �̻�(8����Ʈ)
		short d = 2000;//-2�� ~ 2��(2����Ʈ)
		//long(8)<- int(4)<- short(2)<- byte(1)
		//double(8)<- float(4)
		double e = 11.4567;
		float f = 11.55F;		
		
		
		byte n1 = 100;
		int n2 = n1; //int(ū)<-byte(����):�ڵ�Ÿ�Ժ�ȯ
					 //�ڵ�����ȯ
		byte n3 = (byte)n2;//byte(��)<-int(ū):
					//��������ȯ, �۰� ������� �� �ִ� ���ֿ� ���� �� 
					//��������ȯ �����ϴ�.
		//byte n4 = 1000;
	}
}





