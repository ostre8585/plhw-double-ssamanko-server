package com.poolc.pl.networkThread;

import java.net.ServerSocket;
import java.net.Socket;


public class FrameworkServser {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10002);
			
			while(true) {
				Socket sock = server.accept();
				ServerThread serverThread = new ServerThread(sock);
				serverThread.start();
				
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}
			
	
	}

}
