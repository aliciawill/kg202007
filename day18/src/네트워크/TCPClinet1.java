package 네트워크;

import java.net.Socket;

public class TCPClinet1 {

	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("localhost", 9100);
		System.out.println("클라이언트 연결 성공.!!!");
	}

}
