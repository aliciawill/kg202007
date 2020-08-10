package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		
		int result = x + y;
		System.out.println(result);
		
		//result에 333을 더해서, 출력해보세요.
		System.out.println(result + 333);
		
		//사칙연산(+ - * /)
		System.out.println("합은 " + (x + y));
		System.out.println("차는 " + (x - y));
		System.out.println(x + " * " + y + "의 곱은 " + (x * y));
		System.out.println("나눗셈은 " + (x / y));
		
		int sum = 344; //합
		int count = 3; //인원수
		//평균을 구해서, 변수에 넣어보세요.
		int avg = sum / count; 
		double avg2 = (double)sum / count;
		//정수와 정수의 계산은 무슨 일이 있더라도 결과가 정수!
		//연산시 하나라도 실수이면 무조건 실수!
		System.out.println("세 명의 평균은 " + avg2);
		int rest = sum % count; //나머지 연산자
		System.out.println("세 명의 나머지는 " + rest);
		
		//데이터의 타입을 변환할 수 있다.(타입변환, 형변환, 강제형변환)
		//변환=>캐스팅, 강제캐스팅(casting)
	}
}
