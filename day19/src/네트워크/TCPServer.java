package ��Ʈ��ũ;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//������ ��Ʈ��Ʈ ������ �ϱ� ��ȭ�� ������ Ŭ����
		//Ŭ���̾�Ʈ���� ���� ���θ� ����ϴ� ���������� �ʿ�
		ServerSocket server = new ServerSocket(9100);
		System.out.println("���� ���� �������.");
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��....");
		//������ ������ ����ϴ� ������ �ʿ�
		int count = 0;
		while (true) {
			Socket socket = server.accept();
			count++;
			System.out.println("���� ��: " + count + "�� Ŭ���̾�Ʈ�� ���� ��.");
		}
	}
}
