package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//UDP용 socket필요
		DatagramSocket socket = new DatagramSocket();
		//보낼 데이터를 String에 넣는다.
		String str = "I am a java programmer!!!";
		//네트워크 전송을 하기 위해서는 byte[]로 만들어야 한다.
		byte[] data = str.getBytes();
		//봉투역할을 할 packet을 만든다.
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		//packet만들 때 필요한 데이터:주소(ip,port),데이터(byte[], 길이)
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7000);
		//socket을 이용해서 packet을 보낸다.
		socket.send(packet);
		//socket을 close
		socket.close();
	}

}



