package 상속;

public class 수퍼맨User {

	public static void main(String[] args) {
		수퍼맨 sMan = new 수퍼맨();
		sMan.age = 100; //사람
		sMan.name = "클라크";//사람
		sMan.power = 1000;//맨
		sMan.fly = true;//수퍼맨
		sMan.eat();//사람
		sMan.run();//맨
		sMan.space();//수퍼맨
		
	}

}
