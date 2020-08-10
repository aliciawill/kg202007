package 클래스만들기;

public class 게시판 {
	//no, title, content, writer
	String no;
	String title;
	String content;
	String writer;
	
	public void print() {
		System.out.println("번호: " + no);
		System.out.println("제목: " + title);
		System.out.println("내용: " + content);
		System.out.println("작성자: " + writer);
	}
}


