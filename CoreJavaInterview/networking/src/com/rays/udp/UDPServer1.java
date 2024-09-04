package com.rays.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

public class UDPServer1 {

public static void main(String[] args) throws Exception {
		
		String[] arr = {"Bura Mat Dekho","Bura Mat Kaho","Bura Mat Suno"};
        DatagramSocket socket = new DatagramSocket(4445);

        byte[] b = new byte[256];
        DatagramPacket packet = new DatagramPacket(b, b.length);
        
        boolean flag = true;
        while (flag) {
            socket.receive(packet);
            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            int random = (int) (Math.random() * 2);
            byte[] b1 = arr[random].getBytes();
            DatagramPacket pkt = new DatagramPacket(b1, b1.length, address, port);
            socket.send(pkt);
        }
        socket.close();
	}
}