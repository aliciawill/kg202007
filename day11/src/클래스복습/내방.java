package 클래스복습;

public class 내방 {

	public static void main(String[] args) {
		컴퓨터 game = new 컴퓨터();
		game.color = "검정색";
		game.shape = "네모";
		System.out.println(game);
		
		컴퓨터 doc = new 컴퓨터();
		doc.color = "흰색";
		doc.shape = "동그라미";
		
		
		game.켜다();
		game.끄다();
		System.out.println("게임용 컴퓨터의 색은 " + game.color);
		System.out.println("게임용 컴퓨터의 모양은 " + game.shape);
		
	}

}
