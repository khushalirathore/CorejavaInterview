package com.rays.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws Exception {

		DatagramSocket socket = new DatagramSocket();

		byte[] byt = new byte[256];

		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(byt, byt.length, address, 5643);

		socket.send(packet);

		packet = new DatagramPacket(byt, byt.length);
		socket.receive(packet);

		String received = new String(packet.getData());

		System.out.println("Quote of the Moment : " + received);
		socket.close(); // Close Socket

	}

}
