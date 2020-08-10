package 순차문;

import javax.swing.JOptionPane;

public class 사각형면적 {

	public static void main(String[] args) {
//		입력:
//			가로: 22.2 
//			세로: 33.3
		String data1 = JOptionPane.showInputDialog("가로");
		String data2 = JOptionPane.showInputDialog("세로");
		//System.out.println(data1 * data2);
		//String은 사칙연산 불가
//
//		처리: 
//			가로 x 세로(Double.parseDouble())
		double x = Double.parseDouble(data1); //22.0
		double y = Double.parseDouble(data2); //33.0
		double result = x * y;
//
//		출력:
//			다이얼로그로 띄워보세요.
		JOptionPane.showMessageDialog(null, "사각형 면적은 " + result);
	}

}
