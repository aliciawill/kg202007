package �÷���;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class �������� {

	public static void main(String[] args) {
		ArrayList run = new ArrayList();
		run.add("�ڼ���");
		run.add("������");
		run.add("������");
		run.add("�谳��");
		System.out.println(run);
		run.remove(1);
		for (int i = 0; i < run.size(); i++) {
			System.out.println(i + 1 + "��: " + run.get(i));
		}
		
		HashMap customer = new HashMap();
		customer.put(100, "�赥��");
		customer.put(200, "�����");
		customer.put(300, "�豸��");
		customer.put(400, "���ڷ�");
		System.out.println(customer);
		customer.remove(200);
		customer.put(300, "���漺");
		System.out.println(customer);
		
		HashSet tour = new HashSet();
		tour.add("����");
		tour.add("�ʸ���");
		tour.add("ĳ����");
		tour.add("�Ϻ�");
		tour.add("����");
		System.out.println(tour);
		
		
		
		
		
	}

}
