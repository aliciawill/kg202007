package 데이터;

public class 나에대한정보 {
	int y; //선언의 위치가 사용할 수 있는 영역을 결정!
	
	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println("내 이름은 " + name);
		int x; //x라는 이름 공간이 생성. 선언!!!!
		x = 100; //값을 넣었음.
		
		//키, 몸무게, 성별, 저녁을 먹었는지 여부, comment, 주석
		int height = 180; //대입, 할당 연산자
		double weight = 99.9;
		char gender = '남';
		boolean food = true;
		//결합연산자.
		System.out.println("내 키는 " + height + "cm");
		System.out.println(weight);
		System.out.println(gender);
		System.out.println(food);
		
	}

}
