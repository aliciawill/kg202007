package 다이나믹;

public class 내방 {

	public static void main(String[] args) {
		Tv myTv = new Tv(7, 9, true);
		System.out.println("tv객체 개수: " + myTv.count +"개");
		Tv yourTv = new Tv(9, 12, true);
		System.out.println("tv객체 개수: " + yourTv.count +"개");
		Tv ourTv = new Tv(6, 10, false);
		System.out.println("tv객체 개수: " + yourTv.count +"개");
		System.out.println(myTv);
		System.out.println(yourTv);
	}

}




