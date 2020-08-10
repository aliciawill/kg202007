package 형변환;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 클래스간 상속관계에 있을 때만 형변환 가능
		// Truck과 Dog은 안됨
		// Truck과 Car는 됨
		Car car = new Car();
		Truck truck = new Truck();
		car = truck; //car(큰)<-truck(작은)
				//부모, 수퍼클래스(큰)<-자식, 서브클래스(작은)
				//자동형변환, 업캐스팅
		Truck truck2 = (Truck)car;//truck(작)<-car(큰)
				//강제형변환, 다운캐스팅

	}

}
