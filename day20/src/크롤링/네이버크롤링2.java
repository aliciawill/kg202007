package 크롤링;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링2 {

	public static void main(String[] args) throws Exception {
		String[] codes = { "035720", "005380", "005930", "006120", "068270" };
		for (int i2 = 0; i2 < codes.length; i2++) {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + codes[i2]).get();
			Elements result1 = doc.select("p.no_today");
			//System.out.println("개수: " + result1.size());
			Element tag = result1.get(0);
			//System.out.println(tag);
			Elements result2 = tag.select("span.blind");
			Element tag2 = result2.get(0);
			//System.out.println(tag2);
			String today = tag2.text();
			Elements blindList = doc.select("span.blind");
			//		System.out.println(blindList);
			//		System.out.println(blindList.size());
			for (int i = 0; i < blindList.size(); i++) {
				//System.out.println(i + ": " + blindList.get(i));
			}
			String low = blindList.get(15).text();
			String high = blindList.get(16).text();
			System.out.println("오늘가: " + today);
			System.out.println("저가: " + low);
			System.out.println("고가: " + high);
			Elements result = doc.select("span.code");//<span class="code">
			//System.out.println("검색결과 개수: " + result.size());
			Element one = result.get(0);
			//System.out.println(one);
			String code = one.text();
			//System.out.println("code: " + code);
			System.out.println("---------------------");
			
			FileWriter file = new FileWriter(code + ".txt");
			file.write(today +"\n");
			file.write(low +"\n");
			file.write(high +"\n");
			file.close();
		}
	}
}







