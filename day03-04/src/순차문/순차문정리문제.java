package 순차문;

import javax.swing.JOptionPane;

public class 순차문정리문제 {

	public static void main(String[] args) {
//		순차문 정리문제 String.format("%.2f", pie)
//		---------------------------------------
//		1. BMI지수= 몸무게(kg) ÷ (신장(m) × 신장(m))
//		몸무게 입력:
//		신장 입력:
		String data1 = JOptionPane.showInputDialog("몸무게");
		String data2 = JOptionPane.showInputDialog("신장");
//
//		bmi를 구해보세요.
		double w = Double.parseDouble(data1);
		double h = Double.parseDouble(data2);
		double bmi = w / (h * h);
		
		System.out.printf("bmi결과는 %.3f", bmi);
		String bmi2 = String.format("%.3f", bmi);
		JOptionPane.showMessageDialog(null, "bmi결과는 " + bmi2);
//
//		2. 포인트 문제
//		현재까지의 누적 포인트: 3000
//		추가 포인트: 33.3
//		최종 포인트는 3033.3
		String data3 = JOptionPane.showInputDialog("현재까지의 누적 포인트:");
		String data4 = JOptionPane.showInputDialog("추가 포인트:");
		int now = Integer.parseInt(data3);
		double add = Double.parseDouble(data4);
		
		double result = now + add;
		
		System.out.printf("최종 포인트는 %.3f" , result);
	}
}




