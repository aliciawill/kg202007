package 배열의응용;

import java.util.Arrays;

public class 배열정리문제 {

	public static void main(String[] args) {
//	1) n1: 배열에 0, 10, 20, 30, 40, 50까지 for문으로 넣으세요.
		int[] n1 = new int[6];
		for (int i = 0; i < n1.length; i++) {
			n1[i] = i * 10;
		}
		for (int x : n1) {
			System.out.print(x + " ");
		}
//	2) 위 배열에서 30보다 큰 값의 개수를 찾아보세요.
		int count = 0;
		for (int x : n1) {
			if(x > 30) {
				count++;
			}
		}
		System.out.println();
		System.out.println("30보다 큰 값의 개수는 " + count);
//	3) n2: 위 배열을 복사하여, 첫번째수를 60으로 변경
		int[] n2 = n1.clone();//깊은 복사
		n2[0] = 60;
		for (int x : n2) {
			System.out.print(x + " ");
		}
		System.out.println();
//	4) n1과 n2의 수들 중 동일한 수를 찾아서, 그 수를 프린트
		for (int i = 0; i < n2.length; i++) {
			if(n1[i] == n2[i]) {
				System.out.print(n1[i]  +" ");
			}
		}
		System.out.println();
		//원본을 변경하는 명령: 파괴함수
		Arrays.sort(n2);//오름차순으로 정렬
		for (int x : n2) {
			System.out.print(x + " ");
		}
		int temp = n2[0];//1. 임시변수<-첫번째자리
		n2[0] = n2[5]; //2. 첫번째자리<-마지막자리
		n2[5] = temp; //3. 마지막자리<-임시변수
	}
}




