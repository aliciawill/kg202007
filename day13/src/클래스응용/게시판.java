package Ŭ��������;

public class �Խ��� {
	int no;
	String title;
	String content;
	String writer;
	
	//�Խ��ǿ� ���� �ø���, �� class�� ����� �ٵ�(��ü������),
	//�ݵ�� �ʿ��� �Ӽ��� ������ �� �ִ�.
	public �Խ���(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	//������� ��ü�� ������ ����Ʈ�� �� �ڵ� ȣ��
	//������ ������(�ּ�)--> ����������� Ȯ���ϴ� �뵵�� ���
	@Override
	public String toString() {
		return no + "\t" + title + "\t" +  content  + "\t" +  writer;
	}

	//����� ������ ���� �޼��带 ����Ѵ�.
	public void �����ϱ�() {
		System.out.println("�Խ��� ���� �����ϴ�.");
	}
	public void �����ϱ�() {
		System.out.println("�Խ��� ���� �����ϴ�.");
		
	}
}





