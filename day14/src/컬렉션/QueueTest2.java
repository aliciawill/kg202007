package 컬렉션;

import java.util.LinkedList;

public class QueueTest2 {

	public static void main(String[] args) {
//		시험일정 순서가 국어, 수학, 영어, 컴퓨터
		LinkedList 과목 = new LinkedList();
//		시험일정을 담은 컬렉션을 만드세요.
		과목.add("국어");
		과목.add("수학");
		과목.add("영어");
		과목.add("컴퓨터");
		System.out.println("전체 시험볼 과목: " + 과목);
//		시험을 보면 한과목씩 사라지게 해주세요.
//		전체 시험볼 과목: [국어,수학,영어,컴퓨터]
//		1일차 시험본 후 남은 과목: [수학, 영어, 컴퓨터]
//		2일차 시험본 후 남은 과목: [영어, 컴퓨터]
//		3일차 시험본 후 남은 과목: [컴퓨터]
		System.out.println(과목.size());
		for (int i = 0; i <= 과목.size(); i++) {//0~3
			System.out.print(i + "=> ");
			과목.remove();//3개
			System.out.println(i + 1 + "일차: 시험본 후 남은 과목: " + 과목);
			
		}

	}

}





