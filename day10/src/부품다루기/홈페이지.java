package ��ǰ�ٷ��;

import javax.swing.JOptionPane;

public class Ȩ������ {

	public static void main(String[] args) {
		ȸ������ member = new ȸ������();
		member.id = JOptionPane.showInputDialog("id�Է�");
		member.pw = JOptionPane.showInputDialog("pw�Է�");
		member.name = JOptionPane.showInputDialog("name�Է�");
		member.tel = JOptionPane.showInputDialog("tel�Է�");
		System.out.println("ȸ������ id�� " + member.id);
		System.out.println("ȸ������ pw�� " + member.pw);
		System.out.println("ȸ������ name�� " + member.name);
		System.out.println("ȸ������ tel�� " + member.tel);
	}
}
