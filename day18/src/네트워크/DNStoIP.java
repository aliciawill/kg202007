package ��Ʈ��ũ;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNStoIP {
	//DNS-->IP: DNS Server
	public static void main(String[] args) throws Exception {
		String dns = "www.naver.com";
		InetAddress add = InetAddress.getByName(dns);
		System.out.println("IP�ּ�: " + add.getHostAddress());
	}

}
