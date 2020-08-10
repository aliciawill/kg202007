package ä��;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class �޽���B extends JFrame{
	JTextField input; //�Է��ϴ� �κ�
	JTextArea list; //�Է�, �޴� ������ ����Ʈ�� ���� �κ�
	public �޽���B() {
		setTitle("�޽���B");
		//jframe�� �⺻ layout�� borderlayout����!
		input = new JTextField(30);
		list = new JTextArea(10, 30);
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		pack();
		Font font = new Font("�ü�", Font.BOLD, 35);
		input.setFont(font);
		list.setFont(font);
		input.setBackground(Color.pink);
		input.setForeground(Color.red);
		list.setBackground(Color.yellow);
		list.setForeground(Color.blue);
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//1.�Է��� �� ������ �ͼ�
				//2.���濡�� ������
				DatagramSocket socket;
				String str = "";
				try {
					socket = new DatagramSocket();
					str = input.getText();
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);
					socket.send(packet);
				} catch (Exception e1) {
				}

				//3.list�� append
				list.append("��>> " + str + "\n");
				//4.�Է��� �� �����
				input.setText("");
			}
		});
		setVisible(true);
	}
	
	public void process() throws Exception {//�޴� �κ�, ���� ����Ǿ���Ѵ�.
				DatagramSocket socket = new DatagramSocket(6000);
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				while (true) {
					socket.receive(packet);
					//��Ʈ���� �ݴ´�(�޸� ����)
					String data2 = new String(data);
					list.append("��>> " + data2 + "\n");
				}
	}
	
	public static void main(String[] args) throws Exception {
		�޽���B m = new �޽���B();
		m.process();
	}

}
