package Ŭ���������;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class �Խ��ǿ������Ẹ�� {

	public static void main(String[] args) throws Exception {
		�Խ��� bbs = new �Խ���();
		bbs.no = JOptionPane.showInputDialog("��ȣ");
		bbs.title = JOptionPane.showInputDialog("����");
		bbs.content = JOptionPane.showInputDialog("����");
		bbs.writer = JOptionPane.showInputDialog("�ۼ���");
		bbs.print();
		//���Ϸ� ������ �غ���.
		FileWriter file = new FileWriter(bbs.no + ".txt");
		file.write(bbs.no + "\n");
		file.write(bbs.title + "\n");
		file.write(bbs.content + "\n");
		file.write(bbs.writer + "\n");
		file.close();//connection�� ���´�.
	}

}




