package com.Leafqun.qq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SSocket {
	private ServerSocket server;
	public Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	
	public SSocket(){
		try {
			//��������ˣ�ָ���˿�
			server=new ServerSocket(8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void acceptClientConnection(){
		//���ܿͻ��˵���������
		try {
			socket=server.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String acceptData(){
		//��������
		String s1=null;
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			s1=br.readLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s1;
	}
	public void sendData(String s){
		try {
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write(s+"\n");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*public static void main(String[] args){
		createServer c=new createServer();
		c.acceptClientConnection();
		String s=c.acceptData();
		System.out.println(s);
	}*/
	
}
