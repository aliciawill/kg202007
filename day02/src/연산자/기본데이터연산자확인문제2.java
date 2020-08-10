package 연산자;

public class 기본데이터연산자확인문제2 {

	public static void main(String[] args) {
		//1. 
		char w1 = 'p'; 
		char w2 = 'q';
		if(w1 == w2) {
			System.out.println("PASS!");
		}else {
			System.out.println("재입력");
		}
		
		//2. 
		double change = 2.2;
		if(change >= 2) {
			System.out.println("다이어트");
		}
		
		//3. 
		if(w1 == w2  && change >= 2 ) {
			System.out.println("성공!");
		}else {
			System.out.println("내일 다시 도전");
		}
	}

}





