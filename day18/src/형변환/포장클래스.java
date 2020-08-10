package 형변환;
//Wrapper class
public class 포장클래스 {

	public static void main(String[] args) {
		//기본형과 관련된 작업을 하기 위해서 특별히
		//여러 기능을 붙여서 만든 클래스
		int i1 = 100;
		Integer i2 = i1;//포장클래스<-기본형(오토박싱)
		int i3 = i2;//기본형<-포장클래스(오토언박싱)
	}

}
