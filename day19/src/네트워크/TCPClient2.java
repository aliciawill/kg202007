package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient2 {

	public static void main(String[] args) throws Exception {
		Socket	socket = new Socket("localhost", 9100);
		System.out.println("클라이언트2: 서버와 연결됨.");
	}

}
