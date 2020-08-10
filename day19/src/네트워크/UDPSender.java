package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//UDP�� socket�ʿ�
		DatagramSocket socket = new DatagramSocket();
		//���� �����͸� String�� �ִ´�.
		String str = "I am a java programmer!!!";
		//��Ʈ��ũ ������ �ϱ� ���ؼ��� byte[]�� ������ �Ѵ�.
		byte[] data = str.getBytes();
		//���������� �� packet�� �����.
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		//packet���� �� �ʿ��� ������:�ּ�(ip,port),������(byte[], ����)
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7000);
		//socket�� �̿��ؼ� packet�� ������.
		socket.send(packet);
		//socket�� close
		socket.close();
	}

}



