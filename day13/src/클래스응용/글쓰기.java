package Ŭ��������;

public class �۾��� {

	public static void main(String[] args) {
		//new: Ŭ������ ������ ��ü�� ����� ��(��ü����)
		//�ؾƲ Ŭ����---new--->�ؾ ��ü
		//��ü ������ �ڵ����� Ŭ�����̸��� ������ �޼ҵ尡 ȣ��
		//�� "Ŭ�����̸��� ������ �޼ҵ�"�� "������ �޼ҵ�"��� �θ���.
		�Խ��� bbs = new �Խ���(1, "java", "fun java", "park"); 
		�Խ��� bbs2 = new �Խ���(2, "jsp", "fun jsp", "kim"); 
		�Խ��� bbs3 = new �Խ���(3, "spring", "fun spring", "song");

		System.out.println("no \t title\t content\t writer");
		System.out.println("------------------------------------");
		System.out.println(bbs);
		System.out.println(bbs2);
		System.out.println(bbs3);
		//�޼ҵ带 ����ϰ� ������, �ݵ�� ��ü�� ���� ��, 
		//�� ��ü�� �̸��� �̿��Ͽ� ����ؾ��Ѵ�.
		bbs.�����ϱ�();
		bbs2.�����ϱ�();
		//��, �Խ��ǿ� main�� �ִ� ��쿡�� �ܺο��� ȣ��Ұ�.--!!!
		
		
		
		
		
		
	}

}
