package com.poolc.pl.networkThread;
import java.io.*;
import java.net.Socket;


public class ServerThread extends Thread {
	private Socket sock;
	private PrintWriter pw;
	private BufferedReader br;
	
	public ServerThread (Socket sock) {
		this.sock = sock;
		try {
			pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		try {
			//do something

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock != null) {
					pw.close();
					br.close();
					sock.close();
				}
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}
	}

}
