package 부품다루기;

import org.jsoup.Jsoup;

public class 크롤링 {

	public static void main(String[] args) {
		Jsoup.connect("http://www.naver.com");
		System.out.println("네이버 연결 성공.");
	}

}
