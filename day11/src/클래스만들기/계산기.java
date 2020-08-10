package 클래스만들기;

public class 계산기 {
	
//더하기, 빼기, 곱하기, 나누기 기능이 필요=> 메소드
	public void 더하기(int x, int y) {
				//메소드 안에서 만들어지는 변수는
				//그 지역안에서만 사용가능하다.
				//지역변수(local,로컬변수)
				//매개변수, parameter(파라메터)
		int result = x + y;
		System.out.println("더하기 처리하다.");
		System.out.println("더한 값은 " + result);
	}
	public void 빼기() {
		System.out.println("빼기 처리하다.");
	}
	public void 곱하기(int x, int y, int z) { 
		System.out.println("곱하기 처리하다.");
		int result = x * y * z;
		System.out.println("곱한 결과값은 " + result);
	}
	public void 나누기() {
		System.out.println("나누기 처리하다.");
	}
	
}
