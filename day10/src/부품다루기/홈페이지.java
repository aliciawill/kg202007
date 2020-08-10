package 부품다루기;

import javax.swing.JOptionPane;

public class 홈페이지 {

	public static void main(String[] args) {
		회원가입 member = new 회원가입();
		member.id = JOptionPane.showInputDialog("id입력");
		member.pw = JOptionPane.showInputDialog("pw입력");
		member.name = JOptionPane.showInputDialog("name입력");
		member.tel = JOptionPane.showInputDialog("tel입력");
		System.out.println("회원가입 id는 " + member.id);
		System.out.println("회원가입 pw는 " + member.pw);
		System.out.println("회원가입 name는 " + member.name);
		System.out.println("회원가입 tel는 " + member.tel);
	}
}
