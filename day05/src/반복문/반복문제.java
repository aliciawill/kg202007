package 반복문;

public class 반복문제 {

	public static void main(String[] args) {
		//2부터 668까지 5의 배수의 개수를 프린트
		int count = 0;
		for (int i = 2; i <= 666668; i++) {
			if (i % 5 == 0) { 
				//5로 나누었더니, 나머지가 없는 경우(5의 배수)	
				count++;
			}
		}
		System.out.println(count);
		int count2 = 0;
		for (int i = 2; i <= 666668; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				count2++;
			}
		}
		System.out.println(count2);

	}

}
