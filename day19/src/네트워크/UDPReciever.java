package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReciever {

	public static void main(String[] args) throws Exception {
		//UDP�� socket�� �ʿ�
		DatagramSocket socket = new DatagramSocket(7000);
		System.out.println("�޴� �� ���� ���۵�....");
		System.out.println("���� �غ� ��......");
		//���޹��� �� �־��� byte[]������ �������.
		byte[] data = new byte[256];
		
		//byte[]�� �־��� ���� ������ ���������� packet�� �����.
		DatagramPacket packet = new DatagramPacket(data, data.length);
		//���޹��� ���� packet�� �־�д�.
		while (true) {
			socket.receive(packet);
			//��Ʈ���� �ݴ´�(�޸� ����)
			String data2 = new String(data);
			System.out.println("----���� ������----");
			System.out.println(data2);
		}
		//socket.close();
	}

}



