package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ�1 {

	public static void main(String[] args) throws Exception {
		//Jsoup���̺귯���� �ʿ�
		//Java----��Ʈ��ũ----����Ʈ ������
		//�ڹٷ� ��Ʈ��ũ�� ����Ʈ�� �����ؼ�
		//�� ����Ʈ�� �ش��ϴ� ������ �ٿ�ε� �޴� ���
		//�ٿ�ε� ���� ���� �߿��� ���ϴ� �����͸� �����ϴ� ���
		
		Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=035720").get();
		System.out.println("���̹� ���� ����Ʈ �����Ͽ� �ٿ�ε� ����...!!!");
		//System.out.println(doc);
		//System.out.println(doc.select("a"));
		Elements result = doc.select("span.code");//<span class="code">
		System.out.println("�˻���� ����: " + result.size());
		Element one = result.get(0);
		System.out.println(one);
		String code = one.text();
		System.out.println("code: " + code);
		
		Elements result2 = doc.select("em.date");
		System.out.println("�˻���� ����: " + result2.size());
		Element one2 = result2.get(0);
		System.out.println(one2);
		String date = one2.text();
		System.out.println("date: " + date);
	}
}







