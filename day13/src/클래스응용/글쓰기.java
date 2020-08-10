package 클래스응용;

public class 글쓰기 {

	public static void main(String[] args) {
		//new: 클래스를 가지고 객체를 만드는 일(객체생성)
		//붕어빵틀 클래스---new--->붕어빵 객체
		//객체 생성시 자동으로 클래스이름과 동일한 메소드가 호출
		//이 "클래스이름과 동일한 메소드"를 "생성자 메소드"라고 부른다.
		게시판 bbs = new 게시판(1, "java", "fun java", "park"); 
		게시판 bbs2 = new 게시판(2, "jsp", "fun jsp", "kim"); 
		게시판 bbs3 = new 게시판(3, "spring", "fun spring", "song");

		System.out.println("no \t title\t content\t writer");
		System.out.println("------------------------------------");
		System.out.println(bbs);
		System.out.println(bbs2);
		System.out.println(bbs3);
		//메소드를 사용하고 싶으면, 반드시 객체를 만든 후, 
		//그 객체의 이름을 이용하여 사용해야한다.
		bbs.수정하기();
		bbs2.삭제하기();
		//단, 게시판에 main이 있는 경우에는 외부에서 호출불가.--!!!
		
		
		
		
		
		
	}

}
