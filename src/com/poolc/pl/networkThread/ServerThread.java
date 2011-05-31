package com.poolc.pl.networkThread;
import java.io.*;

import java.net.*;


public class ServerThread extends Thread {
	private Socket sock;
	private PrintWriter pw;
	private BufferedReader br;
	private FileWriter fw = null;
	
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
			String str = null;
			String filename = null;
			while((str = br.readLine()) != null) {
				
//				if ( str == ~~) {						//mobile identifier
//					filename = null;				 	//find or create filename
//					fw = new FileWriter(filename);		//open file		
//				}
//				else {
					fw.write(str);		
//				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				pw.close();
				br.close();
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			
		
	}

}
