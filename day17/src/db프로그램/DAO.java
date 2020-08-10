package db프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//응집도가 높은 것이 좋다.
//하나의 class에는 하나의 기능만 넣어 만드는 것.
//db연결 하는 역할, data access object(DAO)
public class DAO {

	public void db(String id, String pw, String name, String tel) throws Exception {
		//1. 커넥터 사용 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공.!!!");
		
		//2. shop db를 연결(url, id, pw인증)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. 인증을 통한 db연결 성공.!!!");
		
		//3. sql을 만든다
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL만들기 성공.!!!");
		
		//4. sql을 mySQL에 전송
		ps.executeUpdate();
		System.out.println("4. SQL을 mySQL에 전송 성공.!!!");
	}
}




