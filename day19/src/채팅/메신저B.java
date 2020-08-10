package 채팅;

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

public class 메신저B extends JFrame{
	JTextField input; //입력하는 부분
	JTextArea list; //입력, 받는 데이터 리스트로 만들 부분
	public 메신저B() {
		setTitle("메신저B");
		//jframe은 기본 layout이 borderlayout설정!
		input = new JTextField(30);
		list = new JTextArea(10, 30);
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		pack();
		Font font = new Font("궁서", Font.BOLD, 35);
		input.setFont(font);
		list.setFont(font);
		input.setBackground(Color.pink);
		input.setForeground(Color.red);
		list.setBackground(Color.yellow);
		list.setForeground(Color.blue);
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//1.입력한 값 가지고 와서
				//2.상대방에게 보내기
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

				//3.list에 append
				list.append("나>> " + str + "\n");
				//4.입력한 값 지우기
				input.setText("");
			}
		});
		setVisible(true);
	}
	
	public void process() throws Exception {//받는 부분, 먼저 실행되어야한다.
				DatagramSocket socket = new DatagramSocket(6000);
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				while (true) {
					socket.receive(packet);
					//스트림을 닫는다(메모리 해제)
					String data2 = new String(data);
					list.append("너>> " + data2 + "\n");
				}
	}
	
	public static void main(String[] args) throws Exception {
		메신저B m = new 메신저B();
		m.process();
	}

}
