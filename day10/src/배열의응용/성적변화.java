package 배열의응용;

public class 성적변화 {

	public static void main(String[] args) {
//		term1 = {88, 99, 77, 66}; //1학기
//		2학기의 성적은 두번째 과목이 100, 네번째 과목이 55으로 변경됨.
//
//		두 학기의 성적에 변동이 있는 과목수를 구하세요.
		int[] term1 = {88, 99, 77, 66};
		int[] term2 = term1.clone(); //{88,100,77,55};
		term2[1] = 100;
		term2[3] = 55;
		System.out.println("term1:term2");
		for (int i = 0; i < term2.length; i++) {
			System.out.println("  " + term1[i] + " : " + term2[i]);
		}
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] != term2[i]) {
				count++;
			}
		}
		System.out.println("----------------");
		System.out.println("변동 과목수는 " + count);
	}

}
