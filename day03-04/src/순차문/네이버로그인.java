package 순차문;

import javax.swing.JOptionPane;

public class 네이버로그인 {

	public static void main(String[] args) {
		//ctrl + alt + 화살표아래(한줄 복사)
		//입력
		String id = JOptionPane.showInputDialog("아이디 입력"); 
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		//처리
		//가입시 정보
		String id2 = "root";
		String pw2 = "pass"; 
		//자동 주석: ctrl + /
		//여러줄 자동 주석: ctrl + shift + / 
		System.out.println(id.equals(id2));
		System.out.println(pw.equals(pw2));
		
		//조건이 여러개 있는 경우, 논리적으로 판단할 때,
		//조건들이 어떻게 되어야 하는가? 논리 연산자
		//조건이 모두 맞아야 하는 경우, and연산(&&)
		//조건이 하나만 맞아도 되는 경우, or연산(||)

		//처리 부분..변수의 선언상태는 쓰레기값상태
		//선언후에 깨끗하게 비워주거나, 뭔가를 넣어주어야 한다.
		//초기화
		//변수는 초기화한 후 사용할 수 있다.
		String result = null;//쓰레기값 들어가 있는 상태
		//맞는 경우, 맞지 않지 경우(조건문)
		if (id.equals(id2) && pw.equals(pw2)) {
			result = "로그인 ok";
		} else {
			result = "로그인 not";
		}
		
		//결과출력
		System.out.println(result); 
		//쓰레기값 들어있는 상태는 연산, 처리 불가
		
	}

}
