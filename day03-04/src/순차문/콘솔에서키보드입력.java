package ������;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class �ֿܼ���Ű�����Է� {

	public static void main(String[] args) {
		//new: ����!
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸���? ");
		String name = sc.next();
		
		System.out.print("����� ���̴�? ");
		//���� �ܺο��� �Է��� ��� String!!
		int age = sc.nextInt(); //String->int�� ��ȯ���� ����.
		
		System.out.print("����� ��̴�? ");
		String hobby = sc.next(); //�Է��� �ܾ� �ϳ�!
		
		System.out.println("����� �̸��� " + name);
		System.out.println("����� ���� ���̴� " + (age + 1));
		System.out.println("����� ��̴� " + hobby);
	}
}




