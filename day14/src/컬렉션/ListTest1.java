package �÷���;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		//�迭�� �����ϳ�, ũ����������, �ٸ� Ÿ�Ե� ���� �� ����.
		//������ �ִ� ��ϵ�!
		ArrayList list = new ArrayList();
		//list�� ����������(�ּ�)
		//��Ͽ� �ֱ�.
		list.add("�Ӿƹ���");
		list.add(100);
		list.add(185.6);
		list.add(true);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list);
		//�߰��� �����ֱ�
		list.add(1, '��');
		System.out.println(list);
		//���� �����ϱ�
		list.set(2, 200);
		System.out.println(list);
		//���� �����ϱ�
		list.remove(1);
		System.out.println(list);
		
	}

}








