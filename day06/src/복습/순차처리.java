package 복습;

import javax.swing.JOptionPane;

public class 순차처리 {

	public static void main(String[] args) {
		//입력->처리->출력
		//입력: 다이얼로그, Scanner
		//처리: 제어문
		//출력: 다이얼로그, sysout
		
		String hour = JOptionPane.showInputDialog("지금 몇시?"); //19
		int hour2 = Integer.parseInt(hour);//"19"->19
		//비교 연산자는 기본 데이터만 가능!
		if (hour2 > 18) {
			JOptionPane.showMessageDialog(null, "퇴근 시간이 지났군요.");
		} else {
			JOptionPane.showMessageDialog(null, "퇴근 시간이 아직 안되었군요.");
		}
	}

}
