package 스태틱;

public class 직원 {
	String name;
	char gender;
	int age;
	static int count;//직원수 누적
	static int total;//나이 누적
	
	public 직원(String name, char gender, int age) {
		count++;
		total = total + age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//일반메서드는 생성된 객체의 주소로 접근하여 사용할 수 있다.
	public static int getAvg() {
		return total/count; 
		//static메서드내에 사용되는 변수는 반드시 static
		//static은 객체생성과 상관없이 클래스이름으로 접근이 가능!
		//static은 자주 사용하는 메서드/변수가 있으면
		//객체생성하지말고 사용하도록하는 것이 특징.
	}
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
