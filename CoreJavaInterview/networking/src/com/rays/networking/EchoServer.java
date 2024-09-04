package com.rays.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {

		ServerSocket socket = new ServerSocket(5643);

		System.out.println("Server Started");

		Socket socket1 = null;

		boolean flag = true;

		while (flag) {
			socket1 = socket.accept();
			talk(socket1);

			socket.close();

			System.out.println("Server closed");
		}
	}

	private static void talk(Socket cSocket) throws IOException {

		PrintWriter out = new PrintWriter(cSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
		String line;
	 line = in.readLine();
		while (line != null) {
			out.println(line + "..." + line);
			if (line.equals("Bye")) {
				break;
			}
			line = in.readLine();
		}
		out.close();
		in.close();
		cSocket.close();
	}

}
