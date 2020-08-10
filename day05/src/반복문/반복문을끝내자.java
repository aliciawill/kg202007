package 반복문;

public class 반복문을끝내자 {

	public static void main(String[] args) {
		
		//for(시작값;조건문;증가값)
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": 진짜 맞아요!!!");
		}
		
		int start = 0; //시작값
		while (start < 10) { //조건문, true
			System.out.println(start + ": 맞아요!!!");
			start++; //start = start + 1;, 증감연산자,증가값
		}
	}

}
