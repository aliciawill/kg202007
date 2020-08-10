package 메소드연습;

public class 통장 {
	String name;//전역변수, 멤버변수
	String ssn;
	int money;
	
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	
	//갈색: 지역변수
			//지역변수와 전역변수가 이름이 같은 경우는 지역변수로 인식
			//this => 지금 해당 클래스(통장)
	
	
	
}




