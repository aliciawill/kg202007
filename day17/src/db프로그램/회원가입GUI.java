package db���α׷�;

import javax.swing.JOptionPane;

public class ȸ������GUI {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("id�Է�");
		String pw = JOptionPane.showInputDialog("pw�Է�");
		String name = JOptionPane.showInputDialog("name�Է�");
		String tel = JOptionPane.showInputDialog("tel�Է�");
		DAO my = new DAO();
		my.db(id, pw, name, tel);
	}
}
