package 클래스응용;

public class 게시판 {
	int no;
	String title;
	String content;
	String writer;
	
	//게시판에 글을 올릴때, 이 class를 사용할 텐데(객체생성시),
	//반드시 필요한 속성을 지정할 수 있다.
	public 게시판(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	//만들어진 객체의 변수를 프린트할 때 자동 호출
	//원래는 참조형(주소)--> 멤버변수값을 확인하는 용도로 사용
	@Override
	public String toString() {
		return no + "\t" + title + "\t" +  content  + "\t" +  writer;
	}

	//기능을 정의할 때는 메서드를 사용한다.
	public void 수정하기() {
		System.out.println("게시판 글을 수정하다.");
	}
	public void 삭제하기() {
		System.out.println("게시판 글을 삭제하다.");
		
	}
}





