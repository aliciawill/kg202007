package 반복문;

public class 반복해보자 {
	//% 나머지 구해주는 연산자.
	public static void main(String[] args) {
		//3의 배수만 프린트!
//		for (int i = 1; i <= 1000; i++) {
//			if ( i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
		int count = 0;
		//누적시키는 변수는 반복문안에 집어 넣으면,
		//초기화가 되버리기때문에 밖으로 빼준다.!
		for (int i = 1; i <= 1000; i++) {
			if ( i % 3 == 0) {
				continue; //건너뛴다.skip
			}
			System.out.println(i);
			count++;
		}
		System.out.println(count);
	}
}



