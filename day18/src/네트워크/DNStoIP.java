package 네트워크;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNStoIP {
	//DNS-->IP: DNS Server
	public static void main(String[] args) throws Exception {
		String dns = "www.naver.com";
		InetAddress add = InetAddress.getByName(dns);
		System.out.println("IP주소: " + add.getHostAddress());
	}

}
