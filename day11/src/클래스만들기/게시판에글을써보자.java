package 클래스만들기;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 게시판에글을써보자 {

	public static void main(String[] args) throws Exception {
		게시판 bbs = new 게시판();
		bbs.no = JOptionPane.showInputDialog("번호");
		bbs.title = JOptionPane.showInputDialog("제목");
		bbs.content = JOptionPane.showInputDialog("내용");
		bbs.writer = JOptionPane.showInputDialog("작성자");
		bbs.print();
		//파일로 저장을 해보자.
		FileWriter file = new FileWriter(bbs.no + ".txt");
		file.write(bbs.no + "\n");
		file.write(bbs.title + "\n");
		file.write(bbs.content + "\n");
		file.write(bbs.writer + "\n");
		file.close();//connection를 끊는다.
	}

}




