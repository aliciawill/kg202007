package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링1 {

	public static void main(String[] args) throws Exception {
		//Jsoup라이브러리가 필요
		//Java----네트워크----사이트 페이지
		//자바로 네트워크로 사이트를 연결해서
		//그 사이트에 해당하는 문서를 다운로드 받는 기능
		//다운로드 받은 문서 중에서 원하는 데이터를 추출하는 기능
		
		Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=035720").get();
		System.out.println("네이버 금융 사이트 연결하여 다운로드 성공...!!!");
		//System.out.println(doc);
		//System.out.println(doc.select("a"));
		Elements result = doc.select("span.code");//<span class="code">
		System.out.println("검색결과 개수: " + result.size());
		Element one = result.get(0);
		System.out.println(one);
		String code = one.text();
		System.out.println("code: " + code);
		
		Elements result2 = doc.select("em.date");
		System.out.println("검색결과 개수: " + result2.size());
		Element one2 = result2.get(0);
		System.out.println(one2);
		String date = one2.text();
		System.out.println("date: " + date);
	}
}







