package ������;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸���? ");
		String name = sc.next();
		System.out.print("Ű��? ");
		//String->double : sc.nextDouble()
		double h = sc.nextDouble();
		System.out.print("�����Դ�? ");
		double w = sc.nextDouble();
		System.out.print("���� ������ �Ծ�����? ");
		boolean food = sc.nextBoolean();
		System.out.print("���� �¿����? ");
		sc.nextLine();//true�ϰ� ����ģ ���� �Է����� �޾Ƽ�, �׳� ����.
		String life = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println("�� �̸��� " + name);
		System.out.println("�� ���� Ű�� " + (h + 10));
		System.out.println("�� ���� �����Դ� " + (w - 10));
		System.out.println("���� ������ " + food);
		System.out.println("���� �¿���� " + life);
		System.out.println("---------------------");
		
		if (food) {//true, ���ǹ�, �б⹮
			System.out.println("���� ������!");
		} else {//false
			System.out.println("�ﰢ����� ����!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



