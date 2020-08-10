package 부품다루기;

public class 내방 {

	public static void main(String[] args) {
		//전화기 사용
		전화기 cal = new 전화기();
		cal.button = true;
		cal.shape = "폴더모양";
		System.out.println(cal.button);
		System.out.println(cal.shape);
		cal.문자하다();//컨트롤+클릭(원본을 볼 수 있음.)
		cal.전화하다();
		
		//전화기를 한대 더 사용해보세요.
		//cal2전화기로 문자하다.
		//cal2전화기는 모양이 동그라미.출력으로 확인
		
		
		
		
		
	}

}
