package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient1000 {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			Socket	socket = new Socket("localhost", 9100);
			System.out.println("클라이언트:" + i + "서버와 연결됨.");
		}
	}

}
