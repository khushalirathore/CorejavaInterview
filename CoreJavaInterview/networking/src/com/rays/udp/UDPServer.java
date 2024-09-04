package com.rays.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String[] args) throws Exception {

		String[] quotes = { "Bura Mat Dekho", "Bura Mat Kaho", "Bura Mat Suno" };
		DatagramSocket socket = new DatagramSocket(4445);

		byte[] byt = new byte[256];
		DatagramPacket packet = new DatagramPacket(byt, byt.length);

		boolean flag = true;
		while (flag) {
			socket.receive(packet);
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			int ind = (int) (Math.random() * 2);
			byte[] quote = quotes[ind].getBytes();
			DatagramPacket quotePkt = new DatagramPacket(quote, quote.length, address, port);
			socket.send(quotePkt);
		}
		socket.close();
	}
}