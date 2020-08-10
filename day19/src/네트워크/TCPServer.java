package 네트워크;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//소켓은 네트워트 전송을 하기 전화기 역할의 클래스
		//클라이언트와의 연결 승인만 담당하는 서버소켓이 필요
		ServerSocket server = new ServerSocket(9100);
		System.out.println("서버 소켓 만들어짐.");
		System.out.println("클라이언트의 요청을 기다리는 중....");
		//데이터 전송을 담당하는 소켓이 필요
		int count = 0;
		while (true) {
			Socket socket = server.accept();
			count++;
			System.out.println("연결 수: " + count + "개 클라이언트와 연결 됨.");
		}
	}
}
