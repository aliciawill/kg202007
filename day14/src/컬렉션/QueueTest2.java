package �÷���;

import java.util.LinkedList;

public class QueueTest2 {

	public static void main(String[] args) {
//		�������� ������ ����, ����, ����, ��ǻ��
		LinkedList ���� = new LinkedList();
//		���������� ���� �÷����� ���弼��.
		����.add("����");
		����.add("����");
		����.add("����");
		����.add("��ǻ��");
		System.out.println("��ü ���躼 ����: " + ����);
//		������ ���� �Ѱ��� ������� ���ּ���.
//		��ü ���躼 ����: [����,����,����,��ǻ��]
//		1���� ���躻 �� ���� ����: [����, ����, ��ǻ��]
//		2���� ���躻 �� ���� ����: [����, ��ǻ��]
//		3���� ���躻 �� ���� ����: [��ǻ��]
		System.out.println(����.size());
		for (int i = 0; i <= ����.size(); i++) {//0~3
			System.out.print(i + "=> ");
			����.remove();//3��
			System.out.println(i + 1 + "����: ���躻 �� ���� ����: " + ����);
			
		}

	}

}





