package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		//비교연산자: 똑같은지(==), 똑같지않은지(!=)
		//! => not
		
		//비교 연산자를 값을 비교할 수 없다.
		//String은 기본데이터가 아니므로, 비교 연산자 사용 불가.
		//String은 부품(class)
		//String id = "root";
		
		//비교연산자의 결과는 항상!!! 논리형(boolean, true/false)
		int id = 1111; //회원가입시 넣은 id
		int id2 = 2222; //지금 로그인하려고 넣은 id
		System.out.println(id == id2);
		System.out.println(id != id2);
		if (id == id2) { //true이면
			System.out.println("로그인 성공입니다.");
			System.out.println("사이트에 들어오셨군요.!");
		} else { //false이면
			System.out.println("다시 로그인해주세요.");
		}
	}
}
