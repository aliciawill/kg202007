package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReciever {

	public static void main(String[] args) throws Exception {
		//UDP용 socket이 필요
		DatagramSocket socket = new DatagramSocket(7000);
		System.out.println("받는 쪽 소켓 시작됨....");
		System.out.println("받을 준비 끝......");
		//전달받은 값 넣어줄 byte[]공간을 만들어줌.
		byte[] data = new byte[256];
		
		//byte[]에 넣어준 값을 가지고 봉투역할의 packet을 만든다.
		DatagramPacket packet = new DatagramPacket(data, data.length);
		//전달받은 값을 packet에 넣어둔다.
		while (true) {
			socket.receive(packet);
			//스트림을 닫는다(메모리 해제)
			String data2 = new String(data);
			System.out.println("----받은 데이터----");
			System.out.println(data2);
		}
		//socket.close();
	}

}



