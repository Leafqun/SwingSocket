package com.Leafqun.httpServer;

import java.io.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class httpserver {
	private ServerSocket server;
	private Socket client;
	private BufferedReader br;
	/**
	 * *启动项
	 */
	public void start(){
		try {
			server=new ServerSocket(8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 **接受项
	 */
	public void receive(){
		try {
			client=server.accept();
			br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			StringBuilder sb=new StringBuilder(); 
			String msg=null;
			while((msg=br.readLine()).length()>0){
				sb.append(msg);
				sb.append("\r\n");
				if(msg==null) break;
			}
			System.out.println(sb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * *停止项
	 */
	public void stop(){
		
	}
	public static void main(String[] args){
		httpserver hs=new httpserver();
		hs.start();
		hs.receive();
	}
}
