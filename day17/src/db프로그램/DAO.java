package db���α׷�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//�������� ���� ���� ����.
//�ϳ��� class���� �ϳ��� ��ɸ� �־� ����� ��.
//db���� �ϴ� ����, data access object(DAO)
public class DAO {

	public void db(String id, String pw, String name, String tel) throws Exception {
		//1. Ŀ���� ��� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����.!!!");
		
		//2. shop db�� ����(url, id, pw����)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. ������ ���� db���� ����.!!!");
		
		//3. sql�� �����
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL����� ����.!!!");
		
		//4. sql�� mySQL�� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� mySQL�� ���� ����.!!!");
	}
}




