package 인터페이스추상클래스;

//일반클래스: 객체생성 가능한 완벽한 상태의 클래스
//추상클래스: 객체생성 불가능한 불완전한 상태의 클래스
//          추상메서드가 하나라도 포함되어 있으면 무조건
//			추상클래스
public abstract class B회사 implements 휴대폰잭 {
	//추상메서드
	public abstract void 레벨에맞추어만들다();
	
	@Override//재정의
	public void 납작하게만들다() {
		System.out.println("플라스틱으로 납작하게 만들다.");
	}

	@Override
	public void 앞부분은전기가통해야한다() {
		System.out.println("앞부분은 파랑색으로 만들고, 전기가 통하다.");
	}

}
