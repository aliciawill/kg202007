package �÷���;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ski.add("�ڽ�Ű"); //0
		ski.add("�۽�Ű"); //1
		ski.add("�轺Ű"); //2
		ski.add("����Ű"); //3
		System.out.println(ski);
		System.out.println("����: " + ski.size());//ski�� ����
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i + 1 + "��: " + ski.get(i));
		}
		System.out.println("-----");
		//2�� Ż��ó��
		ski.remove(1);
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i + 1 + "��: " + ski.get(i));
		}
	}
}





